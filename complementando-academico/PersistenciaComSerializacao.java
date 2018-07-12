import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.*;

public class PersistenciaComSerializacao
{
    public void armazenaAlunos(Lista<Pessoa> lista)
    {
        try
        {
            ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream("listaAlunos.obj"));
            saida.writeObject(lista);
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.out.println("erro de io ao armazenar alunos");
        }
    }
    
    public void armazenaCursos(Lista<Curso> lista)
    {
        try
        {
            ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream("listaCursos.obj"));
            saida.writeObject(lista);
        }
        catch(IOException e)
        {
            System.out.println("erro de io ao armazenar cursos");
        }
    }

    public void armazenaDisciplinas(Lista<Disciplina> lista)
    {
        try
        {
            ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream("listaDisciplinas.obj"));
            saida.writeObject(lista);
        }
        catch(IOException e)
        {
            System.out.println("erro de io ao armazenar disciplinas");
        }
    }
    
    public ListaComEncadeamento<Pessoa> recuperaAlunos()
    {
        ListaComEncadeamento<Pessoa> lista = new ListaComEncadeamento<Pessoa>(1000) ; 
        try
        {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("listaAlunos.obj"));
            lista = (ListaComEncadeamento<Pessoa>) entrada.readObject();
        }
        catch(IOException e)
        {
            System.out.println("erro de io");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("classe não encontrada");
        }
        
        return lista;
    }
    
    public ListaComArray<Curso> recuperaCursos()
    {
        ListaComArray<Curso> lista = new ListaComArray<Curso>(1000) ; 
        try
        {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("listaCursos.obj"));
            lista = (ListaComArray<Curso>) entrada.readObject();
        }
        catch(IOException e)
        {
            System.out.println("erro de io");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("classe não encontrada");
        }
        
        return lista;
    }
    
    public ListaComEncadeamento<Disciplina> recuperaDisciplinas()
    {
        ListaComEncadeamento<Disciplina> lista = new ListaComEncadeamento<Disciplina>(1000) ; 
        try
        {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("listaDisciplinas.obj"));
            lista = (ListaComEncadeamento<Disciplina>) entrada.readObject();
        }
        catch(IOException e)
        {
            System.out.println("erro de io");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("classe não encontrada");
        }
        
        return lista;
    }
}