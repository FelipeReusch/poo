package Aula19.montadora;

import Aula19.acessorios.DiskPlay;
import Aula19.veiculo.Carro;
import Aula19.veiculo.CambioManual;

public class MontadoraCarroPopular implements AbstractMontadora{
    @Override
    public Carro montar() {
        Carro carroPopular = new Carro();
        carroPopular.setCambio(new CambioManual());
        carroPopular.setReprodutorMusicial(new DiskPlay());
        return carroPopular;
    }
}