import java.util.Arrays;

public class ChecagemDeJogada
{
    private Copo copo ;
    private Dado[] dados ;
    private int[] array ;
    public ChecagemDeJogada(Copo copo)
    {
        this.copo = copo ;
        this.dados = this.copo.getDados();
        this.array = new int[this.dados.length] ;
        for (int i = 0; i < this.dados.length; i++) 
        {
            this.array[i] = this.dados[i].valor ;
        }
    }
    
    public int validaSequencia()
    {
        Arrays.sort(this.array) ;
        for (int i = 0; i < this.array.length - 1; i++) 
        {
            if (array[i] != array[i+1] + 1) {
                return 0;
            } 
        }
        return 20 ;
    }
}
