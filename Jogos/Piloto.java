// Classe que representa um piloto em um jogo ou simulação de corrida
public class Piloto {
	
    // Atributo que guarda o nome do piloto
    private String nome;

    // Atributo que representa o nível de habilidade do piloto (ex: de 0 a 100)
    private int habilidade;

    // Construtor da classe, usado para criar um novo piloto com nome e habilidade inicial
    public Piloto(String nome, int habilidade) {
        this.nome = nome;
        this.habilidade = habilidade;
    }

    // Método que faz o piloto "falar" uma frase
    // Exibe no console o nome do piloto seguido da frase informada
    public void falar(String frase) {
        System.out.println(nome + ": " + frase);
    }

    // Método que aumenta a habilidade do piloto em uma certa quantidade de pontos
    // Exibe também a nova habilidade atualizada no console
    public void aumentarHabilidade(int pontos) {
        habilidade += pontos;
        System.out.println(nome + " aumentou sua habilidade para " + habilidade);
    }

    // Método que retorna o valor atual da habilidade do piloto
    public int getHabilidade() {
        return habilidade;
    }

    // Método que retorna o nome do piloto
    public String getNome() {
        return nome;
    }

}
