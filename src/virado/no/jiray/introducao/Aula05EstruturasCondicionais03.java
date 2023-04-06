package virado.no.jiray.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //operadores Ternarios
        double salario = 10000;
        String menssagemDoar = "Eu vou doar 100";
        String mensagemNaoDoar = "Não tenho dinheiro";
        String resultado = salario > 3000 ? menssagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
