package Empresa;
public class RecursosHumanos {
    private Integer promovidos;
    private Integer totalSalariosReajustados;


    public RecursosHumanos(Integer promovidos, Integer totalSalariosReajustados){
        this.promovidos = promovidos;
        this.totalSalariosReajustados = totalSalariosReajustados;
    }

    void reajustarSalario(Colaborador colaborador, Double valorReajuste){
        Double valorAjustado = colaborador.getSalario() + valorReajuste;
        colaborador.setSalario(valorAjustado);
        totalSalariosReajustados += 1;
        System.out.println("agora o salario é de:" + valorAjustado);
        System.out.println("total de salarios ajustados:" + totalSalariosReajustados );
    }

    void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario) {

        if (novoSalario < colaborador.getSalario()) {
            System.out.println("operação inválida!");
        }else {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);

            promovidos += 1;
            System.out.println("total de promovidos:" + promovidos);
        }

    }
    public Integer getPromovidos() {
        return promovidos;
    }

    public void setPromovidos(Integer promovidos) {
        this.promovidos = promovidos;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

    public void setTotalSalariosReajustados(Integer totalSalariosReajustados) {
        this.totalSalariosReajustados = totalSalariosReajustados;
    }
}
