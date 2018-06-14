public class Aluno extends Pessoa
{
    private int numeroDeDisciplinas ;
    public Aluno(String nome, int numeroDeDisciplinas)
    {
        super(nome);
        this.numeroDeDisciplinas = numeroDeDisciplinas ;
    }
    
    // Apresenta com nome + número de disciplinas que está cursando
    public String apresenta()
    {
        return "Aluno " + this.getNome() + " está cursando "  + numeroDeDisciplinas + " disciplinas";
    }
}
