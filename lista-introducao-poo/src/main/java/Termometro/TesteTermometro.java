package Termometro;

public class TesteTermometro {
    public static void main(String[] args) {
        Termometro termometro01 = new Termometro(24.7, 7.0, 14.0);

        termometro01.diminuiTemperatura(5.60);
        termometro01.aumentaTemperatura(29.52);
        termometro01.exibirFahrenheit();
    }
}
