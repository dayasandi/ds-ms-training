package virado.no.jiray.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;

    private String genero;

    public void anime(String tipo, int episodios, String nome) {
        this.tipo = tipo;
        this.episodios = episodios;
        this.nome = nome;
    }

    public void anime(String tipo, int episodios, String nome, String genero){
        this.anime(tipo, episodios, nome);
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }
}
