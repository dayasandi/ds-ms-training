package virado.no.jiray.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
    int valorTotal = 30000;
    for (int parcela = valorTotal; parcela >= 1; parcela--){
        double valrParcela = valorTotal / parcela;
        if (valrParcela > 1000 ){
            continue;
        }
        System.out.println("Parcela "+ parcela + " R$ "+valrParcela );
    }
    }
}
