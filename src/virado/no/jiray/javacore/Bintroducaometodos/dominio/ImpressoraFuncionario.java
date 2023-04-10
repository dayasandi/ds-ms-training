package virado.no.jiray.javacore.Bintroducaometodos.dominio;

public class ImpressoraFuncionario {

    public void imprimeNome(Funcionario func) {
        System.out.println(func.nome);
        System.out.println(func.idade);
        if (func.salario == null) {
            return;
        }
        for (double salario : func.salario) {
            System.out.println(salario + " ");
        }
        imprimeMediaSalario(func.salario);
    }

    public void imprimeMediaSalario(double[] salarios) {
        if (salarios == null) {
            return;
        }
        double media = 0;
         for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
        System.out.println("Média salario: " + media);
    }
}
