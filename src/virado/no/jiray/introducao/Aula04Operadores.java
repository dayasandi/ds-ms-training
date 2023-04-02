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

        System.out.println("isDezMaiorQueVinte:"+ isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte:"+ isDezMenorQueVinte);
        System.out.println("isDezIgualVinte:"+ isDezIgualVinte);
        System.out.println("isDezDiferentedDez: "+ isDezDiferentedDez);


        //&& (E) || (OU) ! (NEGAÇÃO)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: "+ isDentroDaLeiMenorQueTrinta);
    }
}
