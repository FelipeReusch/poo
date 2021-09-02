package Aula11.Cadastro;

public class Telefone {
    private Integer ddd;
    private Long numero;
    private TelefoneTipo tipo;

    public Integer getDdd() {
        return ddd;
    }

    public Long getNumero() {
        return numero;
    }

    public TelefoneTipo getTipo() {
        return tipo;
    }

    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public void setTipo(TelefoneTipo tipo) {
        this.tipo = tipo;
    }
}
