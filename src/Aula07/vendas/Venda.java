package Aula07.vendas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venda {
        public static void main(String[] args) {
            Cliente felipe = new Cliente();
            felipe.setNome("Felipe Reusch");
            felipe.setTelefone("444555999");

            Endereco endereco = new Endereco();
            endereco.setEndereco("Rua Bla");
            endereco.setCep("888-9999");
            endereco.setCidade("Rio");
            endereco.setUf("Rj");

            felipe.setEndereco(endereco);

            ArrayList<Produto> produtos = new ArrayList<Produto>();
            Produto tv = new Produto("TV", 10.000);
            Produto geladeira = new Produto("Geladeira", 3.000);
            produtos.add(tv);
            produtos.add(geladeira);

            Pedido pedido = new Pedido();
            pedido.setCliente(felipe);
            pedido.setCodigo(10);
            pedido.setProdutos(produtos);

            System.out.println("FIM");
        }
}


