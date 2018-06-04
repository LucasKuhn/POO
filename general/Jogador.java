public class Jogador
{
    private String nome;
    private int quantidadeDeVitorias ;
    private int quantidadeDeDerrotas ;
    private int quantidadeDeEmpates ;
    private Copo copo ;
        
    public Jogador(String nome)
    {
        this.nome = nome ; 
        this.copo = new Copo() ; 
    }
    
    public Copo getCopo()
    {
        return this.copo ; 
    }

    public int sampleMethod(int y)
    {
        return 0;
    }
    
    public void mostraDados() {
        this.copo.mostraDados() ;
    }
    
    public void rolaNovamente(int[] dadosSelecionados, int quantidadeDeDados) {
        this.copo.rolaNovamente(dadosSelecionados, quantidadeDeDados);
    }
}