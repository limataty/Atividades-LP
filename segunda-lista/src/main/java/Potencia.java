public class Potencia {
    public static void main(String[] args) {
        int base = 2;
        int expoente = 5;
        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado = resultado + base;
        }

        System.out.println("Resultado: " + resultado);
    }
}
