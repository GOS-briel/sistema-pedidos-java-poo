import Entidades.Cliente;
import Entidades.CupomdeDesconto;
import Entidades.Pedido;
import Entidades.Produto;
import Enums.Status_Pedido;
import Interface.Controle;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Menu  {

private static List<Cliente> clientes;
private static List<Produto> produtos;
private static List<Pedido> pedidos;
private static List<CupomdeDesconto> cupons;
Scanner entrada = new Scanner(System.in);

public Menu() {
    int opcao;
    do {


        System.out.println("Bem vindo ao E-commerce");
        System.out.println("Digite 1 para cadastrar um cliente");
        System.out.println("Digite 2 para cadastrar um produto");
        System.out.println("Digite 3 para criar um pedido");
        System.out.println("Digite 4 para adicionar um item ao pedido");
        System.out.println("Digite 5 para finalizar pedido");
        System.out.println("Digite 6 para pagar pedido");
        System.out.println("Digite 7 para entregar pedido");
        System.out.println("Digite 8 para aplicares cupom de desconto");
        System.out.println("Digite 9 para listar clientes");
        System.out.println("Digite 10 para listar produtos");
        System.out.println("Digite 11 para listar pedidos");
        System.out.println("Digite 0 para sair");

        opcao = entrada.nextInt();
        entrada.nextLine();

        switch (opcao) {
            case 1 -> cadastrarCliente();
            case 2 -> cadastrarProduto();
            case 3 -> criarPedido();
            case 4 -> adicioarItemPedido();
            case 5 -> finalizarPedido();
            case 6 -> pagarPedido();
            case 7 -> entregarPedido();
            case 8 -> aplicarCupom();
            case 9 -> listarClientes();
            case 10 -> listarProdutos();
            case 11 -> listarPedidos();

            case 0 -> System.out.println("Obrigado por usar nosso sistema");
            default -> System.out.println("Opção inválida");

            }

    } while (opcao != 0);
}

 private void cadastrarCliente() {

    System.out.println("Digite o nome do cliente");
    String nome = entrada.nextLine();
    System.out.println("Digite o cpf do cliente");
    String cpf = entrada.nextLine();
    System.out.println("Digite o email do cliente");
    String email = entrada.nextLine();
    clientes.add( new Cliente(nome,cpf,email));
    System.out.println("Cliente cadastrado com sucesso");
 }
 private void cadastrarProduto(){
     System.out.println("Digite o nome do produto");
     String nome = entrada.nextLine();
     System.out.println("Digite o valor do produto");
     BigDecimal valor_de_Venda = new BigDecimal(entrada.nextLine());
     produtos.add(new Produto("1",nome,valor_de_Venda,Status_Pedido.ABERTO));
     System.out.println("Produto cadastrado com sucesso");
 }
private void criarPedido(){
    if (clientes.isEmpty()) {
        System.out.println("Não há clientes cadastrados");
        return;
    }
    System.out.println("Escolha o cliente pelo indice");
    for (int i = 0; i < clientes.size(); i++) {
        System.out.println(i + " " + clientes.get(i));
    } int index = entrada.nextInt(); entrada.nextLine();
    Pedido pedido = new Pedido(clientes.get(index));
    pedidos.add(pedido);
    System.out.println("Pedido criado com sucesso");
}
private void adicioarItemPedido(){
    if (pedidos.isEmpty()){
        System.out.println("Não há pedidos criados!");
        return;
    }
    System.out.println("Escolha o pedido pelo indice");
    for (int i = 0; i < pedidos.size(); i++) {
        System.out.println(i + " " + pedidos.get(i));

    } int index = entrada.nextInt();
      entrada.nextLine();

      if (produtos.isEmpty()){
          System.out.println("Não há produtos cadastrados!");
          return;

      }
    System.out.println("Escolha o produto pelo indice");
    for (int i = 0; i < produtos.size(); i++) {
        System.out.println(i + " " + produtos.get(i));

    } int index2 = entrada.nextInt();
    entrada.nextLine();

    System.out.println("Quantidade");
    int quantidade = entrada.nextInt(); entrada.nextLine();

   Pedido pedido = pedidos.get(index);
   Produto produto = produtos.get(index2);
   pedido.adicionarItem(new Entidades.ItemPedido(produto,quantidade,produto.getValor_de_Venda().doubleValue()));
   System.out.println("Item adicionado com sucesso");
}
 private void finalizarPedido() {
     if (pedidos.isEmpty()) {
         System.out.println("Não há pedidos!");
         return;
     }
     System.out.println("Escolha o pedido para finalizar");
     for (int i = 0; i < pedidos.size(); i++) {
         System.out.println(i + " " + pedidos.get(i));
     }
     int indice  = entrada.nextInt();
     entrada.nextLine();
    Pedido pedido = pedidos.get(indice);
    pedido.calcularValorTotal();
    System.out.println("Pedido finalizado com sucesso");

}
 private void pagarPedido() {
    if (pedidos.isEmpty()) {
        System.out.println("Não  há pedidos!");
        return;
    }
     System.out.println("Escolha o pedido para pagar");
    for (int i = 0; i < pedidos.size(); i++) {
        System.out.println(i + " " + pedidos.get(i));
    }
    int indice  = entrada.nextInt();
     entrada.nextLine();
    Pedido pedido = pedidos.get(indice);
    pedido.calcularValorTotal();
    System.out.println("Pedido pago com sucesso");
 }
 private void entregarPedido() {
    if (pedidos.isEmpty()){
        System.out.println("Não há pedidos");
        return;
    }
     System.out.println("Escolha o pedido para entregar");
    for (int i = 0; i < pedidos.size(); i++) {
        System.out.println(i + " " + pedidos.get(i));
    }
    int indice  = entrada.nextInt();
     entrada.nextLine();
    Pedido pedido = pedidos.get(indice);
    pedido.calcularValorTotal();
    System.out.println("Pedido entregue com sucesso");
 }
private void aplicarCupom(){
    if (pedidos.isEmpty()){
        System.out.println("Não há pedidos");
        return;
    }
    System.out.println("Escolha o pedido para aplicar cupom");
    for (int i = 0; i< pedidos.size(); i++){
        System.out.println(i + " " + pedidos.get(i));

    }
    int pIndex = entrada.nextInt(); entrada.nextLine();
    if (cupons.isEmpty()){
        System.out.println("Não há cupons cadastrados!");
        return;
    }
    System.out.println("Escolha o cupom pelo indice");
    for (int i =0; i<cupons.size(); i++){
        System.out.println(i + " " + cupons.get(i));
    }
    int cupomIndice = entrada.nextInt();
    entrada.nextLine();

    Pedido pedido = pedidos.get(pIndex);
    CupomdeDesconto cupom = cupons.get(cupomIndice);

   if (pedido.getCupom().isPresent()){
       System.out.println("Cupom aplicaado com sucesso");
   } else {
       System.out.println("Não foi possivel aplicar o cupom");
   }
}

 private void listarClientes() {

     System.out.println("=== Lista de Clientes ===");
     clientes.forEach(System.out::println);
 }

    private void listarProdutos() {
        System.out.println("=== Lista de Produtos ===");
        produtos.forEach(System.out::println);
    }

    private void listarPedidos() {
        System.out.println("=== Lista de Pedidos ===");
        pedidos.forEach(System.out::println);
    }
}
