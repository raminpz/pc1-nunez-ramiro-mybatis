package daos;

import entity.Cliente;

import java.util.List;

public interface IClientes {

    void registrar(Cliente cliente);

    void actualizar(Cliente cliente);

    Cliente obtener(Long id);

    void eliminar(Long id);

    List<Cliente> listar();
}
