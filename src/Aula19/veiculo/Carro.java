package Aula19.veiculo;

import Aula19.acessorios.ReprodutorMusicial;

public class Carro {

    private SistemaCambio cambio;
    private ReprodutorMusicial reprodutorMusicial;

    public SistemaCambio getCambio() {
        return cambio;
    }

    public void setCambio(SistemaCambio cambio) {
        this.cambio = cambio;
    }

    public ReprodutorMusicial getReprodutorMusicial() {
        return reprodutorMusicial;
    }

    public void setReprodutorMusicial(ReprodutorMusicial reprodutorMusicial) {
        this.reprodutorMusicial = reprodutorMusicial;
    }
}
