public class NivelamentoCondicionais {
    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 42;

        if(numero01 > numero02) {
            System.out.println("é maior!");
        }else if(numero01 == numero02){
            System.out.println("é igual!");
        }else if(numero01 < numero02){
            System.out.println("é menor!");
        }

        String nome01 = "Xampson";
        String nome02 = "Xampson";

        //NUNCA USE ==, SEMPRE .equals()

        if(nome01.equals(nome02)) {
            System.out.println("nome igual");
        }else{
            System.out.println("nome diff!");
        }

        //tipo primitivo sempre tem valor inicial, padrao
        //tipo wrapper é null
        Boolean bloqueado = true;

        if(!bloqueado){
            System.out.println("ta livre");
        }else {
            System.out.println("ta bloqueado");
        }
    }
}
