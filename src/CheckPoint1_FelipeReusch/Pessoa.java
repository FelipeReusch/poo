package CheckPoint1_FelipeReusch;

public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private Genero genero;
    private String email;
    private CheckPoint1_FelipeReusch.pessoaTipo pessoaTipo;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public Genero getGenero() {
        return genero;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CheckPoint1_FelipeReusch.pessoaTipo getPessoaTipo() {
        return pessoaTipo;
    }

    public void setPessoaTipo(CheckPoint1_FelipeReusch.pessoaTipo pessoaTipo) {
        this.pessoaTipo = pessoaTipo;
    }
}
