package virado.no.jiray.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        /*
        byte, short, int, long, float e double iniciam com 0
        char '\u0000' inicia com espaço em branco ' '
        boolean inicia como false
        String inicia como null
         */
        int[] idades = new int[3];
        String[] nome = new String[3];
        boolean[] boo = new boolean[3];
        char[] caracter = new char[3];

        System.out.println("Array de inteiro iniciado sem valor \n");

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2] + "\n");

        System.out.println("Array de String iniciado sem valor\n");

        System.out.println(nome[0]);
        System.out.println(nome[1]);
        System.out.println(nome[2] + "\n");

        System.out.println("Array de char iniciado sem valor\n");

        System.out.println(caracter[0]);
        System.out.println(caracter[1]);
        System.out.println(caracter[2] + "\n");

        System.out.println("Array de boolean iniciado sem valor \n");

        System.out.println(boo[0]);
        System.out.println(boo[1]);
        System.out.println(boo[2] + "\n");

        //Iterando sobre os arrays
        System.out.println("Iterando sobre arrays \n");
        nome[0] = "Dayane";
        nome[1] = "João";
        nome[2] = "Maria";

        for (int i = 0; i < 3; i++) {
            System.out.println(nome[i]);
        }

        System.out.println("Iterando sobre array utilizando o length que conta o tamanho do array \n");
        for (int i = 0; i < nome.length; i++) {
            System.out.println(nome[i]);
        }
    }
}
