package CheckPoint1_FelipeReusch;

public class Professor extends Pessoa{
    private Formacao formacao;
    private Double valorHora;
    private Pessoa pessoa;

    public Formacao getFormacao() {
        return formacao;
    }

    public void setFormacao(Formacao formacao) {
        this.formacao = formacao;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
