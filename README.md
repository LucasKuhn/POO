# Programação Orientada a Objectos

## Herança
Os tipos da subclasse devem ser compatíveis com os tipos da Herança
```java
public class Mamifero
{
    boolean sangueQuente = true ;
    boolean glandulasMamarias = true ;
}

public class Humano extends Mamifero
{
    boolean ableToUseTools = true ;
}
```

Todo humano é um mamífero, portanto

```java
Humano pedro ;
pedro = new Mamifero() ;
```

# OverLoading e OverRiding

- OverLoading se refere a carregar métodos subindo a hierarquia
- OverRiding é quando um metodo da classe sobre escreve um método existente subindo a hierarquia

# Comportamento dos construtores em hierarquia

- Todos construtores são executados na hierarquia, de cima para baixo
```java
public class Animal
{
    public Animal()
    {

    }
}
```
```java
public class Mamifero
{
    int quantidadeDeGlandulasMamarias ;

    public Mamifero(int quantidadeDeGlandulasMamarias)
    {

    }
}
```
```java
public class Humano
{
    string nome ;
    public Humano(string nome)
    {

    }
}
```

## Classes e métodos abstratos

- Não se pode instanciar um objeto de uma classe abstrata
- Caso tenha um método abstrato, obriga as subclasses a implementar o método

```java
public abstract class Pessoa
{
    public abstract void apresenta();
}
```

- Um método abstrato é um protótipo de método; nunca tem corpo

## Classe interface
- Uma classe Interface não pode implementar métodos, ela demonstra como é a interface de comunicação (Os métodos públicos disponíveis) em todas as subclasses da interface.
```java
public interface Lista<T>
{
    public int tamanho();
}
```
```java
public class ListaComEncadeamento<T> implements Lista<T>
{
    int tamanho ;
    public int tamanho()
    {
        return this.tamanho ;
    }
}
```
- Uma classe não pode herdar de várias classes abstratas, mas pode "herdar" (implementar) várias interface.
- Uma classe abstrata pode herdar de uma interface sem implementar os métodos da interface, mas as sublasses concretas **precisam** implementar tanto os métodos da classe abstrata quanto da interface da qual ela herdou.

## Error Handling

### Usar o tipo de retorno para identificar erros
- O tipo de retorno pode não estar disponível
- O erro não vai necessáriamente ser tratado
- O tratamento do código não vai ser separado do código implementado

##  Comparable
- return one of -1, 0, or 1 according to whether the value of expression is negative, zero or positive.
```java
Interface Comparable<T>
int compareTo(T o);
```
```java
ordena()
{
  Comparable a = Cast (...)
  Comparable b = Cast (...)

  a.compareTo(b);
}
```
- Para implementar uma lista genérica, mas limitar os tipos de objetos que ela recebe pare ser apenas objetos que implementam Comparable
```java
  class Lista<T extends Comparable>{
  }
```

## Persistência
- Métodos que lidam com bytes (mais elementares)
InputStream > ObjectInputStream > readObject
OutputStream > ObjectOutputStream > writeObject
- Métodos que lidam com String
Reader > FileReader > BufferedReader
Writer > FileWriter > BufferedWriter


## Referencias
- [Apostila da Caelum](https://www.caelum.com.br/apostila-java-orientacao-objetos/)
- [Apostila da Caelum: Capítulo 4 - Orientação a objetos básica](https://www.caelum.com.br/apostila-java-orientacao-objetos/orientacao-a-objetos-basica/)
