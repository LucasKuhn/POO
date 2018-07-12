import java.io.Serializable;

public interface Lista<T>
{
    int tamanho();
    boolean pesquisa(T obj);
    void incluir(T obj) throws ExcecaoDeInclusaoEmListaCheia;
    T get(int i);
}
