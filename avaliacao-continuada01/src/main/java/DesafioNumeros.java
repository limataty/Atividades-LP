import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numerosList = new ArrayList<>();

        System.out.println("Digite numeros inteiros:");

        int numero = scanner.nextInt();
        while (numero != 0) {
            numerosList.add(numero);
            numero = scanner.nextInt();
        }

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        int somaTotal = 0;
        Integer menorNumero = null;
        Integer maiorNumero = null;

        int i = 0;
        while (i < numerosList.size()) {
            int num = numerosList.get(i);

            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }

            somaTotal += num;

            if (menorNumero == null || num < menorNumero) {
                menorNumero = num;
            }

            if (maiorNumero == null || num > maiorNumero) {
                maiorNumero = num;
            }

            i++;
        }

        System.out.println("numeros pares: " + pares);
        System.out.println("numeros impares: " + impares);
        System.out.println("soma de todos os numeros: " + somaTotal);
        System.out.println("menor numero: " + menorNumero);
        System.out.println("maior numero: " + maiorNumero);
    }
}
