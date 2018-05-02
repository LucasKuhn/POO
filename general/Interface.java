import java.util.Scanner;

public class Interface {
    private Scanner entrada = new Scanner(System.in);
    
    public void mostraMenuPrincipal()
    {
        // System.out.print('\u000C'); //Clear the Screen
        int opcao = this.opcoes();
        String nomeAluno,nomeCurso,cpf,codigo ;
        int indiceDoCurso ;
        Copo copo = new Copo();
        while(opcao != 0)
        {
            switch(opcao)
            {
                case 1:
                copo.mostraDados();
                break;
                
                case 2:
                System.out.println("Qual dado quer jogar novamente?");
                copo.mostraDados();
                int dadoSelecionado = entrada.nextInt();
                copo.rolaNovamente(dadoSelecionado) ;
                System.out.println("Sua jogada ficou:");
                copo.mostraDados();
                break;
                
                case 3:
                copo.mostraDados();
                System.out.println("Qual jogada?");
                opcao = this.opcoes3();
                switch(opcao)
                {
                    case 4:
                    ChecagemDeJogada checagem = new ChecagemDeJogada(copo);
                    int pontos = checagem.validaSequencia() ;
                    System.out.println("Você pontuou: " + pontos);
                    break;
                }
                break;
            }
            opcao = this.opcoes2();
        }       
    }
    
    private int opcoes()
    {
        System.out.println("0.Sair");
        System.out.println("1.Jogar");
        return entrada.nextInt();
    }
    
    private int opcoes2()
    {
        System.out.println("0.Sair");
        System.out.println("2.Jogar algum dado novamente");
        System.out.println("3.Selecionar jogada final");
        return entrada.nextInt();
    }

    private int opcoes3()
    {
        System.out.println("0.Sair");
        System.out.println("4.Seqüência (20 pontos)");
        System.out.println("5.Full-Hand");
        System.out.println("6.Quadra");
        System.out.println("7.General");
        System.out.println("8.Combinações Simples");
        return entrada.nextInt();
    }
}
