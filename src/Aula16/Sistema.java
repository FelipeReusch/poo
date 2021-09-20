package Aula16;

public class Sistema {
    public static void main(String[] args) {
        PessoaFactory fabrica = new PessoaFactory();
        fabrica.criarPessoa(TipoPessoa.J);

        PessoaJuridica pessoa = fabrica.getPessoaJuridica();
        pessoa.setRegistro("86048356000110");
        pessoa.setTipo(TipoPessoa.J);
        pessoa.setNome("CASAS BAHIA");
        pessoa.setPorte(PorteEmpresarial.M);

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setTelefoneContato("12313123");
        fornecedor.setPessoa(pessoa);

        System.out.println("O FORNECEDOR é: " + fornecedor.getPessoa().getNome());

        Cliente cliente = new Cliente();
        cliente.setLimiteCredito(123.08);
        cliente.setPessoa(pessoa);
    }
}
