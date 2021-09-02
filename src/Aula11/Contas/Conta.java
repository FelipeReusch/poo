package Aula11.Contas;

import Aula11.Cadastro.Cliente;

public abstract class Conta {
    private Integer numero;
    private Integer agencia;
    protected Double saldo = 0.0;
    private ContaTipo tipo;
    private Cliente cliente;

    protected void notificar(){
        System.out.println("NOTIFICANDO");
    }
    public abstract void sacar(Double valor);

    public void depositar(Double valor){
        saldo = saldo + valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public ContaTipo getTipo() {
        return tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setTipo(ContaTipo tipo) {
        this.tipo = tipo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}