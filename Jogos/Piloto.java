
public class Piloto {
	

    private String nome;
    private int habilidade;

    public Piloto(String nome, int habilidade) {
        this.nome = nome;
        this.habilidade = habilidade;
    }

    public void falar(String frase) {
        System.out.println(nome + ": " + frase);
    }

    public void aumentarHabilidade(int pontos) {
        habilidade += pontos;
        System.out.println(nome + " aumentou sua habilidade para " + habilidade);
    }

    public int getHabilidade() {
        return habilidade;
    }

    public String getNome() {
        return nome;
        
    }


}
