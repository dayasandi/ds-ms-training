package virado.no.jiray.javacore.Eblocosdeinicializacao.mains;

import virado.no.jiray.javacore.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTeste01 {

    public static void main(String[] args){

        Anime anime = new Anime("Jiraya");

        System.out.println(anime.getNome());
        for (int episodio : anime.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}
