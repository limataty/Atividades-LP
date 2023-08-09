public class NivelamentoOperadores {
    public static void main(String[] args) {
        //no JS:
        //soma: +
        //subtracao: -
        //divisão: /
        //multiplicacao: *
        //resto: %

        //alt + f6 para modificar nome da variavel

        Double numero01 = 5.0;
        Double numero02 = 4.0;

        System.out.println("soma:" + (numero01+numero02));
        System.out.println("subtracao:" + (numero01-numero02));
        System.out.println("divisão:" + (numero01/numero02));
        System.out.println("multiplicacao:" + (numero01*numero02));

        //para calcular potencia
        Double resultadoPotencia = Math.pow(numero01, numero02);
        System.out.println("Resultado pow:" + resultadoPotencia);

        //metodo direto, sem variavel
        System.out.println("Resultado sem variavel:" + Math.pow(numero01, numero02));
    }
}
