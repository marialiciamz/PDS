
public class Pista {

    private String tipo;
       private int dificuldade;

       public Pista(String tipo, int dificuldade) {
           this.tipo = tipo;
           this.dificuldade = dificuldade;
       }

       public void exibirDetalhes() {
           System.out.println("Pista: " + tipo + " | Dificuldade: " + dificuldade);
       }

       public boolean pistaMolhada(boolean chovendo) {
           return chovendo;
       }

       public void ajustarDificuldade(int novaDificuldade) {
           this.dificuldade = novaDificuldade;
       }
   }
