package hm.unah.lenguajes1700.examen2.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.unah.lenguajes1700.examen2.Entities.Cliente;
import hm.unah.lenguajes1700.examen2.Servicies.Impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/examen2/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    //G
    @GetMapping("/obtener")    
    public List<Cliente> obtenerClientes(){
        return this.clienteServiceImpl.obtenerClientes();
    }

    //H
    @GetMapping("/obtner/{dni}")
    public Optional<Cliente> buscarClientePorDni(@PathVariable String dni) {
        return this.clienteServiceImpl.obtenerClientePorDni(dni);
    }

}
