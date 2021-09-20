package Aula19.montadora;

import Aula19.acessorios.MP3;
import Aula19.veiculo.Carro;
import Aula19.veiculo.CambioAutomatico;

public class MontadoraCarroLuxo implements AbstractMontadora{
    @Override
    public Carro montar() {
        Carro carroLuxo = new Carro();
        carroLuxo.setCambio(new CambioAutomatico());
        carroLuxo.setReprodutorMusicial(new MP3());
        return carroLuxo;
    }
}
