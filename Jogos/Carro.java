public class Carro {
	
	private String modelo;
    private int velocidade;
    private int combustivel;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
        this.combustivel = 100;
    }

    public void acelerar() {
        if (combustivel > 0) {
            velocidade += 10;
            combustivel -= 5;
            System.out.println(modelo + " acelerou! Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println(modelo + " está sem combustível!");
        }
    }

    public void frear() {
        velocidade -= 10;
        if (velocidade < 0) velocidade = 0;
        System.out.println(modelo + " freou. Velocidade atual: " + velocidade + " km/h");
    }

    public void abastecer(int litros) {
        combustivel += litros;
        if (combustivel > 100) combustivel = 100;
        System.out.println(modelo + " abastecido. Combustível: " + combustivel + "%");
    }


}