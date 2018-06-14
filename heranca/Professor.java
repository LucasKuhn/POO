public class Professor extends Pessoa
{
    private String cursoMinistrado ;
    public Professor(String nome, String cursoMinistrado)
    {
        super(nome);
        this.cursoMinistrado = cursoMinistrado ;
    }
    
    // Apresenta com nome + número de disciplinas que está cursando
    public String apresenta()
    {
        return "Professor " + this.getNome() + " está ministrando "  + cursoMinistrado ;
    }
}