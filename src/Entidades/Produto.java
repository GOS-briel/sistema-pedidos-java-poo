package Entidades;

import Enums.Status_Pedido;
import Interface.Controle;
import java.math.BigDecimal;

public class Produto {
    private static final long serialVersionUID = 1L;

    private String id;
    private String nome;
    private BigDecimal valor_de_Venda;
    Status_Pedido status;

    public Produto( String id, String nome, BigDecimal valor_de_Venda, Status_Pedido status) {
        this.id = id;
        this.nome = nome;
        this.valor_de_Venda = valor_de_Venda;
        this.status = status.ABERTO;

    }






    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor_de_Venda() {
        return valor_de_Venda;
    }

    public Status_Pedido getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", valor_de_Venda=" + valor_de_Venda +
                ", status=" + status +
                '}';
    }

    public boolean eqquals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produto other = (Produto) obj;
        return id.equals(other.id);


    }
}
