package Models;

import Models.Carros.Carro;

import java.util.Random;

public class Jogador {
    private String nome;
    private final int id;
    private int pontos = 0;
    private Carro carro;
    /*----------Construtor----------*/
    public Jogador(String nome){
        this.nome = nome;
        this.id = gerarId();
    }
    public Jogador(String nome, int id, Carro carro){
        Random idGenerator = new Random();
        this.nome = nome;
        this.id = gerarId();
        this.carro = carro;
    }
    /*----------Getters&Setters----------*/
    public String getNome() {
        return nome;
    }
    public int getId() {
        return id;
    }
    public int getPontos() {
        return pontos;
    }
    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    /*----------Método----------*/
    private int gerarId(){
        Random idGenerator = new Random();
        return idGenerator.nextInt(1000, 10000);
    }
}
