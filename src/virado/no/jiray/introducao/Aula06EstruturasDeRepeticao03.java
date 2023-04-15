package virado.no.jiray.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //estrutura de repetição
        //while do while for
    //imprima os primeiros 25 numeros de dado valor
    int valorMax = 50;
//    for (int i = 0; valorMax <= 50; i++){
//        if (i > 25){
//            break;
//        }
//        System.out.println(i);
//    }

        for (int j = 0; valorMax <= 100 ; j++) {
            if (j == 70){
                System.out.println("se aproximando da velhice "+ j);
                break;
            }
            System.out.println("novo " + j);
        }
    }
}
