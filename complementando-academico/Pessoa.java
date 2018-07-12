import java.io.Serializable;

public abstract class Pessoa implements Comparable<Pessoa>, Serializable
{
    String nome ;
    String cpf ;
    Curso curso ;
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome ;
    }
    
    public String getCpf()
    {
        return cpf;
    }
    
    public void setCpf(String cpfDoAluno)
    {
        cpf = cpfDoAluno ;
    }
    
    public void setMeuCurso(Curso cursoDoAluno)
    {
        curso = cursoDoAluno ;
    }
    
    public Curso getMeuCurso()
    {
        return curso ;
    }
    
    @Override
    public int compareTo(Pessoa other) {
        return nome.compareTo(other.nome) ;
    }
}
