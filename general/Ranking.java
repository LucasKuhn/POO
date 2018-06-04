public class Ranking
{
    private ListaComEncadeamento<Jogador> listaDeJogadores = new ListaComEncadeamento<Jogador>();

    public Ranking()
    {

    }

    public void incluir(Jogador jogador)
    {
        this.listaDeJogadores.incluir(jogador) ;
    }
    
}

// Para ordenar, primeiro Vitórias - Empates - No de Jogos - Pontos