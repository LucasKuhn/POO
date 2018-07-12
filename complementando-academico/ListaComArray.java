import java.io.Serializable;

public class ListaComArray<T extends Comparable> implements Lista<T>, Serializable
{
    private T[] osObjetosDaLista;
    private int tamanho = 0;
    private int capacidade;

    /**
     * Construtor que recebe como parâmetro a capacidade máxima da lista.
     * O int recebido como parâmetro será usado para inicializar a variável
     * de instância capacidade.
     * 
     * @param capacidade capacidade máxima da lista.
     */
    public ListaComArray(int capacidade)
    {
        this.capacidade = capacidade ;
        osObjetosDaLista = (T[]) new Comparable[capacidade];
    }

    /**
     * Construtor sem parâmetros que determina uma capacidade padrão de 100.
     */
    public ListaComArray()
    {
        this.capacidade = 100 ;
        osObjetosDaLista = (T[]) new Object[100];
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
     * Método que procura, entre os objetos da lista, por aquele informado no parâmetro. 
     * 
     * @param obj o objeto que é o argumento da pesquisa.
     * @return o método devolve um boolean indicando se o objeto foi ou não encontrado.
     */
    public boolean pesquisa(T obj)
    {
        for(int i=0 ; i<tamanho ; i++)
        {
            if(osObjetosDaLista[i].compareTo(obj) == 0)
            {
                return true;
            }
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
        if(tamanho<capacidade)
        {
            osObjetosDaLista[tamanho] = obj ;
            tamanho++;   
        }
        else
        {
            throw new ExcecaoDeInclusaoEmListaCheia();
        }
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
    public int incluir(T aluno, int indice)    
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
    public int incluirEmOrdem(T aluno)    
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
        // complemente a implementação testando para ver se o índice é válido!
        if(indice>=0 && indice<tamanho)
        {
            return osObjetosDaLista[indice];
        }
        return null;
    }
    
    /**
     * Método que ordena os alunos que estão na lista em ordem alfabética de nome.
     */
    public void ordena()
    {
        // para implementar este método 
        // - use o método "compareTo" de String para comparar os nomes
        // - pesquise e implemente o método de "ordenação por inserção"
    }

}

