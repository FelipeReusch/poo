package Aula10;

public class TransmissorSms extends TransmissorMensagem{


    @Override
    public void enviar(String mensagem) {
        System.out.println("ENVIANDO VIA SMS");
        System.out.println(mensagem);
    }
}


