package Pokemon;

public class TestePokemon {
    public static void main(String[] args) {
        TreinadorPokemon treinador = new TreinadorPokemon("kleber", 12);
        Pokemon pokemon01 = new Pokemon("ryan", "eletrico", 1.0);
        Pokemon pokemon02 = new Pokemon("tatu", "terra", 15.0);

        treinador.treinarPokemon(pokemon01);
        treinador.treinarPokemon(pokemon01);
        treinador.treinarPokemon(pokemon01);
        treinador.treinarPokemon(pokemon01);
        treinador.treinarPokemon(pokemon01);

        System.out.println(String.format("nome: %s,tipo: %s, força: %.2f, doces: %d", pokemon01.getNome(), pokemon01.getTipo(), pokemon01.getForca(),pokemon01.getDoces()));

        treinador.evoluirPokemon(pokemon01, "raio");
        System.out.println(String.format("nome: %s,tipo: %s, força: %.2f, doces: %d", pokemon01.getNome(), pokemon01.getTipo(), pokemon01.getForca(),pokemon01.getDoces()));

        treinador.treinarPokemon(pokemon02);
        treinador.treinarPokemon(pokemon02);
        System.out.println(String.format("nome: %s,tipo: %s, força: %.2f, doces: %d", pokemon02.getNome(), pokemon02.getTipo(), pokemon02.getForca(),pokemon02.getDoces()));
        treinador.evoluirPokemon(pokemon02, "tatu-canastra");

        System.out.println(String.format("Nome: %s, Nível: %d", treinador.getNome(), treinador.getNivel()));

    }
}
