
/**
 * Write a description of class Copo here.
 *
 * @author Lucas
 * @version 1
 */
public class Copo
{
    private Dado[] dados;

    /**
     * Constructor for objects of class Copo
     */
    public Copo()
    {
        this.dados = new Dado[5] ;
        rolaDados() ;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
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
    
    public void rolaNovamente(int numeroDoDado)
    {
        int indiceDoDado = numeroDoDado - 1 ;
        Dado temp = new Dado();
        dados[indiceDoDado] = temp;
        return ;
    }
}
