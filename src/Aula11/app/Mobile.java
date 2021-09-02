package Aula11.app;

import Aula11.Cadastro.Cliente;
import Aula11.Cadastro.Endereco;
import Aula11.Contas.ContaPoupanca;

import java.util.Date;


public class Mobile {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setCpf("34234");
        cliente.setDataNascimento(new Date());
        cliente.setNome("FELIPE");

        Endereco endereco = new Endereco();
        endereco.setLogradouro("rua bla");
        endereco.setNumero("213");
        cliente.setEndereco(endereco);

        ContaPoupanca conta = new ContaPoupanca();
        conta.setNumero(12321);
        conta.setAgencia(123);
        conta.setCliente(cliente);

        conta.depositar(150.0);
        conta.sacar(50.0);
        conta.sacar(150.0);

        System.out.println("O saldo é " + conta.getSaldo());


    }
}
