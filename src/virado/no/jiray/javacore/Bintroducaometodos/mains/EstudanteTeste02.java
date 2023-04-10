package virado.no.jiray.javacore.Bintroducaometodos.mains;

import virado.no.jiray.javacore.Bintroducaometodos.dominio.Estudante;
import virado.no.jiray.javacore.Bintroducaometodos.dominio.ImpressoraEstudantes;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Dayane";
        estudante01.idade = 37;
        estudante01.sexo = 'F';

        estudante02.nome = "Geh";
        estudante02.idade = 35;
        estudante02.sexo = 'F';

        estudante01.imprimeEstudante();
        estudante02.imprimeEstudante();

    }
}
