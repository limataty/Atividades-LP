import java.util.concurrent.ThreadLocalRandom;

public class QuestaoUm {
        public static void main(String[] args) {
            int loteria = 5;
            int numTentativa = 0;

            System.out.println("Número escolhido: " + loteria);

            while (true) {
                int numeroSorteado = ThreadLocalRandom.current().nextInt(0,10);
                numTentativa++;

                System.out.println("Tentativa " + numTentativa + ": Número sorteado = " + numeroSorteado);

                if (numeroSorteado == loteria) {
                    break;
                }
            }

            if (numTentativa <= 3) {
                System.out.println("Você é MUITO sortudo");
            } else if (numTentativa >= 4 && numTentativa <= 10) {
                System.out.println("Você é sortudo");
            } else {
                System.out.println("É melhor você parar de apostar e ir trabalhar");
            }
        }
    }

