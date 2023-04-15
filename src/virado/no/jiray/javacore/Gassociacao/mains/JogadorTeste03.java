package virado.no.jiray.javacore.Gassociacao.mains;

import virado.no.jiray.javacore.Gassociacao.dominio.Jogador;
import virado.no.jiray.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Joao");
        Jogador jogador01 = new Jogador("Pedro");
        Time time = new Time("Melhor do mundo");
        Jogador[] jogadores = {jogador, jogador01};

        jogador.setTime(time);
        jogador01.setTime(time);
        time.setJogadores(jogadores);

        jogador.imprimi();
        jogador01.imprimi();

        System.out.println("----Time---");
        time.imprimi();
    }
}
