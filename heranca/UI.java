import java.util.* ;


public class UI
{
    private ArrayList<Pessoa> lista = new ArrayList<>() ;
    Scanner scanner = new Scanner(System.in);
    
    public void menu()
    {
        System.out.println("1. incluir um aluno"); 
        System.out.println("2. incluir um professor"); 
        System.out.println("3. apresentar as pessoas"); 
        int option = scanner.nextInt();
        switch (option) {
            case 1: 
                System.out.println("Digite o nome do aluno"); 
                String nome = scanner.nextLine();
                System.out.println("Digite o numero de disciplinas"); 
                int disciplinas = scanner.nextInt();
                private int numeroDeDisciplinas ;
                Aluno aluno = new Aluno(nome, String curso)
            break ;
            case 2: 
            break ;
            case 3: 
            break ;
        }
        
    }
    
    public static void main(String[] args)
    {
        this.menu() ;
    }
}
