package virado.no.jiray.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //estrutura de repetição
        //while do while for
    //imprima os primeiros 25 numeros de dado valor
    int valorTotal = 30000;
    for (int parcela = 1; parcela <= valorTotal; parcela++){
        double valrParcela = valorTotal / parcela;
        if (valrParcela < 1000 ){
            break;
        }
        System.out.println("Parcela "+ parcela + " R$ "+valrParcela );
    }
    }
}
