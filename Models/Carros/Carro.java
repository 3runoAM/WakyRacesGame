public class Carro {
    private Jogador jogador;
    private int velocidadeMin = 30;
    private int velocidadeMax = 150;

    /*Construtor*/
    public Carro() {
    }

    public Carro(Jogador jogador) {
        this.jogador = jogador;
    }

    /*Setters*/
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
}
