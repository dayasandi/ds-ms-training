package virado.no.jiray.javacore.Bintroducaometodos.mains;

import virado.no.jiray.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(10, 3);
//        calculadora.divideDoisNumeros(20, 2);
        System.out.println(calculadora.divideDoisNumeros(20, 2));
        System.out.println("-----------");
        System.out.println(result);
        System.out.println("-------------- Imprime");
        calculadora.imprimeDoisNumeros(20,8);
    }
}
