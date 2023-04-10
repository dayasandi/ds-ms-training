package virado.no.jiray.javacore.Bintroducaometodos.mains;

import virado.no.jiray.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.somaArray(new int[]{1,2,3,4,5});
        calc.somaVarArgs(1,2,3,4,5);
    }
}
