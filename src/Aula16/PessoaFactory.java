package Aula16;

public class PessoaFactory {
    private Pessoa pessoa;
    public Pessoa criarPessoa(TipoPessoa tipo){
        Pessoa pessoa = null;
        if(tipo == TipoPessoa.J)
            pessoa= new PessoaJuridica();
        else
            pessoa = new PessoaFisica();
        return pessoa;
    }
    public PessoaJuridica getPessoaJuridica(){
        return (PessoaJuridica) pessoa;
    }
    public PessoaFisica getPessoaFisica(){
        return (PessoaFisica) pessoa;
    }
}
