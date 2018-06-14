import java.util.Random;
public class NodoDeFigurinha
{
    int numero ; 
    private NodoDeFigurinha prox = null ;
    private NodoDeFigurinha ant = null ;
    Random random = new Random();
    
    public NodoDeFigurinha() {
        this.numero = random.nextInt(30) + 1 ;  
    }
    
    public NodoDeFigurinha(int numero) {
        this.numero = numero ;  
    }
    
    public void setNumero(int numero) {
        this.numero = numero ;
    }
    
    public NodoDeFigurinha getProx() {
        return this.prox ;
    }
    
    public NodoDeFigurinha getAnt() {
        return this.ant ;
    }
    
    public void setProx(NodoDeFigurinha prox) {
        this.prox = prox ;
        return ;
    }
    
    public void setAnt(NodoDeFigurinha ant) {
        this.ant = ant ;
        return ;
    }
}
