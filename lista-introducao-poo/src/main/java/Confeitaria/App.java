package Confeitaria;

//Crie 3 bolos, com preço e sabor de sua preferência,
//        Compre pelo menos 5 vezes qualquer um dos bolos,
//        Exiba o relatório de cada um dos bolos criados

public class App {
    public static void main(String[] args) {
        Bolo bolo01 = new Bolo();
        bolo01.sabor = "laranja";
        bolo01.valor = 5.90;
        bolo01.comprarBolo(150);
        bolo01.comprarBolo(15);
        bolo01.exibirRelatorio();

        Bolo bolo02 = new Bolo();
        bolo02.sabor = "morango";
        bolo02.valor = 1.50;
        bolo02.comprarBolo(2);
        bolo02.exibirRelatorio();

        Bolo bolo03 = new Bolo();
        bolo03.sabor = "chocolate";
        bolo03.valor = 19.90;
        bolo03.comprarBolo(4);
        bolo03.comprarBolo(40);
        bolo03.comprarBolo(32);
        bolo03.exibirRelatorio();


    }
}
