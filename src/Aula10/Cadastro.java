package Aula10;

public class Cadastro {
    private String enderecoCompleto;

    public void addEndereco(String logradouro, String numero){
        enderecoCompleto = logradouro + "-" + numero;
    }

    public void addEndereco(String logradouro){
        this.addEndereco(logradouro,"S/N");
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

}
