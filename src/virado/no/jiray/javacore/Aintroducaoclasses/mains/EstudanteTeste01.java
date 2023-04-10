package virado.no.jiray.javacore.Aintroducaoclasses.mains;

import virado.no.jiray.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Dayane";
        estudante.idade = 36;
        estudante.sexo = 'F';

        System.out.println("Dados estudante: "+ estudante.nome);
        System.out.println("Dados estudante: "+ estudante.idade);
        System.out.println("Dados estudante: "+ estudante.sexo);
    }
}
