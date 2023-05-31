package virado.no.jiray.javacore.Gassociacao.dominio;

public class Seminario {
    private String seminario;

    private Aluno[] alunos;
    private Local local;

    public Seminario(String seminario, Aluno[] alunos, Local local) {
        this.seminario = seminario;
        this.alunos = alunos;
        this.local = local;
    }

    public Seminario(String seminario, Aluno[] alunos) {
        this(seminario);
        this.alunos = alunos;
    }

    public Seminario(String seminario) {
        this.seminario = seminario;
    }

    public String getSeminario() {
        return seminario;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void setSeminario(String seminario) {
        this.seminario = seminario;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
