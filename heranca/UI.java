import java.util.* ;


public class UI
{
    private ArrayList<Pessoa> lista = new ArrayList<>() ;
    Scanner scanner = new Scanner(System.in);
    String nome ;
    
    public void menu()
    {
        System.out.println("1. incluir um aluno"); 
        System.out.println("2. incluir um professor"); 
        System.out.println("3. incluir um funcionario"); 
        System.out.println("4. apresentar as pessoas"); 
        int option = scanner.nextInt();
        scanner.nextLine();

        while (option != 0) 
        {
            switch (option) 
            {
                case 1: 
                    System.out.println("Digite o nome do aluno"); 
                    nome = scanner.nextLine();
                    System.out.println("Digite o numero de disciplinas"); 
                    int numeroDeDisciplinas = scanner.nextInt();
                    scanner.nextLine();
                    Aluno aluno = new Aluno(nome,numeroDeDisciplinas) ;
                    lista.add(aluno);
                break ;
    
                case 2: 
                    System.out.println("Digite o nome do professor"); 
                    nome = scanner.nextLine();
                    System.out.println("Digite a disciplina ministrada"); 
                    String cursoMinistrado = scanner.nextLine();
                    Professor professor = new Professor(nome,cursoMinistrado) ;
                    lista.add(professor);
                break ;
                
                case 3:
                    System.out.println("Digite o nome do funcionario"); 
                    nome = scanner.nextLine();
                    Funcionario funcionario = new Funcionario(nome) ;
                    lista.add(funcionario);
                break ;
                
                case 4: 
                for (Pessoa pessoa : lista) {
                    System.out.println(pessoa.apresenta()) ;
                }
                break ;
            }   
            System.out.println("1. incluir um aluno"); 
            System.out.println("2. incluir um professor"); 
            System.out.println("3. incluir um funcionario"); 
            System.out.println("4. apresentar as pessoas"); 
            System.out.println("0. Sair"); 
            option = scanner.nextInt();
            scanner.nextLine();
        }
    }
    
    public static void main(String[] args)
    {
        new UI().menu() ;
    }
}
