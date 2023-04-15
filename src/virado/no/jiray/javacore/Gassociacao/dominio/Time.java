package virado.no.jiray.javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprimi(){
        System.out.println("Nome Time: "+ this.nome);
        if (jogadores == null){
            return;
        }
        for (Jogador jogador : jogadores){
            System.out.println("Nome jogador: " + jogador.getNome());
        }
    }
    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
