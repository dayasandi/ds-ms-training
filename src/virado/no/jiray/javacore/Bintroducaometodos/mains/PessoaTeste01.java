package virado.no.jiray.javacore.Bintroducaometodos.mains;

import virado.no.jiray.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(15);
        pessoa.setNome("Dayane");

//        pessoa.imprimi();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
