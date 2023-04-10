package virado.no.jiray.javacore.Aintroducaoclasses.mains;

import virado.no.jiray.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre";
        professor.idade = 50;
        professor.sexo = 'M';

        System.out.println("Nome: "+ professor.nome + " idade: " +  professor.idade + " sexo: "+ professor.sexo);
    }
}
