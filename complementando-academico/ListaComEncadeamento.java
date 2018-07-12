import java.io.Serializable;

/**
 * Uma implementação de lista com encadeamento.
 * 
 * @version 19/04
 * @author Marcos
 */
public class ListaComEncadeamento<T> implements Lista<T>, Serializable
{
    private int tamanho = 0;
    private int capacidade ;
    private Nodo inicio = null ;
    private Nodo fim = null ;

    /**
     * Construtor que recebe como parâmetro a capacidade máxima da lista.
     * O int recebido como parâmetro será usado para inicializar a variável
     * de instância capacidade.
     * 
     * @param capacidade capacidade máxima da lista.
     */
    public ListaComEncadeamento(int capacidade)
    {
        this.capacidade = capacidade ;
    }

    /**
     * Construtor sem parâmetros que determina uma capacidade ilimitada!
     */
    public ListaComEncadeamento()
    {
        // que valor poderia ser atribuído à capacidade?
        this.capacidade = -1 ;
    }

    /**
     * Método que retorna o tamanho da lista. Entende-se tamanho como 
     * a quantidade de objetos que estão na lista (e não a capacidade máxima dela!)
     * 
     * @return a quantidade de objetos que estão na lista
     */
    public int tamanho()
    {
        return tamanho ;
    }

    /**
     * Método que procura, entre os objetos Aluno que estão na lista, por um Aluno 
     * com o cpf informado no parâmetro. 
     * 
     * @param cpf o String cpf é o argumento da pesquisa.
     * @return o método devolve um objeto Aluno. Se um aluno com o cpf não é encontrado,
     * o método retorna null
     */
    public boolean pesquisa(T obj)
    {
        Nodo temp = inicio ;
        while(temp!=null)
        {
            if(temp.getInfo()==obj)
            {
                return true;
            }           
            temp = temp.getProximo();
        }
        return false;
    }

    /**
     * Método para incluir um Aluno no final da lista. O método verifica
     * se a lista já está cheia e se o aluno já não está na lista (pelo cpf)
     * 
     * @param aluno um objeto Aluno para ser incluído na lista
     * @return o método retorna um código int para informar o resultado da inclusão.
     * O código pode ser:
     * 0 - inclusão com sucesso
     * 1 - lista cheia, portanto a inclusão não acontece
     * 2 - já há um aluno com o mesmo cpf do aluno passado como parâmetro
     */
    public void incluir(T obj) throws ExcecaoDeInclusaoEmListaCheia
    {
        if(tamanho==capacidade)
        {
            throw new ExcecaoDeInclusaoEmListaCheia();
        }
        if(this.pesquisa(obj))
        {
            throw new ExcecaoDeInclusaoEmListaCheia(); // Deveria throw excessao de aluno encontrado
        }       
        Nodo temp = new Nodo();
        temp.setInfo(obj);
        if(tamanho==0)
        {
            inicio = temp ;
        }
        else
        {
            fim.setProximo(temp);
        }
        fim = temp;
        tamanho++;
    }

    /**
     * Método para incluir um Aluno em um índice específico da lista, informado no parâmetro.
     * O método verifica se a lista já está cheia, se o aluno já não está na lista (pelo cpf)
     * e se o índice informado está no campo de índices possíveis: maior ou igual a zero e 
     * menor ou igual ao tamanho da lista.
     * 
     * @param aluno um objeto Aluno para ser incluído na lista
     * @param indice uma posição específica na lista onde o Aluno deve ser incluído
     * @return o método retorna um código int para informar o resultado da inclusão.
     * O código pode ser:
     * 0 - inclusão com sucesso
     * 1 - lista cheia, portanto a inclusão não acontece
     * 2 - já há um aluno com o mesmo cpf do aluno passado como parâmetro
     * 3 - o índice informado não é válido
     */    
    public int incluir(T obj, int indice)    
    {
        // método para implementar

        return 0;
    }

    /**
     * Método para incluir um Aluno em uma lista já ordenada (!!), mantendo a ordem alfabética de nome.
     * O método verifica se a lista já está cheia e se o aluno já não está na lista (pelo cpf).
     * 
     * @param aluno um objeto Aluno para ser incluído na lista mantendo a ordem
     * @return o método retorna um código int para informar o resultado da inclusão.
     * O código pode ser:
     * 0 - inclusão com sucesso
     * 1 - lista cheia, portanto a inclusão não acontece
     * 2 - já há um aluno com o mesmo cpf do aluno passado como parâmetro
     */    
    public int incluirEmOrdem(T obj)    
    {
        // método para implementar
        return 0;
    }

    /**
     * Método que retorna o objeto Aluno que está em um índice específico da lista.
     * 
     * @param indice um índice da lista de onde se deve obter o Aluno
     * @return o objeto Aluno que está no índice especificado no parâmetro, ou null 
     * caso o índice não seja válido (fora dos índices ocupados por alunos na lista)
     */
    public T get(int indice)
    {
        if(indice>=0 && indice<tamanho)
        {
            Nodo temp = inicio;
            for(int i=0 ; i<indice ;i++)
            {
                temp = temp.getProximo();
            }
            return temp.getInfo();
        }
        return null;
    }

    /**
     * Método que ordena os alunos que estão na lista em ordem alfabética de nome.
     */
    public void ordena()
    {
        // como implementar este método em uma lista encadeada?? 
        // - use o método "compareTo" de String para comparar os nomes
        // - pesquise e implemente o método de "ordenação por inserção"

    }

    private class Nodo implements Serializable
    {
        private T info ;
        private Nodo proximo ;

        public void setInfo(T obj)
        {
            this.info = obj;
        }

        public T getInfo()
        {
            return this.info ;
        }

        public void setProximo(Nodo nodo)
        {
            this.proximo = nodo;
        }

        public Nodo getProximo()
        {
            return this.proximo ;
        }
    }

}
