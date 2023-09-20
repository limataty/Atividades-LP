package Termometro;

public class Termometro {

//            • Crie um método chamado diminuiTemperatura, que recebe um valor para diminuir a
//    temperatura atual. Caso a nova temperatura seja menor do que a temperaturaMin, atribua
//    para a temperatura atual a temperaturaMin.
//            • Crie um método chamado exibeFahreinheit, que calcula e exibe a temperatura atual na escala
//    de Fahreinheit. Pesquise como é a fórmula para converter de Celsius para Fahreinheit.
//• Crie uma outra classe chamada TesteTermometro, crie uma instância e seus execute os
//    métodos para testar sua classe recém-criada

    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;

    void aumentaTemperatura(Double valorAdicional){
        Double temperaturaNova = temperaturaAtual + valorAdicional;

        if (temperaturaNova > temperaturaMax){
            temperaturaAtual = temperaturaMax;
        } else {
            temperaturaAtual = temperaturaNova;
        }
    }

    void diminuiTemperatura(Double valordiminutivo){
        Double temperaturaNova = temperaturaAtual - valordiminutivo;

        if (temperaturaNova < temperaturaMin){
            temperaturaAtual = temperaturaMin;
        } else {
            temperaturaAtual = temperaturaNova;
        }
    }

    void exibirFahrenheit(){
        Double valorFahrenheit = (temperaturaAtual * 1.8) + 32;
        System.out.println("A temperatura do Termometro em Fahrenheit é: " + valorFahrenheit + "F");
    }
    Termometro(Double temperaturaAtual, Double temperaturaMax, Double temperaturaMin){
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaMax = temperaturaMax;
        this.temperaturaMin = temperaturaMin;
    }
}
