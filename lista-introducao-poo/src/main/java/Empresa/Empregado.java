package Empresa;
//
//Atributos:
//        • nome, cargo e salario.
//        Método:
//        • reajustarSalario: que receberá como parâmetro a porcentagem do reajuste, e atualiza o atributo
//        salario.
//        Crie uma classe de teste chamada Tes
public class Empregado {
    String nome;
    String cargo;
    Double salario = 0.0;

    void reajustarSalario(Double porcentagemReajuste){
        salario *= (porcentagemReajuste / 100);
        System.out.println(String.format("""
                Nome: %s;
                Cargo: %s;
                Salario: %.2f;
                """,nome,cargo,salario));
    }
}
