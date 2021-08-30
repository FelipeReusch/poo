package Aula10;

public class TransmissorWhats extends TransmissorMensagem{
    @Override
    public void enviar(String mensagem) {
        boolean podeEnviar = this.checarLimiteMensagem(mensagem);
        if (podeEnviar){
            System.out.println("Enviar whats");
            System.out.println(mensagem);
        }else{
            System.out.println("caracteres passaram do limite");

        }

    }
    @Override
    public boolean checarLimiteMensagem(String mensagem) {
        return mensagem.length() <100;
    }
}
