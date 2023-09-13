package bilhete;

public class BilheteUnico {
    //Atributos: Caracteristicas
    String nomeTitular;
    Double saldo; //carac do bilhete unico

    //Métodos: Comportamentos
    void carregar(Double valor){
        System.out.println(String.format(
                """
                Saldo antes de carregar: %.2f""", saldo));

        saldo+=valor;

        System.out.println(String.format(
                """
                Saldo após carregar: %.2f""", saldo));
    }
}
