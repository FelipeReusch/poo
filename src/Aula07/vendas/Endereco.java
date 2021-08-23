package Aula07.vendas;

public class Endereco {
        private String endereco;
        private String cep;
        private String cidade;
        private String uf;

        public String getEndereco() {
            return endereco;
        }

        public String getCep() {
            return cep;
        }

        public String getCidade() {
            return cidade;
        }

        public String getUf() {
            return uf;
        }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
