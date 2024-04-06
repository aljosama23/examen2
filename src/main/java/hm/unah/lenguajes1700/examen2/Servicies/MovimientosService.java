package hm.unah.lenguajes1700.examen2.Servicies;

import java.util.Optional;

import hm.unah.lenguajes1700.examen2.Entities.Movimientos;

public interface MovimientosService {
    

    public Optional<Movimientos> obtenerMovimientoPorCuenta(String numeroCuenta);
}
