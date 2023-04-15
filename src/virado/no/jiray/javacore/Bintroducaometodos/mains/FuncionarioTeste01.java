package virado.no.jiray.javacore.Bintroducaometodos.mains;

import virado.no.jiray.javacore.Bintroducaometodos.dominio.Funcionario;
import virado.no.jiray.javacore.Bintroducaometodos.dominio.ImpressoraFuncionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        ImpressoraFuncionario impressora = new  ImpressoraFuncionario();
        func.setNome("Dayane");
        func.setIdade(32);
        func.setSalario(new double[]{1200,987.32, 2000});

        System.out.println("Imprimindo dados do funcionario: ");
        impressora.imprimeNome(func);
//        System.out.println("Imprimindo média salarial do funcionario");
//        impressora.imprimeMediaSalario(func.salario);

    }
}
