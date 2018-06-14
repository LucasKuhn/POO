import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileFunctions
{

    public static void main( String [] args )
    {
        // create ArrayList to store the invetory objects
        Jogador[] jogadores = new Jogador[10] ;
        
        BufferedReader br = null;
        FileReader fr = null;
        try
        {
            // create a Buffered Reader object instance with a lineReader
            fr = new FileReader("/Users/lucaskuhn/Dev/ucs/figurinhas/entrada.txt");
            br = new BufferedReader(fr);


            // read the first line from the text file
            String lineRead = br.readLine();

            // loop until all lines are read
            while (lineRead != null)
            {
                if ( lineRead.startsWith("_") )
                {
                    int numeroArray = Integer.parseInt(lineRead.substring(1));
                    String nome = br.readLine();
                    String numeroTelefone = br.readLine();
                    Jogador jogador = new Jogador(nome,numeroTelefone);
                    jogadores[numeroArray] = jogador;
                    lineRead = br.readLine();
                    if ( lineRead.equals("Figurinhas") )
                    {
                        lineRead = br.readLine();
                        while ( lineRead != null && !lineRead.startsWith("_") )
                        {
                            int numeroDaFigurinha = Integer.parseInt(lineRead);
                            NodoDeFigurinha figurinha = new NodoDeFigurinha(numeroDaFigurinha) ;
                            jogador.incluiFigurinha(figurinha) ;
                            lineRead = br.readLine();
                        }
                    }
                }
            }

            // close file stream
            br.close();
        }

        // handle exceptions
        catch (FileNotFoundException fnfe)
        {
            System.out.println("file not found");
        }

        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        
    }

}