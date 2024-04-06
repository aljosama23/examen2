package hm.unah.lenguajes1700.examen2.Servicies.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import hm.unah.lenguajes1700.examen2.Entities.Direccion;
import hm.unah.lenguajes1700.examen2.Repositories.DireccionRepository;
import hm.unah.lenguajes1700.examen2.Servicies.DireccionService;

public class DireccionServiceImpl implements DireccionService{

    @Autowired 
    private DireccionRepository direccionRepository;

    //B
    //METODO PARA CREAR DIRECCIONES A PARTIR DE UN DNI PATH VARIABLE
    @Override
    public Direccion crearDireccion(String dni) {
      Direccion direccion = new Direccion();
      direccion.setDni(dni);
      return this.direccionRepository.save(direccion);
    }
    
}
