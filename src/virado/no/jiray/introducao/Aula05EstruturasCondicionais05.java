package virado.no.jiray.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //operadores switch dado os valores de 1 a 7 imprima se é dia util ou final de semana considerando 1 como domingo
        byte dia = 1;
        switch (dia){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                 System.out.println("Dia de util");
                 break;
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Não é um dia da semana");
                break;
        }
    }
}
