public class QuestaoDois {
    public static void main(String[] args) {

        Double tempoAquecimento = 23.0;
        Double excAerobico = 3.0;
        Double excMusc = 15.0;

        Double tempoAquecimentoCalc = tempoAquecimento * 12;
        Double excAerobicoCalc = excAerobico * 20;
        Double excMuscCalc = excMusc * 25;

        System.out.println("Olá, Jorge. Você fez um total de " + (tempoAquecimento + excAerobico + excMusc) + " minutos " +
                "de exercícios e perdeu cerca de " + (tempoAquecimentoCalc + excAerobicoCalc + excMuscCalc) + " calorias");
    }
}
