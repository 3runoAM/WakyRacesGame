
public class Jogador {
    private String nome;
    private int pontos = 0;
    private Carro carro;

    /*Construtor*/
    public Jogador(){};

    public Jogador(String nome){
        this.nome = nome;
    }

    public Jogador(String nome, Carro carro){
        this.nome = nome;
        this.carro = carro;
    }
}
