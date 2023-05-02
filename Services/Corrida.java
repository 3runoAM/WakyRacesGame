package Services;

import Models.Carros.Carro;
import Models.Percursos.Percurso;

import java.util.ArrayList;

public class Corrida {
    private Percurso percurso;
    private ArrayList<Carro> carrosParticipantes;
    /*----------Construtores----------*/
    Corrida(Percurso percurso, ArrayList<Carro> carrosParticipantes){
        this.percurso = percurso;
        this.carrosParticipantes = carrosParticipantes;
    }
    /*----------Getters----------*/
    public Percurso getPercurso() {
        return percurso;
    }
    public ArrayList<Carro> getCarrosParticipantes() {
        return carrosParticipantes;
    }
    /*----------Métodos----------*/
}
