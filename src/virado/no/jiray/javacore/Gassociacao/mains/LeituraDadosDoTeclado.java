package virado.no.jiray.javacore.Gassociacao.mains;

import java.util.Scanner;

public class LeituraDadosDoTeclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite seu nome:");
        String nome = entrada.next();
        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();
        System.out.println("Digite seu sexo:");
        char sexo = entrada.next().charAt(0);

        System.out.println("Seus dados são:");
        System.out.println("Seu nome é: " +nome);
        System.out.println("Voce tem " +idade + " anos de idade");
        System.out.println("Voce é do sexo: " +sexo);
    }
}
