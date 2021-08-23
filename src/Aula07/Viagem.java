package Aula07;

import java.util.ArrayList;
import java.util.List;

public class Viagem {
    public static void main(String[] args) {
        Passageiro felipe = new Passageiro();
        felipe.setCpf("444222444");
        felipe.setNome("FELIPE REUSCH");

        Endereco origem = new Endereco();
        origem.setBairro("CENTRO");
        origem.setCidade("RIO");
        origem.setLogradouro("RUA BABABA");
        origem.setUf("RJ");
        origem.setNumero("333");

        felipe.setOrigem(origem);

        ArrayList<Telefone> telefones = new ArrayList<Telefone>();
        Telefone telefone = new Telefone(11,8888,TelefoneTipo.FIXO);
        Telefone whats = new Telefone(11,8888,TelefoneTipo.FIXO);
        telefones.add(telefone);
        telefones.add(whats);

        felipe.setTelefones(telefone);

        Endereco destino = new Endereco();
        origem.setBairro("ZONA SUL");
        origem.setCidade("RIO");
        origem.setLogradouro("RUA CHEGOU");
        origem.setUf("RJ");
        origem.setNumero("111");
        ArrayList<Endereco> destinos = new ArrayList<Endereco>();
        destinos.add(destino);

        felipe.setOrigem(destino);

        System.out.println("FIM");









    }
}
