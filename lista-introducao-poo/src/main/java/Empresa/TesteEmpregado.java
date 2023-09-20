package Empresa;

public class TesteEmpregado {
    public static void main(String[] args) {
//        Dentro do método main, instancie um objeto da classe Empregado que tenha como nome
//“João”, salário inicial de R$ 5.400,00 e cargo “Analista de Sistemas”.
//• Imprima na tela o nome, o cargo e o salário reajustado, sabendo que este empregado recebeu
//        um reajuste salarial de 15%.
//• Crie outro objeto da classe Empregado e forneça atributos de sua escolha. Depois imprima seus
//        dados e também seu salário reajustado.

        Empregado empregado01 = new Empregado();
        empregado01.nome = "João";
        empregado01.salario = 5400.00;
        empregado01.cargo = "Analista de Sistemas";

        empregado01.reajustarSalario(15.00);

        Empregado empregado02 = new Empregado();
        empregado02.nome = "Aspas";
        empregado02.salario = 100500.99;
        empregado02.cargo = "Pro Player";

        empregado02.reajustarSalario(50.80);

    }
}
