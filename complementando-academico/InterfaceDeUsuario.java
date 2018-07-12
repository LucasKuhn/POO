import java.util.Scanner;

public class InterfaceDeUsuario
{
    private Lista<Pessoa> osAlunosDaUniversidade ;

    private Lista<Curso> osCursosDaUniversidade ;

    private Lista<Disciplina> asDisciplinasDaUniversidade ;       

    private Scanner entrada = new Scanner(System.in);
    
    PersistenciaComSerializacao arq = new PersistenciaComSerializacao();
    
    public InterfaceDeUsuario(Lista alunos, Lista cursos, Lista disciplinas)
    {
        this.osAlunosDaUniversidade = alunos ;
        this.osCursosDaUniversidade = cursos ;
        this.asDisciplinasDaUniversidade = disciplinas ;
    }
    
    public void menuPrincipal()
    {
        int opcao = this.menuDeOpcoes();
        while(opcao!=0)
        {
            switch(opcao)
            {
                case 1:
                Pessoa al = new Aluno();
                System.out.println("Qual é o nome do curso deste novo aluno:");
                entrada.nextLine();
                String nomeDoCurso = entrada.nextLine();
                for(int i=0 ; i<osCursosDaUniversidade.tamanho() ; i++)
                {
                    if(osCursosDaUniversidade.get(i).getNome().equals(nomeDoCurso))
                    {
                        al.setMeuCurso(osCursosDaUniversidade.get(i));
                        break;
                    }
                }
                if(al.getMeuCurso() != null)
                {
                    try
                    {
                        System.out.println("Qual é o nome:");
                        al.setNome(entrada.nextLine());
                        System.out.println("Qual é o cpf:");
                        al.setCpf(entrada.nextLine());
                        osAlunosDaUniversidade.incluir(al);   
                    }
                    catch(ExcecaoDeInclusaoEmListaCheia e)
                    {
                        System.out.println(e.msgErro());
                    }            
                }
                else
                {
                    System.out.println("cadastre o curso antes de cadastrar o aluno");
                }
                break;

                case 2:
                for(int i=0 ; i<osAlunosDaUniversidade.tamanho()   ; i++)
                {
                    System.out.println(osAlunosDaUniversidade.get(i).getNome());
                }
                break;

                case 3:
                try
                {
                    Curso cursoAux = new Curso();
                    System.out.println("Qual é o nome:");
                    entrada.nextLine();
                    cursoAux.setNome(entrada.nextLine());
                    // System.out.println("Qual é o codigo:");
                    // cursoAux.codigo = entrada.nextLine();
                    osCursosDaUniversidade.incluir(cursoAux);                    
                }
                catch(ExcecaoDeInclusaoEmListaCheia e)
                {
                    System.out.println(e.msgErro());
                }
                break;

                case 4:
                try
                {
                    System.out.println("Qual é o nome:");
                    entrada.nextLine();
                    String nome = entrada.nextLine();
                    System.out.println("Qual é o codigo:");
                    String codigo = entrada.nextLine();
                    System.out.println("Qual é o numero de vagas:");
                    int vagas= entrada.nextInt();
                    Disciplina discAux = new Disciplina(codigo,nome,vagas);
                    asDisciplinasDaUniversidade.incluir(discAux);
                }
                catch(ExcecaoDeInclusaoEmListaCheia e)
                {
                    System.out.println(e.msgErro());
                }

                break;

                case 5:
                System.out.println("Qual é o cpf do aluno?");
                entrada.nextLine();
                String cpf = entrada.nextLine();
                System.out.println("Qual é o codigo da disciplina?");
                String codigo = entrada.nextLine();
                Disciplina umaDisciplina=null;
                // procurando pela disciplina com o "codigo" no array de Disciplina e 
                // guardando o objeto encontrado (do tipo Disciplina) na variável "umaDisciplina"
                for(int i=0 ;  i<asDisciplinasDaUniversidade.tamanho() ; i++)
                {
                    if(codigo.equals(asDisciplinasDaUniversidade.get(i).getCodigo()))
                    {
                        umaDisciplina = asDisciplinasDaUniversidade.get(i);
                        break;
                    }
                }
                // se "auxiliar" não contiver null, significa que há uma referência para 
                // uma disciplina na variável
                if(umaDisciplina!=null)
                {
                    // Como os alunos estão guardados em uma ListaDeAlunos (e não mais em um array),
                    // para encontrar o aluno com o cpf fornecido, podemos usar o método
                    // "pesquisa" (que está disponível na classe ListaDeAlunos)
                    Pessoa umAluno = null;
                    for(int i=0 ;  i<osAlunosDaUniversidade.tamanho() ; i++)
                    {
                        if(cpf.equals(osAlunosDaUniversidade.get(i).getCpf()))
                        {
                            umAluno = osAlunosDaUniversidade.get(i);
                            break;
                        }
                    }
                    if( umAluno != null)
                    {
                        boolean resultado = umaDisciplina.matricular(umAluno);
                        if(!resultado)
                        {
                            System.out.println("sem vagas na disciplina");
                        }
                    }
                    else 
                    {
                        System.out.println("Aluno não encontrado");
                    }                    
                }
                else
                {
                    System.out.println("disciplina não cadastrada");
                }
                break;            
            }
            opcao = this.menuDeOpcoes();            
        }
        
        arq.armazenaAlunos(osAlunosDaUniversidade);
        arq.armazenaCursos(osCursosDaUniversidade);
        arq.armazenaDisciplinas(asDisciplinasDaUniversidade);
    }

    private int menuDeOpcoes()
    {
        System.out.println("0.Sair");
        System.out.println("1.novo Aluno");
        System.out.println("2.Mostrar os nomes dos alunos");
        System.out.println("3.novo Curso");
        System.out.println("4.nova Disciplina");
        System.out.println("5.Matricular aluno na disciplina");
        return entrada.nextInt();
    }
}
