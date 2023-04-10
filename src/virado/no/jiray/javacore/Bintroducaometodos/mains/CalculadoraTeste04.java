package virado.no.jiray.javacore.Bintroducaometodos.mains;

import virado.no.jiray.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int num1 = 1;
        int num2 = 2;

        calc.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro da CalculadoraTeste04");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }
}
