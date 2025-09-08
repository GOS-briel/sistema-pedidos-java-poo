package Controle;

import Cliente.Cliente;

import java.util.Optional;

public interface Controle_Clientes {
    void salvar(Cliente cliente );
    Optional<Cliente> buscarPorId(int id);


}
