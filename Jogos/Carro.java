// Classe que representa um carro usado na corrida
public class Carro {
	
    // Atributo que armazena o modelo do carro (ex: "Ferrari", "Mustang", etc.)
	private String modelo;

    // Atributo que indica a velocidade atual do carro em km/h
    private int velocidade;

    // Atributo que representa o nível de combustível (de 0 a 100)
    private int combustivel;

    // Construtor da classe Carro
    // Recebe o modelo do carro como parâmetro obrigatório
    // Ao criar um novo carro, ele começa parado (velocidade = 0)
    // e com o tanque cheio (combustível = 100)
    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
        this.combustivel = 100;
    }

    // Método que faz o carro acelerar
    // Aumenta a velocidade em 10 km/h e reduz o combustível em 5%
    // Caso o combustível acabe, exibe mensagem de aviso
    public void acelerar() {
        if (combustivel > 0) {
            velocidade += 10;
            combustivel -= 5;
            System.out.println(modelo + " acelerou! Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println(modelo + " está sem combustível!");
        }
    }

    // Método que faz o carro frear
    // Diminui a velocidade em 10 km/h
    // Se a velocidade ficar abaixo de zero, ela é ajustada para 0
    public void frear() {
        velocidade -= 10;
        if (velocidade < 0) velocidade = 0;
        System.out.println(modelo + " freou. Velocidade atual: " + velocidade + " km/h");
    }

    // Método que abastece o carro com a quantidade de litros informada
    // O combustível máximo é 100%
    // Caso ultrapasse esse limite, o valor é ajustado para 100
    public void abastecer(int litros) {
        combustivel += litros;
        if (combustivel > 100) combustivel = 100;
        System.out.println(modelo + " abastecido. Combustível: " + combustivel + "%");
    }

}
