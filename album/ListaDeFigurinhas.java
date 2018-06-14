
/**
 * Write a description of class ListaDeFigurinhas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ListaDeFigurinhas
{
    NodoDeFigurinha inicio = null ; 
    NodoDeFigurinha fim = null ; 
    
    public void incluirPrimeira(NodoDeFigurinha figurinha) {
        this.inicio = figurinha ;
        this.fim = figurinha ;
    }
    
    public void incluir(NodoDeFigurinha figurinha) {
        if (this.inicio == null)
        {
            this.incluirPrimeira(figurinha) ;
        }
        else
        {
            this.fim.setProx(figurinha) ;
            figurinha.setAnt(this.inicio) ; 
            this.fim = figurinha ;
        }
    }
    
    public boolean contem(NodoDeFigurinha figurinha) {
        NodoDeFigurinha temp = this.inicio ;
        if (temp == null) 
        {
            return false ;
        }
        while (temp.getProx() != null)
        {
            if (temp.numero == figurinha.numero) 
            {
                break ;
            }
            temp = temp.getProx() ;
        }
        if (temp.numero == figurinha.numero) 
        {
            return true ;
        }
        else
        {
            return false ;
        }
    }
    
    public void imprimeFiguras() {
        NodoDeFigurinha temp = this.inicio ;
        if (temp == null) 
        {
            return ;
        }
        while (temp.getProx() != null)
        {
            System.out.println(temp.numero);
            temp = temp.getProx() ;
        }
        return ;
    }
}
