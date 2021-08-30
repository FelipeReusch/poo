package Aula10;

public abstract class TransmissorMensagem {
    public abstract void enviar(String mensagem);

    public boolean checarLimiteMensagem(String mensagem){
        if(mensagem.length() > 50)
            return false;
        else
            return true;
    };

}
