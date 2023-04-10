package virado.no.jiray.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudantes {
    public void imprime(Estudante estudante){

        System.out.println("Dados estudante: "+ estudante.nome);
        System.out.println("Dados estudante: "+ estudante.idade);
        System.out.println("Dados estudante: "+ estudante.sexo);
        estudante.nome = "Alterado no metodo Imprime";
    }
}
