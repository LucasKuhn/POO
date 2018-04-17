import java.util.Scanner ;

public class Interface
{
    // Lista de Alunos
    private ListaDeAlunos alunosDaUniversidade = new ListaDeAlunos();
    private int quantidadeDeDisciplinas = 0 ;
    private Scanner entrada = new Scanner(System.in);
    int opcao ;
    
    // Disciplinas
    private ListaDeDisciplinas alunosDaDisciplina = new ListaDeDisciplinas();
      
    // Array de cursos
    Curso[] cursosDaUniversidade = new Curso[1000] ;
    int quantidadeDeCursos = 0 ;
    
    public void mostraMenuPrincipal()
    {
        opcoes();
        String nomeAluno, nomeCurso, cpf, codigo ;
        Aluno alunoAuxiliar ;
        Curso cursoAuxiliar ;
        
        while(opcao != 0)
        {
            switch(opcao)
            {
                case 1:
                System.out.println("informe o nome do aluno:");
                entrada.nextLine();
                nomeAluno = entrada.nextLine();
                System.out.println("informe o cpf:");
                cpf = entrada.nextLine();
                System.out.println("informe o curso do aluno:");
                String nomeDoCurso = entrada.nextLine();
                alunoAuxiliar = new Aluno();
                alunoAuxiliar.nome = nomeAluno ; 
                alunoAuxiliar.cpf = cpf ;
                alunosDaUniversidade.incluir(alunoAuxiliar);

                break;
                
                case 2:
                int impresso = 0 ;
                while (impresso < this.alunosDaUniversidade.tamanho())
                {
                    System.out.println("ALUNOS:");
                    //System.out.println(alunosDaUniversidade[impresso].nome);
                    //System.out.println(alunosDaUniversidade[impresso].cpf);
                    impresso++;
                }
                break;
                
                case 3:
                System.out.println("informe o nome do curso:");
                entrada.nextLine();
                nomeCurso = entrada.nextLine();
                System.out.println("informe o codigo do curso:");
                codigo = entrada.nextLine();
                cursoAuxiliar = new Curso();
                cursoAuxiliar.nome = nomeCurso ; 
                //cursoAuxiliar.codigo = codigo ;
                cursosDaUniversidade[quantidadeDeCursos] = cursoAuxiliar;
                quantidadeDeCursos++;
                break;
            }
             
            
            opcao = this.opcoes();
        }
        System.out.println("Programa fechado.");
    }
    
    private int opcoes()
    {
        System.out.println("0.Sair");
        System.out.println("1.Cadastrar um aluno");
        System.out.println("2.Mostrar alunos cadastrados");
        System.out.println("3.Cadastrar cursos");
        System.out.println("4.Cadastrar Disciplinas");
        System.out.println("5.Matricular um aluno na disciplina");
        return entrada.nextInt();
    }
}
