package virado.no.jiray.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - / *
        int numero01 = 10;
        int numero02 = 20;

        double resultado = numero01 / numero02;

        System.out.println(resultado);

        //%
        int resto = 21 % 7;
        System.out.println(resto);

        // < : <= >= == !=
        //sempre retornam um valor verdadeiro ou falso
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferentedDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte:" + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte:" + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte:" + isDezIgualVinte);
        System.out.println("isDezDiferentedDez: " + isDezDiferentedDez);


        //&& (E) || (OU) ! (NEGAÇÃO)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        // ||

        double contaCorrente = 1500;
        double poupanca = 3500;
        double playstation = 2500;
        boolean isCompravel = contaCorrente >= playstation || poupanca >= playstation;
        System.out.println("isCompravel:" + isCompravel);

        //operadores de Atribuição = += -= *= /= %=

        double bonus = 1800;
        bonus = 2000; //atribuindo outro valor a variavel
        bonus += 1000; //valor da variavel + o valor que quer acrescentar (bonus + 2)
        bonus -= 1000; //valor da variavel - o valor que quer subtrair (bonus - 2)
        bonus *= 2; //multiplicar o valor (bonus * 2)

        //incremento
        int contador = 0;
        contador += 1; //contador = contador + 1
        contador++; //primeiro executa o contador depois incrementa
        ++contador; //primeiro incrementa mais um depois executa
    }
}
