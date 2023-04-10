package virado.no.jiray.javacore.Bintroducaometodos.mains;


import virado.no.jiray.javacore.Bintroducaometodos.dominio.Estudante;
import virado.no.jiray.javacore.Bintroducaometodos.dominio.ImpressoraEstudantes;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();
        ImpressoraEstudantes impressora = new ImpressoraEstudantes();

        estudante01.nome = "Dayane";
        estudante01.idade = 37;
        estudante01.sexo = 'F';

        estudante02.nome = "Geh";
        estudante02.idade = 35;
        estudante02.sexo = 'F';

        estudante03.nome = "Teste";
        estudante03.idade = 38;
        estudante03.sexo = 'M';

        impressora.imprime(estudante01);
        System.out.println("-------- estudante 02");
        impressora.imprime(estudante02);
        System.out.println("-------- estudante 03");
        impressora.imprime(estudante03);
        System.out.println("------- alterando dentro do metodo domain");
        impressora.imprime(estudante01);
        System.out.println("--------");
        impressora.imprime(estudante02);
        System.out.println("--------");
        impressora.imprime(estudante01);
        System.out.println("--------");
        impressora.imprime(estudante02);
        System.out.println("-------- estudante 03");
        impressora.imprime(estudante03);



    }
}
