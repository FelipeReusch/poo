package CheckPoint1_FelipeReusch;

public class Aluno extends Pessoa{
    private String matricula;
    private Pessoa pessoa;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
