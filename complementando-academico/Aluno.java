import java.io.Serializable;

public class Aluno extends Pessoa implements Comparable<Pessoa>, Serializable
{
    private String nome;
    private String endereco;
    private String cpf;
    
    public Aluno(String nome)
    {
        this.nome = nome;
    }

    public Aluno(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;        
    }
    
    public Aluno()
    {
    }   
    
    @Override
    public int compareTo(Pessoa other) {
        return nome.compareTo(other.nome) ;
    }
}
