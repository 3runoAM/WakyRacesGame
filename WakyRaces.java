import Models.Carros.Carro;
import Models.Jogador;

public class WakyRaces {
    public static void main(String[] args){
        System.out.println("Escolha a quantidade de jogadores: ");
        int quantJogadores = 3;

        for (int i = 0; i < quantJogadores; i++){
            System.out.println("Nome: ");
            Jogador jogadorVez = new Jogador("Bruno");
            System.out.println("Escolha um carro");
            Carro carro = new Carro(jogadorVez);
        }
    }
}
