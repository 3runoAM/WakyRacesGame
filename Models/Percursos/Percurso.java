package Models.Percursos;

public enum Percurso {
    PERCURSO01("Pista congelada no Alaska", 10000),
    PERCURSO02("Pista flamejante do Arizona", 15000),
    PERCURSO03("Pista escorragadia na Louisiana", 20000);
    private String nome;
    private int tamanho;
    /*----------Construtores----------*/
    Percurso(String nome, int tamanho){
        this.nome = nome;
        this. tamanho = tamanho;
    }
    /*----------Getters----------*/
    public String getNome() {
        return nome;
    }
    public int getTamanho() {
        return tamanho;
    }
    /*----------Métodos----------*/
}
