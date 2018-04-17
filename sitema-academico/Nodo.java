public class Nodo
{
    private Aluno info ; 
    private Nodo prox ;
    
    public Nodo(Aluno info) {
        this.info = info ;
    }

    public void setInfo(Aluno info) {
        this.info = info ;
    }
    
    public Nodo getProx() {
        return this.prox ;
    }
    
    public Aluno getInfo() {
        return info ;
    }
    
    public void setProx(Nodo inicio) {
        this.prox = inicio ;
        return ;
    }
}
