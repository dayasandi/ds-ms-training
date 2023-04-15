package virado.no.jiray.javacore.Gassociacao.mains;

import virado.no.jiray.javacore.Gassociacao.dominio.Jogador;
import virado.no.jiray.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        //associacao unidirecional um para muitos
        Jogador jogador01 = new Jogador("Pelé");
        Time time = new Time("Corinthians");
        jogador01.setTime(time);

        jogador01.imprimi();

    }
}
