package Entidades;

public class ItemPedido {

    private Produto produto;
    private int quantidade;
    private double valor_unitario;


    public ItemPedido(Produto produto, int quantidade, double valor_unitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor_unitario = valor_unitario;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    @Override
    public String toString() {
        return "ItemPedido{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                ", valor_unitario=" + valor_unitario +
                '}';
    }
}

