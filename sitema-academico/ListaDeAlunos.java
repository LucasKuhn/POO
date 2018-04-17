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
public class ListaDeAlunos
{   
    private Nodo inicio = null ;
    private int tamanho;
    private int capacidade;
    
    public ListaDeAlunos()
    {
        this.capacidade = -1 ;
    }
    
    public ListaDeAlunos(int capacidade)
    {
        this.capacidade = capacidade ;
    }
    
    public Aluno getAluno(int index)
    {
        return this.alunosDaLista[index];
    }
    
    public int getCapacidade()
    {
        return this.capacidade;
    }
    
    public int setCapacidade(int capacidade)
    {
        return this.capacidade = capacidade;
    }
    
    public int incluir(Aluno novoAluno) 
    {
        if ( this.tamanho >= this.capacidade){
            return 2;
        }
        
        if ( this.contem(novoAluno.nome) != null ){
            return 3;
        }
        
        Nodo temp = new Nodo(novoAluno);
        temp.setProx(inicio);
        inicio = temp;
        this.tamanho++ ;
        return 0;
    }    
    
    public int incluir(Aluno novoAluno, int index) 
    {
        if ( this.contem(novoAluno.nome) != null ){
            return 3;
        }
        
        if ( this.tamanho >= this.capacidade){
            return 2;
        }        
        
        if ( this.tamanho+1 != index){
            return 1;
        }   
        this.alunosDaLista[index] = novoAluno;
        return 0;
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
    public Aluno contem(String nomeDoAluno)
    {
        for(int i = 0; i < this.tamanho ; i++)
        {
          if(this.alunosDaLista[i].nome.equals(nomeDoAluno))
          {
             return this.alunosDaLista[i];
          }
        }
        return null;
    }
    
    public boolean ordernar()
    {
        // Bubble Sort
        for (int i = 0; i < this.tamanho; i++) {
            for (int j = i + 1; j < this.tamanho; j++) {
                Aluno alunoAuxiliar ;
                if (this.alunosDaLista[i].nome == this.alunosDaLista[j].nome) {
                    alunoAuxiliar = this.alunosDaLista[i];
                    this.alunosDaLista[i] = this.alunosDaLista[j];
                    this.alunosDaLista[j] = alunoAuxiliar;
                }
            }
        }
        return true ;
    }
}
