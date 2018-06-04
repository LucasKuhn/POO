import java.util.Random;
/**
 * Write a description of class Dado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dado
{
    int valor ;
    Random random = new Random();
    
    public Dado()
    {
        this.valor = random.nextInt(6) + 1 ;
    }

    public Dado(int valor)
    {
        this.valor = valor ;
    }
    
    public void rola()
    {
        this.valor = valor ;
    }
}
