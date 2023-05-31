package virado.no.jiray.javacore.DayStrategy;

public class main {
    public static void main(String[] args) {
        Context contex = new Context();

        String cpf = "cnpj";
        String cnpj = "teste cnpj";
        boolean res = contex.validates(cpf, new validacao1());

        System.out.println(res);
    }
}
