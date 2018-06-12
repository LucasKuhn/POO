public class Aluno extends Pessoa
{
    private String curso ;
    private int numeroDeDisciplinas ;
    public Aluno(String nome, String curso)
    {
        super(nome);
        this.curso = curso ;
    }
    
    // Apresenta com nome + número de disciplinas que está cursando
    public String apresenta()
    {
        return this.getNome()+curso+numeroDeDisciplinas;
    }
}
