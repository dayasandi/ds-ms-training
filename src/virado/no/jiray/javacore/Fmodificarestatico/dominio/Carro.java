package virado.no.jiray.javacore.Fmodificarestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;

    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void imprime(){
        System.out.println("------------------");
        System.out.println("Nome "+ this.nome);
        System.out.println("Velocidade Maxima "+ this.velocidadeMaxima);
        System.out.println("Velocidade Limite "+ velocidadeLimite);
    }
    public static void setVelocidadeLimite(double velocidadeLimite){
//        this.velocidadeMaxima; metodos staticos não podem acessar variaveis que podem não existir
// variaveis que podem não existir são aquelas que estao dentro da classe que pode ou nao ser instanciada
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
