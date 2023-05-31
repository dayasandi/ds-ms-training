package virado.no.jiray.javacore.Gassociacao.mains;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char continuar;
        System.out.println("Software de previsão do futuro");
        do {
            System.out.println("Digite sua pergunta e eu responderei sim ou não");

            String pergunta = entrada.nextLine();
            if (pergunta.charAt(pergunta.length() - 1) == '?') {
                if (pergunta.charAt(0) == ' ') {
                    System.out.println("Sim");
                } else {
                    System.out.println("Não");
                }
            }else {
                System.out.println("Utilize interrogação para finalizar suas perguntas");
            }
            System.out.println("Deseja fazer outra pergunta?");
            continuar = entrada.nextLine().toLowerCase().charAt(0);

            if (continuar == 'n') {
                System.out.println("Até a proxima");
            }
        } while (continuar == 's');
    }
}
