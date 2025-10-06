
public class Corrida {
	
	private String nome;
    private int voltas;

    public Corrida(String nome, int voltas) {
        this.nome = nome;
        this.voltas = voltas;
    }

    public void iniciar() {
        System.out.println("Corrida " + nome + " iniciada com " + voltas + " voltas!");
    }

    public void mostrarStatus(Carro carro) {
        System.out.println("Carro competindo: " + carro);
    }

    public void encerrar() {
        System.out.println(" Corrida " + nome + " finalizada!");
    }

}
