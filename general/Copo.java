import java.util.Arrays;

/**
 * Write a description of class Copo here.
 *
 * @author Lucas
 * @version 1
 */
public class Copo
{
    private Dado[] dados;

    public Copo()
    {
        this.dados = new Dado[5] ;
        this.rolaDados();
    }
    
    public void fazSequencia()
    {
        for(int i = 0; i < 5; ++i)
        {
            Dado temp = new Dado(i+1);
            dados[i] = temp;
        }
    }
    
    public void fazFullHand()
    {
        for(int i = 0; i < 2; ++i)
        {
            Dado temp = new Dado(3);
            dados[i] = temp;
        }
        for(int i = 3; i < 5; ++i)
        {
            Dado temp = new Dado(5);
            dados[i] = temp;
        }
    }
    
    public void fazQuadra()
    {
        for(int i = 0; i < 4; ++i)
        {
            Dado temp = new Dado(4);
            dados[i] = temp;
        }
    }
    
    public void fazGeneral()
    {
        for(int i = 0; i < 5; ++i)
        {
            Dado temp = new Dado(5);
            dados[i] = temp;
        }
    }

    public void rolaDados()
    {
        for(int i = 0; i < 5; ++i)
        {
            Dado temp = new Dado();
            dados[i] = temp;
        }
    }
    
    public void mostraDados()
    {
        for(int i = 0; i < 5; ++i)
        {
            System.out.println("Dado " + (i+1) + ": " + this.getDado(i).valor);
        }
    }
    
    public Dado[] getDados()
    {
        return this.dados;
    }
    
    public Dado getDado(int indice)
    {
        return dados[indice] ;
    }
    
    public Dado setDado(int indice, int valor)
    {
        return this.dados[indice] = new Dado(valor) ;
    }
    
    public void rolaNovamente(int numeroDoDado)
    {
        int indiceDoDado = numeroDoDado - 1 ;
        Dado temp = new Dado();
        dados[indiceDoDado] = temp;
        return ;
    }
    
    public void rolaNovamente(int[] dadosSelecionados, int quantidadeDeDados)
    {
        for(int i = 0; i < quantidadeDeDados; ++i)
        {
            Dado temp = new Dado();
            dados[dadosSelecionados[i]] = temp;
        }
        return ;
    }
}
