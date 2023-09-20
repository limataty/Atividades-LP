package Confeitaria;//sabor (chocolate, morango ou abacaxi)

public class Bolo {
    String sabor;
    Double valor;
    Integer quantidadeVendida = 0;

    void comprarBolo(Integer quantidadeCompras) {
        Integer vendas = quantidadeVendida + quantidadeCompras;
        if (vendas > 100){
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo");
        }else{
            quantidadeVendida += quantidadeCompras;
        }
    }

void exibirRelatorio(){
    Double valorFinal = quantidadeVendida * valor;
    System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$%.2f",sabor,quantidadeVendida,valorFinal));
}

}
