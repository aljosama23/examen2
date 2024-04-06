package hm.unah.lenguajes1700.examen2.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.unah.lenguajes1700.examen2.Entities.Direccion;
import hm.unah.lenguajes1700.examen2.Servicies.Impl.DireccionServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/examen2/direccion")
public class DireccionController {
    
    @Autowired
    private DireccionServiceImpl direccionServiceImpl;

    //B
    @PostMapping("/crear/{dni}")
    public Direccion guardae(@PathVariable String dni) {
            
    return this.direccionServiceImpl.crearDireccion(dni);
}
}
