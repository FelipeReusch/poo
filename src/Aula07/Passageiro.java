package Aula07;

import java.util.List;

public class Passageiro {
    private String cpf;
    private String nome;
    private Endereco origem;
    private Telefone telefones;
    private List<Endereco> destinos;

    public List<Endereco> getDestinos(){
        return destinos;
    }

    public void setOrigem(Endereco origem) {
        this.origem = origem;
    }

    public void setTelefones(Telefone telefones) {
        this.telefones = telefones;
    }

    public void setDestinos(List<Endereco> destinos) {
        this.destinos = destinos;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
