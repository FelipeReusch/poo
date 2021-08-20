package aula06;

public class cachorro {

        private String raca;
        private String idade;
        private Double peso;
        private boolean possuiChip;
        private boolean temFerimento;
        private String nome;

        public cachorro(String raca, String idade, Double peso, boolean possuiChip, boolean temFerimento, String nome) {
            this.raca = raca;
            this.idade = idade;
            this.peso = peso;
            this.possuiChip = possuiChip;
            this.temFerimento = temFerimento;
            this.nome = nome;
        }

        public String getRaca() {
            return raca;
        }

        public String getIdade() {
            return idade;
        }

        public Double getPeso() {
            return peso;
        }

        public String getNome() {
            return nome;
        }

        public void podeSerPerdido(){
            if (!possuiChip) {
                System.out.println(this.nome + " esta perdido");
            } else {
                System.out.println(this.nome + " não esta perdido");
            }
        }

        public void podeSerAdotado() {
            if (this.peso > 5 && this.temFerimento == false) {
                System.out.println(this.nome + " pode ser adotado");
            } else {
                System.out.println(this.nome + " não pode ser adotado");
            }
        }


}
