package Cliente;

import Controle.Controle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controle_Cliente  {
   public List<Cliente> clientes = new ArrayList<>();
   Scanner sc = new Scanner(System.in);

   public void menu_Cliente(){
       int opcao;
       do{
           System.out.println("1- Cadastrar Cliente");
           System.out.println("2- Listar Cliente");
           System.out.println("3- Atualizar Cliente");
           System.out.println("4- Sair");
           opcao = Integer.parseInt(System.console().readLine());
           switch(opcao){
               case 1: cadastro();
               break;
               case 2: listar(clientes);
               if (clientes.isEmpty()){
                   System.out.println("Nenhum cliente cadastrado");
               }else{
                   break;
               }
               case 3: atualizar("Jonas", "123456789", "<EMAIL>");
               break;
               case 4 : System.exit(4);
           }

       }while(true);
   }


    public void cadastro() {
        System.out.println("Digite o nome do cliente");
        String nome = sc.nextLine();
        System.out.println("Digite o cpf do cliente");
        String cpf = sc.nextLine();
        System.out.println("Digite o email do cliente");
        String email = sc.nextLine();
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEmail(email);
        clientes.add(cliente);

    }


    public void listar(List<Cliente> clientes) {
       if (clientes == null|| clientes.isEmpty()){
           System.out.println("Nenhum cliente cadastrado");
           return;
       }
       for (Cliente cliente : clientes) {
           cliente.exibir();
       }

    }


    public void atualizar(String novonome, String novocpf, String novoemail) {
       if (clientes == null|| clientes.isEmpty()){
           System.out.println("impossivel atualizar");
           return;
       }
       for (Cliente cliente : clientes) {
           if (cliente.getCpf().equals(novocpf)){
               cliente.setNome(novonome);
               cliente.setCpf(novocpf);
               cliente.setEmail(novoemail);
               System.out.println("Cliente atualizado");
           }
       }


    }
}
