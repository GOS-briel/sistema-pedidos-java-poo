import Cliente.Controle_Cliente;

public class Main {
    public static void main(String[] args) {
        Controle_Cliente cliente = new Controle_Cliente();
        cliente.menu_Cliente();
        cliente.cadastro();
        cliente.listar(cliente.clientes);


    }
}