import java.util.*;

public class UI
{
    private ListaComArray<Pessoa> lista = new ListaComArray<>(100) ;
    Scanner scanner = new Scanner(System.in);
    String nome ;

    public void menu()
    {
        System.out.println("1. incluir um aluno"); 
        System.out.println("2. incluir um professor"); 
        System.out.println("3. apresentar as pessoas"); 
        System.out.println("4. incluir um funcionario"); 
        int option = scanner.nextInt();
        scanner.nextLine();

        while (option != 0) 
        {
            switch (option) 
            {
                case 1: 
                try {
                    System.out.println("Digite o nome do aluno"); 
                    nome = scanner.nextLine();
                    System.out.println("Digite o numero de disciplinas"); 
                    int numeroDeDisciplinas = scanner.nextInt();
                    scanner.nextLine();
                    Aluno aluno = new Aluno(nome,numeroDeDisciplinas) ;
                    lista.incluir(aluno);
                } catch ( ExcessaoDeListaCheia e) {
                    System.out.println("Lista cheia!"); 
                }
                break ;

                case 2: 
                System.out.println("Digite o nome do professor"); 
                nome = scanner.nextLine();
                System.out.println("Digite a disciplina ministrada"); 
                String cursoMinistrado = scanner.nextLine();
                Professor professor = new Professor(nome,cursoMinistrado) ;
                try {
                    lista.incluir(professor);
                } catch ( ExcessaoDeListaCheia e) {
                    
                }
                break ;

                case 3: 
                for(int i=0 ; i<lista.tamanho(); i++) {
                    System.out.println(lista.get(i).apresenta()) ;
                }
                break ; 
                
                case 4: 
                System.out.println("Digite o nome do funcionario"); 
                nome = scanner.nextLine();
                Funcionario f = new Funcionario(nome) ;
                lista.incluir(f);
                break ;
            }   
            System.out.println("1. incluir um aluno"); 
            System.out.println("2. incluir um professor"); 
            System.out.println("3. apresentar as pessoas"); 
            System.out.println("4. incluir um funcionario"); 
            System.out.println("0. Sair"); 
            option = scanner.nextInt();
            scanner.nextLine();
        }
    }
}