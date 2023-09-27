package Pokemon;

public class TreinadorPokemon {
    private String nome;
    private Integer nivel;

    public TreinadorPokemon(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    void treinarPokemon(Pokemon pokemon){
        Double novaForca = pokemon.getForca() * 1.10;
        pokemon.setForca(novaForca);

        Integer qntdDoces = pokemon.getDoces() + 10;
        pokemon.setDoces(qntdDoces);

        nivel += 2;
    }

    void evoluirPokemon(Pokemon pokemon, String nomeEvolucao){
        if (pokemon.getDoces() >= 50){
            String nomeantigo = pokemon.getNome();
            pokemon.setNome(nomeEvolucao);
            Integer qntdDoces = pokemon.getDoces() - 50;
            pokemon.setDoces(qntdDoces);

            nivel += 10;

            System.out.println(String.format("Pokémon %s evoluiu para -> %s",nomeantigo, nomeEvolucao));
        }else {
            System.out.println("Não foi possível realizar operação");
        }
    }
}
