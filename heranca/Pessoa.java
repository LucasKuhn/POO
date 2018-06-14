public abstract class Pessoa
{
    private String nome ; 
    protected String endereço ; 
    
    public Pessoa(String nome)
    {
        this.nome = nome ;
    }
    
    public Pessoa(String nome, String endereço)
    {
        this.nome = nome ;
        this.endereço = endereço ;
    }
    
    public String getNome()
    {
        return this.nome ;
    }
    
    public abstract String apresenta();
}
