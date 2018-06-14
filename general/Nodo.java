public class Nodo<E>
{
    private E info ; 
    private Nodo prox ;
    
    public Nodo() {
        this.info = null ;
    }
    
    public Nodo(E info) {
        this.info = info ;
    }

    public void setInfo(E info) {
        this.info = info ;
    }
    
    public Nodo getProx() {
        return this.prox ;
    }
    
    public E getInfo() {
        return info ;
    }
    
    public void setProx(Nodo inicio) {
        this.prox = inicio ;
        return ;
    }
}
