package Models.Carros;

import Models.Jogador;

import java.util.Random;

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
    public int acelerar(int velocidade){
        return velocidade;
    }
    public int acelerar(){
        Random velocidadeGenerator = new Random();
        return velocidadeGenerator.nextInt(velocidadeMin,velocidadeMax +1);
    }
    public int frear(){
        return velocidadeMin;
    }
}
