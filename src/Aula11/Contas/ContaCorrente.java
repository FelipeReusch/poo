package Aula11.Contas;

public class ContaCorrente extends Conta {
    private Double limiteChequeEspecial = 200.0;

    @Override
    public void sacar(Double valor) {
        if(saldo + limiteChequeEspecial < valor){
            System.out.println("SALDO INSUFICIENTE");
        }else
            saldo = saldo - valor;
        notificar();
    }

    public Double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
