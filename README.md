# Programação Orientada a Objectos

```java
public class ListaDeAlunos
{
    // Convenção para retorno dos métodos de inclusão:
    // 0 - Inclusão com sucesso
    // 1 - Indice inválido
    // 2 - Capacidade excedida
    // 3 - Aluno já existe

    private Aluno[] alunosDaLista;
    private int quantidadeDeAlunos;
    private int capacidadeMaxima;

    public ListaDeAlunos()
    {
        capacidadeMaxima = 100 ;
        alunosDaLista = new Aluno[capacidadeMaxima] ;
    }

    public ListaDeAlunos(int capacidade)
    {
        capacidadeMaxima = capacidade ;
        alunosDaLista = new Aluno[capacidadeMaxima] ;
    }

    public Aluno get(int index)
    {
        return this.alunosDaLista[index];
    }

    public int incluir(Aluno novoAluno)
    {
        if ( this.contem(novoAluno.nome) != null ){
            return 3;
        }

        if ( this.quantidadeDeAlunos >= this.capacidadeMaxima){
            return 2;
        }        

        this.alunosDaLista[quantidadeDeAlunos] = novoAluno;
        return 0;
    }    

    public int incluir(Aluno novoAluno, int index)
    {
        if ( this.contem(novoAluno.nome) != null ){
            return 3;
        }

        if ( this.quantidadeDeAlunos >= this.capacidadeMaxima){
            return 2;
        }        

        if ( this.quantidadeDeAlunos+1 != index){
            return 1;
        }   
        this.alunosDaLista[index] = novoAluno;
        return 0;
    }  

    public boolean vazia()
    {
        if (this.quantidadeDeAlunos == 0) {
            return true ;
        } else {
            return false ;
        }
    }  

    public int tamanho()
    {
        return this.alunosDaLista.length;
    }

    public Aluno contem(String nomeDoAluno)
    {
        for(int i = 0; i < this.alunosDaLista.length; i++)
        {
          if(this.alunosDaLista[i].nome.equals(nomeDoAluno))
          {
             return this.alunosDaLista[i];
          }
        }
        return null;
    }

}
```
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

public class Mamifero
{
    int quantidadeDeGlandulasMamarias ;

    public Mamifero(int quantidadeDeGlandulasMamarias)
    {

    }
}

public class Humano
{
    string nome ;
    public Humano(string nome)
    {

    }
}
```

## Classes e métodos abstratos

- Obriga as subclasses a implementar o método
- Não se pode instanciar um objeto de uma classe abstrata

```java
public abstract class Pessoa
{
    public abstract void apresenta();
}
```




## Referencias
- [Apostila da Caelum](https://www.caelum.com.br/apostila-java-orientacao-objetos/)
- [Apostila da Caelum: Capítulo 4 - Orientação a objetos básica](https://www.caelum.com.br/apostila-java-orientacao-objetos/orientacao-a-objetos-basica/)
