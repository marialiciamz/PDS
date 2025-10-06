// Importa a classe Scanner, usada para ler dados digitados pelo usuário
import java.util.Scanner;

// Classe principal que executa o jogo de corrida
public class Jogo {

    // Método principal (ponto de entrada do programa)
	public static void main(String[] args) {

        // Criação do objeto Scanner para ler as entradas do usuário
        Scanner input = new Scanner(System.in);

        // Mensagem de boas-vindas
        System.out.println("BEM-VINDO AO JOGO DE CORRIDA!!!");

        // Solicita o nome do piloto ao usuário
        System.out.print("Digite o nome do piloto: ");
        String nomePiloto = input.nextLine();

        // Solicita a habilidade do piloto (de 1 a 100)
        System.out.print("Digite a habilidade do piloto (1 a 100): ");
        int habilidade = input.nextInt();
        input.nextLine(); // Consome a quebra de linha pendente

        // Cria um novo objeto Piloto com as informações fornecidas
        Piloto piloto = new Piloto(nomePiloto, habilidade);

        // Solicita o modelo do carro
        System.out.print("Digite o modelo do carro: ");
        String modeloCarro = input.nextLine();

        // Cria um novo objeto Carro com o modelo informado
        Carro carro = new Carro(modeloCarro);

        // Solicita o nome da corrida
        System.out.print("Digite o nome da corrida: ");
        String nomeCorrida = input.nextLine();

        // Solicita o número de voltas da corrida
        System.out.print("Digite o número de voltas: ");
        int voltas = input.nextInt();
        input.nextLine(); // Consome a quebra de linha

        // Cria um novo objeto Corrida com nome e voltas informados
        Corrida corrida = new Corrida(nomeCorrida, voltas);

        // Solicita o tipo da pista (ex: asfalto, terra, neve)
        System.out.print("Digite o tipo de pista: ");
        String tipoPista = input.nextLine();

        // Solicita a dificuldade da pista (de 1 a 5)
        System.out.print("Digite a dificuldade da pista (1 a 5): ");
        int dificuldade = input.nextInt();

        // Cria um novo objeto Pista com tipo e dificuldade informados
        Pista pista = new Pista(tipoPista, dificuldade);

        // Início da simulação da corrida
        System.out.println("\n=== Corrida começando! ===");

        // O piloto fala uma frase de motivação
        piloto.falar("Estou pronto para vencer!");

        // Exibe os detalhes da pista
        pista.exibirDetalhes();

        // Inicia a corrida
        corrida.iniciar();

        // Simula ações do carro durante a corrida
        carro.acelerar();
        carro.acelerar();
        carro.frear();
        carro.abastecer(20);

        // Encerra a corrida
        corrida.encerrar();

        // Mensagem final do jogo
        System.out.println("\nFim do jogo. Obrigado por jogar!");

        // Fecha o Scanner para liberar recursos
        input.close();
	}
}
