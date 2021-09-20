package Aula16;

public class PessoaFisica extends  Pessoa {
   private String nomeCompleto;

    @Override
    public void setNome(String nome) {
        this.nomeCompleto = nome;
    }
    @Override
    public String getNome() {
        return nomeCompleto;
    }
}
