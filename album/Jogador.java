
/**
 * Write a description of class Jogador here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jogador
{
    // instance variables - replace the example below with your own
    public ListaDeFigurinhas albumUnicas = new ListaDeFigurinhas() ;;
    public ListaDeFigurinhas albumRepetidas = new ListaDeFigurinhas() ;;
    public String nome ;
    public String numero ;
    
    public Jogador(String nome, String numero) {
        this.numero = numero ;
        this.nome = nome ;
    }
    
    public void incluiFigurinha(NodoDeFigurinha figurinha){
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
}
