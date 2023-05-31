package virado.no.jiray.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private  Seminario[] seminarios; // TEM UM


    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this(nome);
        this.especialidade = especialidade;
    }

    public void imprimi(){
        System.out.println("Professor: "+ this.nome);
        if (this.seminarios == null) return;
        System.out.println("### Seminarios cadastrados ##");
        for (Seminario seminario : seminarios){
            System.out.println("## Seminarios cadastrados ##");
            System.out.println(seminario.getSeminario());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("## Alunos ##");
            for (Aluno aluno : seminario.getAlunos()){
                System.out.println("Aluno: " + aluno.getNome() + " indade: " + aluno.getIdade());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
