import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {
        int soma = 0;

        while (true) {
            int numeroSorteado = ThreadLocalRandom.current().nextInt(0, 10);

            if (numeroSorteado == 0) {
                break;
            }

            soma += numeroSorteado;
        }

        System.out.println("A soma dos números é " + soma);
    }
}
