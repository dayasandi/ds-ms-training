package virado.no.jiray.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;

    private String genero;

    private String estudio;

    public Anime(){

    }
    public Anime(String nome){
        this.nome = nome;
    }
    public Anime(String tipo, int episodios, String nome, String genero) {
        this();
        this.tipo = tipo;
        this.episodios = episodios;
        this.nome = nome;
        this.genero = genero;
    }

    public Anime(String tipo, int episodios, String nome, String genero, String estudio) {
        this(tipo, episodios, nome, genero);
        this.estudio = estudio;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }
}
