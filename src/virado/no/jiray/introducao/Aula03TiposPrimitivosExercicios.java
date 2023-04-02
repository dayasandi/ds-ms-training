package virado.no.jiray.introducao;

import java.time.LocalDate;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args){
        String nome = "Dayane";
        String endereco = "Rua: dos codigos";
        int numero = 20;
        double salario = 2000;
        LocalDate dataRecebimento = LocalDate.of(2020,10,11) ;

        System.out.println("Eu "+nome+" morando no endereço: "+endereco+ " numero: "+numero+"\nconfirmo que recebi o salario de: "+salario+ " no dia: "+dataRecebimento);
    }
}
