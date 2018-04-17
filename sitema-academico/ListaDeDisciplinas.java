public class ListaDeDisciplinas
{
    // Convenção para retorno dos métodos de inclusão:
    // 0 - Inclusão com sucesso 
    // 1 - Indice inválido 
    // 2 - Capacidade excedida
    // 3 - ADisciplina já existe
    
    private Disciplina[] disciplinasDaLista;
    private int tamanho;
    private int capacidade;
    
    public ListaDeDisciplinas()
    {
        this.capacidade = 100 ;
        disciplinasDaLista = new Disciplina[capacidade] ;
    }
    
    public ListaDeDisciplinas(int capacidade)
    {
        this.capacidade = capacidade ;
        disciplinasDaLista = new Disciplina[capacidade] ;
    }
    
    public Disciplina getDisciplina(int indice)
    {
        return this.disciplinasDaLista[indice];
    }
    
    public int incluir(Disciplina novaDisciplina) 
    {
        if ( this.tamanho >= this.capacidade){
            return 2;
        }
        
        if ( this.contem(novaDisciplina.nome) != null ){
            return 3;
        }
        
        this.disciplinasDaLista[tamanho] = novaDisciplina ;
        this.tamanho++ ;
        return 0;
    }    
    
    public int incluir(Disciplina novaDisciplina, int index) 
    {
        if ( this.contem(novaDisciplina.nome) != null ){
            return 3;
        }
        
        if ( this.tamanho >= this.capacidade){
            return 2;
        }        
        
        if ( this.tamanho+1 != index){
            return 1;
        }   
        this.disciplinasDaLista[index] = novaDisciplina;
        return 0;
    }  
    
    public boolean vazia() 
    {
        return this.tamanho == 0 ;
    }  
    
    public int tamanho()
    {
        return this.disciplinasDaLista.length;
    }
    
    public Disciplina contem(String nomeDoDisciplina)
    {
        for(int i = 0; i < this.tamanho ; i++)
        {
          if(this.disciplinasDaLista[i].nome.equals(nomeDoDisciplina))
          {
             return this.disciplinasDaLista[i];
          }
        }
        return null;
    }
    
    public boolean ordernar()
    {
        // Bubble Sort
        for (int i = 0; i < this.tamanho; i++) {
            for (int j = i + 1; j < this.tamanho; j++) {
                Disciplina DisciplinaAuxiliar ;
                if (this.disciplinasDaLista[i].nome == this.disciplinasDaLista[j].nome) {
                    DisciplinaAuxiliar = this.disciplinasDaLista[i];
                    this.disciplinasDaLista[i] = this.disciplinasDaLista[j];
                    this.disciplinasDaLista[j] = DisciplinaAuxiliar;
                }
            }
        }
        return true ;
    }
}
