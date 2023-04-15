package virado.no.jiray.javacore.Fmodificarestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    //-1 - não pode acessar variaves da classe dentro de metodos estaticos e inicializadores estaticos pq elas podem nao existir no momento da execução
    //0 - Bloco de inicialização é carregado quando a jvm carregar a classe
    //1 - Alocação de espaço em memoria
    //2 - Cada atributo de classe é criado e inicializado com valores default
    //3 - bloco de inicialização é executado
    //4 - construtor é executado
    //5 - bloco de inicialização statico é executado apenas uma vez quando a jvm inicia
    //6 - os blocos de inicialização são executados na ordem que foram criados
    //7 - blocos de inicialização não estaticos são executados depois dos blocos staticos
    //8 - blocos de enicialização nao estatico são executados sempre que um objeto é criado

    static {
        System.out.println("Dentro do bloco de inicialização statico 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length ; i++) {
            episodios[i] = i+1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização statico 2");
    }
    static {
        System.out.println("Dentro do bloco de inicialização statico 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não statico");
    }
    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        for (int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
