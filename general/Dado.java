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
    public Dado()
    {
        Random random = new Random();
        this.valor = random.nextInt(6) + 1 ;
    }
}
