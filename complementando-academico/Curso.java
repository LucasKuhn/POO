import java.io.Serializable;

public class Curso implements Comparable<Curso>, Serializable
{
    private String nome ;
    private String codigo ;

    public String getNome()
    {
        return this.nome ;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome ;
    }
    
    @Override
    public int compareTo(Curso other) {
        return codigo.compareTo(other.codigo) ;
    }
}
