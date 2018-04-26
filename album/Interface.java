import java.util.Scanner ;
import java.util.Random;
/**
 * Write a description of class Jogo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Interface
{
    
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Começar? (y/n)");
        String escolha = scanner.nextLine();
        while (escolha.equals("y"))
        {
            int carta = random.nextInt(30) + 1 ;     
            System.out.println(carta);
            escolha = scanner.nextLine();
        }

    }
}
