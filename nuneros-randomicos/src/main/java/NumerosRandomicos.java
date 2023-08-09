import java.util.concurrent.ThreadLocalRandom;

public class NumerosRandomicos {
    public static void main(String[] args) {

        Integer numRandom = ThreadLocalRandom.current().nextInt(0,9);
        System.out.println(numRandom);

        Double numeroRandomReal = ThreadLocalRandom.current().nextDouble(0,11);
        System.out.println(numeroRandomReal);

    }
}
