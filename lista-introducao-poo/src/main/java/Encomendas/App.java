package Encomendas;

public class App {
    public static void main(String[] args) {
        Encomenda encomenda01 = new Encomenda();
        encomenda01.enderecoRemetente = "Rua Alvaro alvim, 124";
        encomenda01.enderecoDestinatario = "Rua haddock lobo, 595";
        encomenda01.distancia = 24.6;
        encomenda01.valorEncomenda = 56.90;
        encomenda01.tamanho = "M";

        encomenda01.emitirEtiqueta();
    }
}
