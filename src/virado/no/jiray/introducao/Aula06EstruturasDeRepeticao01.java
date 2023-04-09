package virado.no.jiray.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //estrutura de repetição
        //while do while for

    int count = 0;

    while (count < 10){//acrescenta depois imprime
        System.out.println(++count);
    }
    count = 0;
    while (count < 10){//imprime depois acrescenta
            System.out.println(count++);
        }
    count = 0;
    do {//executa pelo menos uma vez mesmo que seja falsa
        System.out.println("dentro do do" + count++);
    }while (count < 10);

    for (int i = 0; i < 10; i++){
        System.out.println("For "+i);

    }
    }
}
