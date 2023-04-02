package fundamentos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeiroPrograma {
    public static void main(String[] args) {
//        String nome = "Dayane";
//        String sobreNome = "Sandi";
//        System.out.println(nome +" "+ sobreNome);

        List<String> nomes = Arrays.asList("Dayane", "Maria", "Jõao", "Pedro");
        List<String> res = new ArrayList<>();

        nomes.stream().filter(n -> n.contains("D") || n.contains("J"))
                .forEach(n -> res.add(n));
        System.out.println(res);
    }

}
