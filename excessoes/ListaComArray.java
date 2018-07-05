public class ListaComArray<T> 
{
    private T[] osObjetosDaLista;
    private int tamanho = 0;
    private int capacidade;

    public ListaComArray(int capacidade)
    {
        this.capacidade = capacidade ;
        osObjetosDaLista = (T[]) new Object[capacidade];
    }

    public int tamanho()
    {
        return tamanho ;
    }

    
    /**
     * Método para incluir objto no final da lista. O método verifica
     * se a lista está cheia.
     * 
     * @param obj um objeto para ser incluí­do na lista
     * @return o método retorna um código int para informar o resultado da inclusão.
     * O código pode ser:
     * 0 - inclusão com sucesso
     * 1 - lista cheia, portanto a inclusão não acontece
     */
    public void incluir(T obj) throws ExcessaoDeListaCheia
    {
        if(tamanho<capacidade)
        {
            osObjetosDaLista[tamanho] = obj ;
            tamanho++;
        }
        else 
        {
            throw new ExcessaoDeListaCheia();
        }
    }

    public T get(int indice)
    {
        // complemente a implementaÃ§Ã£o testando para ver se o Ã­ndice Ã© vÃ¡lido!
        if(indice>=0 && indice<tamanho)
        {
            return osObjetosDaLista[indice];
        }
        return null;
    }

}