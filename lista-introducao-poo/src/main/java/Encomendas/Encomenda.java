package Encomendas;
public class Encomenda {
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;

    Double valorFrete = 0.0;

    Double calcularFrete(){
        switch (tamanho) {
            case "P":
                valorFrete = valorEncomenda * 0.01;

            case "M":
                valorFrete = valorEncomenda * 0.03;

            case "G":
                valorFrete = valorEncomenda * 0.05;
        }

        if (distancia <= 50){
            valorFrete += 3;
        }else if(distancia > 50 && distancia <= 200){
            valorFrete += 5;
        }else {
            valorFrete += 7;
        }

        return valorFrete;

    }

    void emitirEtiqueta(){
        Double valorFrete = calcularFrete();
        Double valorTotal = valorFrete + valorEncomenda;
        System.out.println(String.format("""
                ***** ETIQUETA PARA ENVIO *****
                Endereço do remetente: %s
                Endereço do destinatário: %s
                Tamanho: %s
                --------------------------------------------------
                Valor encomenda: R$%.2f
                Valor frete: R$%.2f
                --------------------------------------------------
                Valor total: R$%.2f
                """, enderecoRemetente, enderecoDestinatario, tamanho, valorEncomenda, valorFrete, valorTotal));
    }

}
