package Aula19.veiculo;

public class CambioManual implements SistemaCambio {

    @Override
    public void trocarMarcha() {
        System.out.println("TROCANDO MARCHA MANUALMENTE");
    }
}
