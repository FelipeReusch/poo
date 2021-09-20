package Aula16;

public abstract class Pessoa {
    private String registro;
    private TipoPessoa tipo;
    public abstract String getNome();
    public abstract void setNome(String nome);

    public TipoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
