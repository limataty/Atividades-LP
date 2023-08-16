import java.util.Random;

public class Sorteio {
    public static void main(String[] args) {
        int numeroAlvo = new Random().nextInt(100) + 1;
        int pares = 0;
        int impares = 0;
        int primeiraVez = -1;

        Random random = new Random();

        for (int i = 1; i <= 200; i++) {
            int numeroSorteado = random.nextInt(100) + 1;

            if (numeroSorteado == numeroAlvo && primeiraVez == -1) {
                primeiraVez = i;
            }

            if (numeroSorteado % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Número alvo: " + numeroAlvo);
        System.out.println("Sorteado pela primeira vez no sorteio: " + primeiraVez);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
