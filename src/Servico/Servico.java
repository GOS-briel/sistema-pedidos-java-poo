package Servico;

import Cliente.Cliente;
import Controle.Controle_Clientes;
import Controle.Controle_Email;
import Pedido.Pedido;

import java.util.Optional;

public class Servico  {

    public Controle_Clientes clientes_Controle;
    public Controle_Email email_Controle;

    public Servico(Controle_Clientes clientes_Controle, Controle_Email email_Controle) {
        this.clientes_Controle = clientes_Controle;
        this.email_Controle = email_Controle;
    }

    public Pedido criarPedido(){
        Optional<Cliente> resultado = clientes_Controle.buscarPorId(1);
        if (resultado.isPresent()){
            Cliente cliente = resultado.get();

        }else {
            throw new IllegalArgumentException("Cliente não encontrado");
        }
        return null;
    }
}
