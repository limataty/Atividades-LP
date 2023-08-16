public class Votacao {
    public static void main(String[] args) {
        int totalVotos = 0;
        int mussarela = 0;
        int calabresa = 0;
        int quatroQueijos = 0;

        int[] votos = {1, 2, 3, 1, 3, 2, 1, 2, 1, 3}; // Exemplo de votos

        while (totalVotos < votos.length) {
            int voto = votos[totalVotos];

            if (voto == 1) {
                mussarela++;
            } else if (voto == 2) {
                calabresa++;
            } else if (voto == 3) {
                quatroQueijos++;
            }

            totalVotos++;
        }

        System.out.println("Quantidade de votos para Mussarela: " + mussarela);
        System.out.println("Quantidade de votos para Calabresa: " + calabresa);
        System.out.println("Quantidade de votos para Quatro Queijos: " + quatroQueijos);

        if (mussarela > calabresa && mussarela > quatroQueijos) {
            System.out.println("O sabor favorito é Mussarela.");
        } else if (calabresa > mussarela && calabresa > quatroQueijos) {
            System.out.println("O sabor favorito é Calabresa.");
        } else if (quatroQueijos > mussarela && quatroQueijos > calabresa) {
            System.out.println("O sabor favorito é Quatro Queijos.");
        } else {
            System.out.println("Houve empate entre os sabores.");
        }
    }
}
