package virado.no.jiray.javacore.Gassociacao.mains;

import virado.no.jiray.javacore.Gassociacao.dominio.Escola;
import virado.no.jiray.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        //relacionamento muitos para um
        Professor professor = new Professor("Tadeu");
        Professor[] professores = {new Professor("Junior"), new Professor("Matheus"), new Professor("Anselmo")};
        Escola escola = new Escola("Eustacio Costa", professores);
        Escola escola2 = new Escola("Tão Distante", professores);
        escola2.setProfessores(professores);

        escola.imprimi();
        escola2.imprimi();
    }
}
