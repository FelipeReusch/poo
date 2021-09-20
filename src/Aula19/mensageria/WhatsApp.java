package Aula19.mensageria;

public class WhatsApp implements TransmissorMensagem{
    private Rementente rementente;
    @Override
    public void setRemetente(Rementente rementente) {
        this.rementente = rementente;
    }
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("ENVIANDO WHATS:: " + rementente);
        System.out.println(mensagem);
    }
}
