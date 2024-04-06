package hm.unah.lenguajes1700.examen2.Servicies.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hm.unah.lenguajes1700.examen2.ClienteDTO;
import hm.unah.lenguajes1700.examen2.Entities.Cliente;
import hm.unah.lenguajes1700.examen2.Repositories.ClienteRepository;
import hm.unah.lenguajes1700.examen2.Repositories.CuentasRepository;
import hm.unah.lenguajes1700.examen2.Servicies.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{


    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private CuentasRepository cuentasRepository;



    //A
    //Crear clientes
    @Override
    public String crearCliente(ClienteDTO cliente) {
       if (!this.clienteRepository.existsById(cliente.getDni())) {
        Cliente nvocliente = new Cliente();
        nvocliente.setDni(cliente.getDni());
        nvocliente.setNombre(cliente.getNombre());
        nvocliente.setApellido(cliente.getApellido());
        nvocliente.setCorreo(cliente.getCorreo());
        nvocliente.setTelefono(cliente.getTelefono());
        return "el cliente ha sido creado";
       }
       else{
        return "ya existe";
       }

    }
    
    //G
    //Obtener clientes
    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    //H
    @Override
    public Optional<Cliente> obtenerClientePorDni(String dni) {
        return this.clienteRepository.findById(dni);
    }

    @Override
    public Cliente asociarCuentaCliente(String dni, int numeroCuenta){
        if(this.clienteRepository.existsById(dni)){
            Cliente clienteActualizar = this.clienteRepository.findById(dni).get();
            if(this.cuentasRepository.existsById(numeroCuenta)){
                Cuenta nvoCuenta = new Cuenta();
                nvoCuenta.setEstado('A');
                nvoCuenta.setSaldo(5000);
                nvoCuenta.setCliente(this.clienteRepository.findById(dni).get());
            
    
                clienteActualizar.getCuentas().add(nvoCuenta);
                this.cuentasRepository.save(nvoCuenta);
                return clienteActualizar;
            }
        }
    
        return null;

    }
    
}

