package Produto;

import Controle.Controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controle_Produto  {
    public List<Produto> produtos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void menu_Produto(){
        int opcao;
        do{
            System.out.println("1- Cadastrar Produto");
            System.out.println("2- Listar Produto");
            System.out.println("3- Atualizar Produto");
            System.out.println("4- Sair");
            opcao = Integer.parseInt(System.console().readLine());
            switch(opcao){
                case 1: cadastro();
                    break;
                case 2: listar(produtos);
                    if (produtos.isEmpty()){
                        System.out.println("Nenhum produto cadastrado");
                    }else{
                        break;
                    }
                case 3: atualizar("",0,0);
                    break;
                case 4 : System.exit(4);
            }

        }while(true);
    }


    public void cadastro() {
        System.out.println("Digite o nome do produto");
        String nome = sc.nextLine();
        System.out.println("Digite o preço do produto");
        double preco = sc.nextDouble();
        System.out.println("Digite o valor de venda do produto");
        double Valor_Venda = sc.nextDouble();
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setValor_Venda(Valor_Venda);
        produtos.add(produto);
    }


    public void listar(List<Produto> produtos) {
        if (produtos == null|| produtos.isEmpty()){
            System.out.println("Nenhum produto cadastrado");
            return;
        }
        for (Produto produto : produtos) {
            produto.exibir();
        }

    }


    public void atualizar(String novoNome, double novoPreco, double novoValor_Venda) {
        if (produtos == null|| produtos.isEmpty()){
           System.out.println("impossivel atualizar");
           for (Produto produto : produtos) {
               if (produto.getNome().equals(novoNome)){
                   produto.setNome(novoNome);
                   produto.setPreco(novoPreco);
                   produto.setValor_Venda(novoValor_Venda);
                   System.out.println("Produto atualizado");
               }
           }

        }

    }
}
