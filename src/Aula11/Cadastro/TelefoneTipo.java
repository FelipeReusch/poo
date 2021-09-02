package Aula11.Cadastro;

public enum TelefoneTipo {
    W ("WHATS"),
    C ("CELULAR"),
    F ("FIXO");

    private String nome;
    TelefoneTipo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
