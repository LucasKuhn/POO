import java.io.Serializable;

public class Disciplina implements Serializable
{
    private String codigo ;
    private String nome  ;
    private String horario ;
    private Pessoa prof ;
    private int vagas ;
    private ListaComEncadeamento<Pessoa> alunosMatriculados = new ListaComEncadeamento<Pessoa>(100);
    
    public Disciplina(String codigo, String nome, int vagas)
    {
        this.codigo = codigo ;
        this.nome = nome;
        this.vagas = vagas ;
    }

    public String getCodigo()
    {
        return codigo ;
    }

    public boolean matricular(Pessoa aluno)
    {
        if(alunosMatriculados.tamanho()<vagas)
        {
            try
            {
                alunosMatriculados.incluir(aluno);
                return true;
            }
            catch(ExcecaoDeInclusaoEmListaCheia e)
            {
                 System.out.println(e.msgErro());
            }            
        }
        return false;
    }
    
    public int vagasRestantes()
    {
        return vagas-alunosMatriculados.tamanho();
    }

}

