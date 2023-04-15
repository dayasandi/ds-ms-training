package virado.no.jiray.javacore.Gassociacao.mains;

import virado.no.jiray.javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {

    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Romario");
        Jogador jogador03 = new Jogador("Cafú");

        Jogador[] jogadores = {jogador01, jogador02, jogador03};

        for (Jogador jogador : jogadores){
            jogador.imprimi();
        }
    }
}
