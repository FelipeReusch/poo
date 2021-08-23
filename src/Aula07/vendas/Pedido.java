package Aula07.vendas;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private LocalDate data = LocalDate.now();
    private Cliente cliente;
    private int codigo;
    private List<Produto> produtos;

    public LocalDate getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
