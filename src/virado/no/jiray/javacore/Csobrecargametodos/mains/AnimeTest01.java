package virado.no.jiray.javacore.Csobrecargametodos.mains;

import virado.no.jiray.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main (String[] args){
        Anime anime = new Anime();
        anime.anime("TV", 12, "Jiraya","Comedia");
        anime.imprime();

    }
}
