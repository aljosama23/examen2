package hm.unah.lenguajes1700.examen2.Repositories;

import org.springframework.data.repository.CrudRepository;

import hm.unah.lenguajes1700.examen2.Entities.Movimientos;

public interface MovimientosRepository extends CrudRepository<Movimientos, Integer> {
    
}
