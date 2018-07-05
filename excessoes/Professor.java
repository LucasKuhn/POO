public class Professor extends Pessoa
{
    private String cursoMinistrado;
    
    public Professor(String nome,String cursoMinistrado)
    {
        super(nome);
        this.cursoMinistrado = cursoMinistrado;
        //System.out.println("na classe Professsor");
    }
    
    public String getCursoMinistrado()
    {
        return cursoMinistrado;
    }
    
    public String apresenta()
    {
        return "professor "+this.getNome()+" "+cursoMinistrado;
    }
}
