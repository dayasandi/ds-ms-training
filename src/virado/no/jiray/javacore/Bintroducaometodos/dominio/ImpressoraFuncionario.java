package virado.no.jiray.javacore.Bintroducaometodos.dominio;

public class ImpressoraFuncionario {

    public void imprimeNome(Funcionario func) {
        System.out.println(func.getNome());
        System.out.println(func.getIdade());
        if (func.getSalario() == null) {
            return;
        }
        for (double salario : func.getSalario()) {
            System.out.println(salario + " ");
        }
        imprimeMediaSalario(func);
    }

    public void imprimeMediaSalario(Funcionario funcionario) {
        if (funcionario.getSalario() == null) {
            return;
        }
        double media = funcionario.getMedia();
         for (double salario : funcionario.getSalario()) {

                   media += salario;
            }
            media /= funcionario.getSalario().length;
        System.out.println("Média salario: " + media);
    }
}
