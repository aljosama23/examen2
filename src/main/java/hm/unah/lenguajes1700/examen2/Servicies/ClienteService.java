package hm.unah.lenguajes1700.examen2.Servicies;

import java.util.List;
import java.util.Optional;

import hm.unah.lenguajes1700.examen2.ClienteDTO;
import hm.unah.lenguajes1700.examen2.Entities.Cliente;

public interface ClienteService {

    public String crearCliente(ClienteDTO cliente);



    public Cliente asociarCuentaCliente(String dni, int numeroCuenta);

    public List<Cliente> obtenerClientes();

    public Optional<Cliente> obtenerClientePorDni(String dni);
}
