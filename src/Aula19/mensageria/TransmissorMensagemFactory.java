package Aula19.mensageria;

public class TransmissorMensagemFactory {
    public static TransmissorMensagem criar(String tipo){
        if(tipo.equals("S"))
            return new SMS();
        else
            return new WhatsApp();
    }
}
