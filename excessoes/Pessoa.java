public abstract class Pessoa 
{
    private String nome ;
    private String endereco ;

    public Pessoa(String nome, String endereco)
    {
        this.nome = nome;
        this.endereco = endereco ;
        System.out.println("na classe Pessoa ");

    }
  
    public Pessoa(String nome)
    {
        this.nome = nome;
        System.out.println("na classe Pessoa ");
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public abstract String apresenta();
    
}
