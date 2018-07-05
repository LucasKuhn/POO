public class Aluno extends Pessoa
{
    private int numeroDeDisciplinas;
    
    public Aluno(String nome,int numeroDeDisciplinas)
    {
        super(nome);
        this.numeroDeDisciplinas = numeroDeDisciplinas;
    }
    
    public String apresenta()
    {
        return "aluno "+this.getNome()+" "+numeroDeDisciplinas;
    }
    
}
