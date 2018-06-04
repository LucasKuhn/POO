    /** 
     * 
     * Convenção para retorno dos métodos de inclusão:
     * 0 - Inclusão com sucesso 
     * 1 - Indice inválido 
     * 2 - Capacidade excedida
     * 3 - Aluno já existe
     * 
     * @author Lucas
     * @version 12/04
     */ 
public class ListaComEncadeamento<T>
{   
    private Nodo<T> inicio = null ;
    private Nodo<T> fim = null ;
    private int tamanho;
    private int capacidade;
    
    public ListaComEncadeamento()
    {
        this.capacidade = 100 ;
    }
    
    public ListaComEncadeamento(int capacidade)
    {
        this.capacidade = capacidade ;
    }
    
    public T get(int index)
    {
        Nodo<T> temp = this.inicio ;
        int i = 0 ;
        while (temp.getProx() != null) {
            temp = temp.getProx() ;
            i++ ;
            if (i == index) {
                return temp.getInfo() ;
            }
        }
        return null ;
    }
    
    public int getCapacidade()
    {
        return this.capacidade;
    }
    
    public int setCapacidade(int capacidade)
    {
        return this.capacidade = capacidade;
    }
    
    public int incluir(T novoObjeto) 
    {
        if ( this.tamanho >= this.capacidade){
            return 2;
        }
        
        //if ( this.contem(novoObjeto.nome) != null ){
        //    return 3;
        //}
       
        Nodo temp = new Nodo(novoObjeto);
        if ( this.tamanho == 0 ) {
            this.inicio = this.fim = temp;
        }
        else {
            this.fim.setProx(temp) ;
            this.fim = temp ;
        }
        this.tamanho++ ;
        return 0 ;
    }    
    
    
    
    public int incluir(T novoObjeto, int index) 
    {
        //if ( this.contem(novoObjeto.nome) != null ){
        //    return 3; // Aluno já existe
        //}
        
        if ( this.tamanho >= this.capacidade){
            return 2; // Capacidade Excedida
        }        
        
        if ( index < 0 || index > this.tamanho ){
            return 1; // Indice inválido
        }   
        
        if ( index == this.tamanho ) // Ultima posição
        {  
            return this.incluir(novoObjeto) ;
        }
        
        Nodo temp = this.inicio ;
        int i = 0 ;
         while (true) 
        {
            if (i == index) 
            { 
                Nodo<T> novoNodo = new Nodo<T>(novoObjeto) ;
                if (index == 0) // Primeira posição
                { 
                    novoNodo.setProx(temp) ;
                    this.inicio = novoNodo ;
                }
                else 
                {
                     novoNodo.setProx(temp.getProx()) ;
                     temp.setProx(novoNodo) ;
                     this.fim = novoNodo ;
                }
                return 0 ;
            }
            temp = temp.getProx() ;
            i++ ;
        }
    }  
    
    public boolean vazia() 
    {
        return this.tamanho == 0 ;
    }  
    
    public int tamanho()
    {
        return this.tamanho;
    }
    
    
    /**
     * Metodo para encontrar um aluno através do nome do aluno.
     * @param nome Nome do aluno que deve ser procurado
     * @return o aluno casa o encontre ou null
     */
    /**
    public Aluno contem(String nomeDoAluno)
    {
        Nodo<T> temp = this.inicio ;
        while (temp != null) {
            if (temp.getInfo().nome.equals(nomeDoAluno)) {
                return temp.getInfo() ;
            }
            temp = temp.getProx();
        }
        return null;
    }*/
    
    /**public boolean ordernar()
    {
        // Bubble Sort
        Nodo temp = this.inicio ; 
        boolean trocou = true ;
        while (trocou)
        {
            temp = this.inicio ; 
            trocou = true ;
            while(trocou)
            {
                if (temp.getInfo().nome == temp.getProx().getInfo().nome) {
                    alunoAuxiliar = this.alunosDaLista[i];
                    this.alunosDaLista[i] = this.alunosDaLista[j];
                    this.alunosDaLista[j] = alunoAuxiliar;
                }
            }
        }
        for (int i = 0; i < this.tamanho; i++) {
            for (int j = i + 1; j < this.tamanho; j++) {
                Aluno alunoAuxiliar ;
                
            }
        }
        return true ;
    }*/
}