package Produto;
import Status.Status_Pedido;

public class Produto {
    private String nome;
    private double preco;
    private double Valor_Venda;
    private Status_Pedido status;

    public Status_Pedido getStatus() {
        return status;
    }
    public void setStatus(Status_Pedido status) {
        this.status = status;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getValor_Venda() {
        return Valor_Venda;
    }

    public void setValor_Venda(double Valor_Venda) {
        this.Valor_Venda = Valor_Venda;
    }
    public void exibir(){
        System.out.println("Produto");
        System.out.println(this.nome + " " + this.preco + " " + this.Valor_Venda);
        System.out.println("-------------");

    }
}
