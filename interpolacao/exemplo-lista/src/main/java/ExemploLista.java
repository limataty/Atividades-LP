import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        List listaEstranha = new ArrayList();

        listaEstranha.add("Xampson");
        listaEstranha.add(42);
        listaEstranha.add(true);
        listaEstranha.add(42.5);


        List<String> nomes = new ArrayList<>();

        nomes.add("Beralde");
        nomes.add("Dougras");
        nomes.add("Taty");
        nomes.add("Torresmo Felinos");

        System.out.println(nomes);

        String segundoNome = nomes.get(1);
        System.out.println("O segundo nome é: " + segundoNome);

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i + " - " + nomes.get(i));
        }

        //Removendo um elemento
        nomes.remove(0);

        String nomeRemover = "Dougras";
        for (int i = 0; i < nomes.size(); i++) {
            String nomeDaVez = nomes.get(i);
            if(nomeDaVez.equals(nomeRemover)){
                nomes.remove(i);
            }
        }

        System.out.println("Nome após remover: " + nomes);

        //Adicionar e "empurra" os outros elementos para baixo
        nomes.add(0, "Teste");
        //nomes.clear()  <-  limpa a lista toda
        //nomes.removeAll(nomesQueQueroRemover)

        if(nomes.isEmpty()){
            System.out.println("Sem nomes da lista: ");
        }

    }
}