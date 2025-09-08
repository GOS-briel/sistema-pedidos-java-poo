package Pedido;

import Produto.Produto;
import Status.Status_Pedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
private LocalDateTime dataCriacao;
private String IDpedido;

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
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

    public List<Produto> getProdutos() {
        return new ArrayList<>(produtos);
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    private Status_Pedido status;
public List<Produto> produtos ;

    public Pedido(LocalDateTime dataCriacao, String IDpedido, Status_Pedido status ) {
        this.dataCriacao = LocalDateTime.now();
        this.IDpedido = IDpedido;
        this.status = Status_Pedido.ABERTO;
        this.produtos = new ArrayList<>();


    }



    public void adicionar(Produto produto) {
        produtos.add(produto);
    System.out.println("Produto " + produto.getNome() + " adicionado com sucesso");

    }
    public void remover(Produto produto) {
        produtos.remove(produto);
    System.out.println("Produto " + produto.getNome() + " removido com sucesso");

    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.getValor_Venda();
        }
        return valorTotal;
    }
    public void fecharPedido(){
        this.status = Status_Pedido.FINALIZADO;
        System.out.println("Pedido finalizado com sucesso.Total R$"+calcularValorTotal());
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "dataCriacao=" + dataCriacao +
                ", IDpedido='" + IDpedido + '\'' +
                ", status=" + status +
                ", produtos=" + produtos +
                '}';
    }
}
