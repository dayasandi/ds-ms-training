package virado.no.jiray.javacore.Bintroducaometodos.mains;

import virado.no.jiray.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        System.out.println("Agora subtraindo numeros");
        calc.subtraiDoisNumeros();

        System.out.println("Imprime passando parametro");
        calc.multiplicaDoisNumeros(5, 9);
    }
}
