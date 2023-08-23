import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a tabuada que deseja:");
        Integer tabuada = leitor.nextInt();

        System.out.println("Digite o número correspondente a operação desejada:\n" +
                "1 - Soma\n" +
                "2 - Multiplicação\n" +
                "3 - Divisão\n" +
                "4 - Subtração\n" +
                "5 - Potencia\n" +
                "6 - Resto\n" +
                "0 - Sair");
        Integer operacao = leitor.nextInt();


        for (Integer i = 1; i <= 10; i++) {
            Integer conta = tabuada + i;
            if (operacao.equals(1)){
                System.out.println(tabuada + "+" + i + "=" + conta);
            }
        }

        for (Integer i = 1; i <= 10; i++) {
            Integer conta = tabuada * i;
            if (operacao.equals(2)){
                System.out.println(tabuada + "x" + i + "=" + conta);
            }
        }

        for (Integer i = 1; i <= 10; i++) {
            int conta = tabuada / i;
            if (operacao.equals(3)){
                System.out.println(tabuada + "/" + i + "=" + conta);
            }
        } //como que faz divisao aaaaa

        for (Integer i = 1; i <= 10; i++) {
            Integer conta = tabuada - i;
            if (operacao.equals(4)){
                System.out.println(tabuada + "-" + i + "=" + conta);
            }
        }
        for (Integer i = 1; i <= 10; i++) {
            if (operacao.equals(5)) {
                Double calc = Math.pow(tabuada, i);
                System.out.println(tabuada + " ^ " + i + " = " + calc);
            }
        }

         for (Integer i = 1; i <= 10; i++) {
             if (operacao.equals(5)) {
                 Integer conta = tabuada % i;
                 System.out.println(tabuada + " % " + i + " = " + conta);
             }
            }
         if (operacao.equals(0)) {
            System.out.println("até mais!");
        }
    }
}