package Pedido;

import Produto.Produto;

import java.util.List;

public class Itempedido {
 private List<Pedido> pedidos;

    public Itempedido(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void add(Pedido pedido){
        pedidos.add(pedido);

    }
    public Pedido BuscarPedido(String id){
        for (Pedido pedido : pedidos) {
            if (pedido.getIDpedido().equals(id)){
                return pedido;
            }
        }
        return null;
    }
}


