public class QuestaoTres {
    public static void main(String[] args) {
        Double valorProd = 23.90;
        Integer qtdVendida = 2;
        Integer valorPago = 90;

        System.out.println("Seu troco será de R$" + (valorPago - (valorProd * qtdVendida)));
    }
}
