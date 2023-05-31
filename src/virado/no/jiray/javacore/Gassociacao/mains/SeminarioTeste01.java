package virado.no.jiray.javacore.Gassociacao.mains;

import virado.no.jiray.javacore.Gassociacao.dominio.*;

public class SeminarioTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Rua: 25 de março");
        Aluno aluno = new Aluno("Joao", 20);
        Professor professor = new Professor("Pedro", "Matematica");
        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("Onde achar one piece", alunos, local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);


        professor.imprimi();
    }
}
