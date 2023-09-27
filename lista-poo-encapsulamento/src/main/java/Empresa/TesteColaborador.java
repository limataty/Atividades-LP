package Empresa;

public class TesteColaborador {
    public static void main(String[] args) {
        Colaborador colaborador01 = new Colaborador("kleber","gerente", 453.64);
        Colaborador colaborador02 = new Colaborador("ryan","otaku", 4.50);

        RecursosHumanos recursosHumanos01 = new RecursosHumanos(1,3);

        System.out.println(String.format("nome: %s,cargo: %s, salario: R$%.2f", colaborador01.getNome(),colaborador01.getCargo(),colaborador01.getSalario()));
        System.out.println(String.format("nome: %s,cargo: %s, salario: R$%.2f", colaborador02.getNome(),colaborador02.getCargo(),colaborador02.getSalario()));

        recursosHumanos01.promoverColaborador(colaborador01, "dev", 22245.34);
        recursosHumanos01.promoverColaborador(colaborador01, "dev", 5.34);
        recursosHumanos01.reajustarSalario(colaborador02, 2476.34);

    }
}
