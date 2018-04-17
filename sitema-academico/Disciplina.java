public class Disciplina
{
    public String nome ;
    private Professor professor ;
    private String codigo ;
    private ListaDeAlunos alunosDaDisciplina ;
    
    public Disciplina()
    {
    }
    
    public Disciplina(String nome)
    {
        this.nome = nome ;
    }
    
    public Disciplina(String nome, int vagas)
    {
        this.alunosDaDisciplina = new ListaDeAlunos(vagas) ;
    }
    
    public void matriculaAluno(Aluno novoAluno)
    {
        this.alunosDaDisciplina.incluir(novoAluno);
    }
    
    public String getNome(String nome)
    {
        return this.nome ;
    }
    
    public void setQuantidadeVagas(int vagas)
    {
        this.alunosDaDisciplina.setCapacidade(vagas);
    }
    
    public int getQuantidadeVagas(int vagas)
    {
        return this.alunosDaDisciplina.getCapacidade();    
    }
    
    public int getQuantidadeAlunos(int vagas)
    {
        return this.alunosDaDisciplina.tamanho();    
    }
}
