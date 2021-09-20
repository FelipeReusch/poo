package Aula16;

public class PessoaJuridica extends Pessoa {
    private String razaoSocial;
    private PorteEmpresarial porte;

    public PorteEmpresarial getPorte() {
        return porte;
    }

    public void setPorte(PorteEmpresarial porte) {
        this.porte = porte;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String getNome() {
        return razaoSocial;
    }

    @Override
    public void setNome(String nome) {
        this.razaoSocial = nome;
    }
}
