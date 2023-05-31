package virado.no.jiray.javacore.DayStrategy;

public class validacao1 implements IValidator<String>{

    @Override
    public boolean validar(String valor) {
        if (valor.equalsIgnoreCase("cpf")){
            System.out.println("Isto é a validação de cpf");
            return true;
        }else {
            System.out.println("Não é um cpf");
            return false;
        }
    }
}
