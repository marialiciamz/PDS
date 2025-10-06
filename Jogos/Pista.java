
// Classe que representa uma pista de corrida
public class Pista {

    // Atributo que armazena o tipo da pista (ex: "asfalto", "terra", "neve")
    private String tipo;

    // Atributo que armazena o nível de dificuldade da pista (ex: 1 a 10)
    private int dificuldade;

    // Construtor da classe Pista, que inicializa o tipo e a dificuldade
    public Pista(String tipo, int dificuldade) {
        this.tipo = tipo;
        this.dificuldade = dificuldade;
    }

    // Método que exibe os detalhes da pista no console
    public void exibirDetalhes() {
        System.out.println("Pista: " + tipo + " | Dificuldade: " + dificuldade);
    }

    // Método que verifica se a pista está molhada, dependendo da condição de chuva
    // Retorna verdadeiro se estiver chovendo, falso caso contrário
    public boolean pistaMolhada(boolean chovendo) {
        return chovendo;
    }

    // Método que permite ajustar o nível de dificuldade da pista
    public void ajustarDificuldade(int novaDificuldade) {
        this.dificuldade = novaDificuldade;
    }
}
