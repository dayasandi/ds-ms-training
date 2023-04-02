package virado.no.jiray.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean

        int numeroInteiro = 1;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte bytes = 127 ;
        short shortValues = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = '\u0041';

        String nome = "Dayane"; //tipo de referencia
        var nome2 = "Sandi"; //Não passa o tipo da variavel
        System.out.println(nome);

        System.out.println("numero inteiro:" + numeroInteiro + "\n");
        System.out.println("numero long:" + numeroGrande + "\n");
        System.out.println("numeros double:" + salarioDouble + "\n");
        System.out.println("float:" + salarioFloat + "\n");
        System.out.println("byte:" + bytes + "\n");
        System.out.println("short:" + shortValues + "\n");
        System.out.println("boolean verdadeiro:" + verdadeiro + "\n");
        System.out.println("boolean falso:" + falso + "\n");
        System.out.println("character:" + character + "\n");

    }
}
