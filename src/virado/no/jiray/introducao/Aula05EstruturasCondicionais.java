package virado.no.jiray.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        //if = SE isso faça isso SE aquilo faça isso só recebe boolean ele só executa se for verdadeiro

        int idade = 10;
        if (idade >= 18){
            System.out.println("Autorizado a comprar bebida");
        }else {
            System.out.println("não pode comprar bebida");
        }
        System.out.println("fora do if");
    }
}
