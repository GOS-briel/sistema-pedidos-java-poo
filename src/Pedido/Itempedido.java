package Pedido;

import Produto.Produto;

public class Itempedido {
    private Produto produto;
    private int quantidade;
    private double Preco_Venda;
    public Itempedido(Produto produto, int quantidade, double Preco_Venda) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.Preco_Venda = Preco_Venda;
    }
    public double Subtotal(){
        return this.quantidade * this.Preco_Venda;
    }

}
