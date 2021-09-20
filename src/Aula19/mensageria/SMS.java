package Aula19.mensageria;

public class SMS implements TransmissorMensagem{
    private Rementente rementente;
    @Override
    public void setRemetente(Rementente rementente) {
        this.rementente = rementente;
    }

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("ENVIANDO SMS:: " + rementente);
        System.out.println(mensagem);
    }
}

