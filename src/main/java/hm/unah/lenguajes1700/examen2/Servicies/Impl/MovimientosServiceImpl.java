package hm.unah.lenguajes1700.examen2.Servicies.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import hm.unah.lenguajes1700.examen2.Entities.Movimientos;
import hm.unah.lenguajes1700.examen2.Repositories.MovimientosRepository;
import hm.unah.lenguajes1700.examen2.Servicies.MovimientosService;

public class MovimientosServiceImpl implements MovimientosService {

    @Autowired
    private MovimientosRepository movimientosRepository;

    @Override
    public Optional<Movimientos> obtenerMovimientoPorCuenta(String numeroCuenta) {
        return this.movimientosRepository.findById(numeroCuenta);
    }
    
}
