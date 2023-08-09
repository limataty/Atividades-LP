import java.util.concurrent.ThreadLocalRandom;

public class NumerosRandomicos {
    public static void main(String[] args) {

        Integer numRandom = ThreadLocalRandom.current().nextInt(0,9);
        System.out.println(numRandom);
    }
}
