package Aula11.Cadastro;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private Endereco endereco;
    private List<Telefone> telefones = new ArrayList<Telefone>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
