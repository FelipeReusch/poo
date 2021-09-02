package Aula11.Contas;

public class ContaPoupanca extends Conta {
    @Override
    public void sacar(Double valor) {
if (saldo < valor){
    System.out.println("SALDO INSUFICIENTE");
    }else
        saldo = saldo - valor;
    notificar();
    }
}
