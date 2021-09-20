package Aula19.aplicacao;

import Aula19.mensageria.RemetenteFactorySingleton;
import Aula19.mensageria.TransmissorMensagem;
import Aula19.montadora.AbstractMontadora;
import Aula19.montadora.MontadoraCarroLuxo;
import Aula19.montadora.MontadoraCarroPopular;
import Aula19.veiculo.Carro;


import Aula19.mensageria.TransmissorMensagemFactory;


public class SistemaMontagem {
    public static void main(String[] args) {
        String categoria = "POPULAR";
        AbstractMontadora montadora = null;
        if(categoria.equals("LUXO"))
            montadora = new MontadoraCarroLuxo();
        else
            montadora = new MontadoraCarroPopular();

        Carro carro = montadora.montar();
        carro.getCambio().trocarMarcha();
        carro.getReprodutorMusicial().play();

        String meioContato = "W";
        TransmissorMensagem tm = TransmissorMensagemFactory.criar(meioContato);
        tm.setRemetente(RemetenteFactorySingleton.newInstance());
        tm.enviarMensagem("SEU VEICULO JÁ ESTÁ DISPONIVEL NO PATIO");

        meioContato = "S";
        tm = TransmissorMensagemFactory.criar(meioContato);
        tm.setRemetente(RemetenteFactorySingleton.newInstance());
        tm.enviarMensagem("SEU VEICULO JÁ ESTÁ DISPONIVEL NO PATIO");

    }
}
