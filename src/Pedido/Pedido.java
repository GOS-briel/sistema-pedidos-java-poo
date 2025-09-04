package Pedido;

import Produto.Produto;
import Status.Status_Pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
private double dataCriacao;
private String IDpedido;
private Status_Pedido status;
 Produto  produto;

    public Pedido(double dataCriacao, String IDpedido, Status_Pedido status, Produto produto, List<Pedido> pedidos) {
        this.dataCriacao = dataCriacao;
        this.IDpedido = IDpedido;
        this.status = status;
        this.produto = produto;
        this.pedidos = pedidos;


    }


  

    

    public void adicionar(Produto produto) {
     pedidos.setStatus(Status_Pedido.Aberto);
     produtos.add(produto);
    System.out.println("Produto adicionado com sucesso");
    

    }


    public List<Pedido> pedidos = new ArrayList<>();

    public double getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(double dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getIDpedido() {
        return IDpedido;
    }

    public void setIDpedido(String IDpedido) {
        this.IDpedido = IDpedido;
    }

    public Status_Pedido getStatus() {
        return status;
    }

    public void setStatus(Status_Pedido status) {
        this.status = status;
    }
}
