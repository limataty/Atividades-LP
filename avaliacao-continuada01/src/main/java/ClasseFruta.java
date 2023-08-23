import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClasseFruta{
    public static void main(String[] args) {
        List<String> frutasList = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome de uma fruta");
        String fruta = leitor.nextLine().toLowerCase();

        if (fruta.equals(frutasList)) {
            System.out.println("A fruta" + fruta + "existe na lista");
        } else {
            frutasList.add(fruta);
            System.out.println(frutasList);
        }
    }
}
