import java.util.Scanner;

public class Interface {
    private Scanner entrada = new Scanner(System.in);
    private Ranking ranking = new Ranking();
    private Jogador jogadorSelecionado = new Jogador("sem nome");
    
    public void mostraMenuPrincipal()
    {       
        int opcao = this.menuPrincipal();
        int pontos ;
        String nomeJogador;
        
        while(opcao != 0)
        {
            switch(opcao) // MENU PRINCIPAL
            {
                case 1:
                System.out.println("Digite o nome do jogador 1:");
                jogadorSelecionado = new Jogador(entrada.next()) ;
                ranking.incluir(jogadorSelecionado);
                System.out.println("Digite o nome do jogador 2:");
                jogadorSelecionado = new Jogador(entrada.next()) ;
                ranking.incluir(jogadorSelecionado);
                break;
                
                case 2:
                limpaTela();
                jogadorSelecionado.mostraDados();
                opcao = this.menuJogo1();
                while(opcao != 0) // MENU JOGO 1
                {
                    switch(opcao)
                    {
                        case 2:
                        limpaTela();
                        jogadorSelecionado.mostraDados();
                        System.out.println("Quantos dados quer jogar novamente?");
                        int quantidadeDeDados = entrada.nextInt();
                        System.out.println("Quais dados quer jogar novamente? (Selecione pelo índice)");
                        int[] dadosSelecionados = this.selecionaDados(entrada,quantidadeDeDados);
                        jogadorSelecionado.rolaNovamente(dadosSelecionados, quantidadeDeDados);
                        System.out.println("Sua jogada ficou:");
                        jogadorSelecionado.mostraDados();
                        opcao = this.menuJogo1();
                        break;
    
                        case 3:
                        limpaTela();
                        jogadorSelecionado.mostraDados();
                        System.out.println("Qual jogada?");
                        ChecadorDeJogada checagem = new ChecadorDeJogada(jogadorSelecionado.getCopo());
                        opcao = this.menuJogo2();
                        limpaTela();
                        switch(opcao)
                        {
                            case 4:
                            pontos = checagem.validaSequencia() ;
                            System.out.println("Você pontuou: " + pontos);
                            break;
                            
                            case 5:
                            pontos = checagem.validaFullHand() ;
                            System.out.println("Você pontuou: " + pontos);
                            break;
                            
                            case 6:
                            pontos = checagem.validaQuadra() ;
                            System.out.println("Você pontuou: " + pontos);
                            break;
                            
                            case 7:
                            pontos = checagem.validaGeneral() ;
                            System.out.println("Você pontuou: " + pontos);
                            break;
                        } 
                        opcao = 0 ;
                        break;
                    }
                }
                break ;
            }
            opcao = this.menuPrincipal();
        }       
    }
    
    private int menuPrincipal()
    {
        System.out.println("0.Sair");
        System.out.println("2.Jogar");
        return entrada.nextInt();
    }
    
    private int menuJogo1()
    {
        System.out.println("0.Volta ao Menu Inicial");
        System.out.println("2.Jogar alguns dados novamente");
        System.out.println("3.Selecionar jogada final");
        return entrada.nextInt();
    }

    private int menuJogo2()
    {
        System.out.println("4.Seqüência (20 pontos)");
        System.out.println("5.Full-Hand");
        System.out.println("6.Quadra");
        System.out.println("7.General");
        System.out.println("8.Combinações Simples");
        System.out.println("0.Volta ao Menu Inicial");
        return entrada.nextInt();
    }
    
    private void limpaTela()
    {
        System.out.print('\u000C');
        return ;
    }
    
    private int[] selecionaDados(Scanner entrada, int quantidadeDeDados)
    {
        int[] dadosSelecionados = new int[quantidadeDeDados];
        int i = 0 ;
        while (!entrada.hasNextInt()) {
            entrada.next();
        } 
        
        while (i < quantidadeDeDados && entrada.hasNextInt()) 
        { 
            dadosSelecionados[i] = entrada.nextInt() - 1; // Diminuimos 1 pois o indice no array começa em 0
            i++;
        }
        return dadosSelecionados;
    }
    
    public void mostraDados(Jogador jogador)
    {
        for(int i = 0; i < 5; ++i)
        {
            System.out.println("Dado " + (i+1) + ": " + jogador.getCopo().getDado(i).valor);
        }
    }
}
