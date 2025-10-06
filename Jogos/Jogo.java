import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("BEM-VINDO AO JOGO DE CORRIDA!!!");

        System.out.print("Digite o nome do piloto: ");
        String nomePiloto = input.nextLine();

        System.out.print("Digite a habilidade do piloto (1 a 100): ");
        int habilidade = input.nextInt();
        input.nextLine();

        Piloto piloto = new Piloto(nomePiloto, habilidade);

        System.out.print("Digite o modelo do carro: ");
        String modeloCarro = input.nextLine();
        Carro carro = new Carro(modeloCarro);

        System.out.print("Digite o nome da corrida: ");
        String nomeCorrida = input.nextLine();

        System.out.print("Digite o número de voltas: ");
        int voltas = input.nextInt();
        input.nextLine();

        Corrida corrida = new Corrida(nomeCorrida, voltas);

        System.out.print("Digite o tipo de pista: ");
        String tipoPista = input.nextLine();

        System.out.print("Digite a dificuldade da pista (1 a 5): ");
        int dificuldade = input.nextInt();

        Pista pista = new Pista(tipoPista, dificuldade);

        // Início da corrida
        System.out.println("\n=== Corrida começando! ===");
        piloto.falar("Estou pronto para vencer!");
        pista.exibirDetalhes();
        corrida.iniciar();

        carro.acelerar();
        carro.acelerar();
        carro.frear();
        carro.abastecer(20);

        corrida.encerrar();

        System.out.println("\nFim do jogo. Obrigado por jogar!");
        input.close();
        
	}
}