import java.util.Scanner ;

/**
 * Write a description of class Jogo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Interface
{
    Interface interface1 = this ;
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Começar? (y/n)");
        String escolha = scanner.nextLine();
        ListaDeFigurinhas albumUnicas = new ListaDeFigurinhas() ;
        ListaDeFigurinhas albumRepetidas = new ListaDeFigurinhas() ;
        while (escolha.equals("y"))
        {
            for(int i = 0; i < 10; ++i) 
            {
               NodoDeFigurinha figurinha = new NodoDeFigurinha() ;
               System.out.println(figurinha.numero);
               if (albumUnicas.contem(figurinha) == false) 
               {
                  albumUnicas.incluir(figurinha) ; 
                  System.out.println("Adicionada nas unicas");
               }
               else
               {
                  albumRepetidas.incluir(figurinha);
                  System.out.println("Repetida!");
               }
            }
            escolha = scanner.nextLine();
        }
        System.out.println("Unicas:") ;
        albumUnicas.imprimeFiguras();
        System.out.println("Repetidas:") ;
        albumRepetidas.imprimeFiguras();
    }
}
    


    