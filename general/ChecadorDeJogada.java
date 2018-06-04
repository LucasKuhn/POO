import java.util.*;

public class ChecadorDeJogada
{
    private int[] array ;
    private boolean reversed = false ;
    
    public ChecadorDeJogada(Copo copo)
    {
        this.array = new int[copo.getDados().length] ;
        for (int i = 0; i < copo.getDados().length; i++) 
        {
            this.array[i] = copo.getDados()[i].valor ;
        }
        Arrays.sort(this.array) ;
    }
    
    public int validaSequencia()
    {
        for (int i = 0; i < this.array.length - 1; i++) 
        {
            if (array[i] != array[i+1] - 1) {
                if ( !reversed )
                {
                    reverseArray(array) ;
                    this.validaSequencia() ;
                }
                else 
                {
                    return 0;
                }
            } 
        }
        return 20 ;
    }
    
    public int validaFullHand()
    {
        int total = 0 ;
        for (int i = 0; i < 2; i++) 
        {
            if (array[i] != array[i+1]) {
                if ( !reversed )
                {
                    reverseArray(array) ;
                    this.validaFullHand() ;
                }
                else 
                {
                    return 0;
                }
            } 
            total += array[i] * 3;
        }
        for (int i = 3; i < 5; i++) 
        {
            if (array[3] != array[4]) {
                return 0;
            } 
            total += array[i] * 2;
        }
        return total + 30;
    }
    
    public int validaQuadra()
    {
        int total = 0 ;
        for (int i = 0; i < 3; i++) 
        {
            if (array[i] != array[i+1]) {
                if ( !reversed )
                {
                    reverseArray(array) ;
                    this.validaQuadra() ;
                }
                else 
                {
                    return 0;
                }
            }
            total += array[i] * 4;
        }
        return total + 40;
    }
    
    public int validaGeneral()
    {
        int total = 0 ;
        for (int i = 0; i < this.array.length; i++) 
        {
            if (i < 4 && array[i] != array[i+1]) {
                if ( !reversed )
                {
                    reverseArray(array) ;
                    this.validaGeneral() ;
                }
                else 
                {
                    return 0;
                }
            }
            total += array[i] * 5;
        }
        return total + 50;
    }
    
    public void reverseArray(int[] array)
    {
        for(int i=0; i < array.length/2 ; i++)
        { 
            int temp = array[i]; 
            this.array[i] = this.array[array.length -i -1]; 
            this.array[array.length -i -1] = temp; 
        }
        this.reversed = true ;
    }
}
