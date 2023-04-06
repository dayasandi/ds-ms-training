package virado.no.jiray.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        //if = SE isso faça isso SE aquilo faça isso só recebe boolean ele só executa se for verdadeiro
        //else if se não se faça isso
        //else = se não faça isso

        int idade = 20;
        boolean isAutorizado = idade >= 18;

        if (isAutorizado){
            System.out.println("Autorizado a comprar bebida");
        }else {
            System.out.println("não pode comprar bebida");
        }
        System.out.println("fora do if");
    }
}
