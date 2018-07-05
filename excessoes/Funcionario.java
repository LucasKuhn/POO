
public class Funcionario extends Pessoa
{
    public Funcionario(String nome)
    {
        super(nome);
    }
    
    public String apresenta()
    {
        return "funcionario "+this.getNome();
    }
}
