import java.util.Scanner ;
/**
 * Write a description of class Jogo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jogo
{
    
    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Começar? (y/n)");
        String digitado = entrada.nextLine();
        while (digitado.equals("y"))
        {
            Dado dado1 = new Dado();
            System.out.println(dado1.valor);
            digitado = entrada.nextLine();
        }

    }
}
