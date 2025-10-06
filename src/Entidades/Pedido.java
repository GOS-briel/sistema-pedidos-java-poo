package Entidades;

import Enums.Status_Pedido;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Pedido {

    private CupomdeDesconto cupom;
    private LocalDate data_criacao;
    private Status_Pedido status;
    private BigDecimal valor;
    private  Cliente cliente;
    private List<ItemPedido> itens;


    public Pedido( Cliente cliente) {

        this.data_criacao =LocalDate.now();
        this.valor =BigDecimal.ZERO;
        this.itens =new ArrayList<>();
        this.status =Status_Pedido.ABERTO;
        this.cliente = cliente;


            }


    public LocalDate getData_criacao() {
        return data_criacao;
    }

    public Status_Pedido getStatus() {
        return status;
    }

    public BigDecimal getValor() {
        return valor;
    }


    public List<ItemPedido> getItens() {
        return itens;
    }


    public void adicionarItem(ItemPedido item){
        if (status == Status_Pedido.ABERTO){
            itens.add(item);
            calcularValorTotal();
        }
    }
    public BigDecimal calcularValorTotal(){
        BigDecimal Total = BigDecimal.ZERO;
        for (ItemPedido item : itens) {
            Total = item.getProduto().getValor_de_Venda().multiply(BigDecimal.valueOf(item.getQuantidade()));
          if (cupom != null && cupom.isValido()){
              Total = Total.subtract(cupom.getPercentualDesconto());
          }
        return calcularValorTotal();
        }
        return Total;
    }
    public Optional<CupomdeDesconto> getCupom(){
        return Optional.ofNullable(cupom);
    }
    public void removerItem(Produto produto){
        itens.removeIf(item -> item.getProduto().getId().equals(produto.getId()));
    }
    public void exibirInfo(){
        System.out.println("Pedido");
        System.out.println("Data" + data_criacao.toString());
        System.out.println("Status" + status.toString());
        System.out.println("Valor" + valor.toString());
        System.out.println("Cliente" + cliente.getNome());
        System.out.println("Itens");
        for (ItemPedido item : itens) {
            System.out.println(item.getProduto().getNome() + " " + item.getQuantidade());
        }
    }


    }


