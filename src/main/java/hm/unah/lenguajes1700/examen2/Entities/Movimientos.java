package hm.unah.lenguajes1700.examen2.Entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "movimientos")
@Data
public class Movimientos {

    @Id
    @Column(name = "idmovimiento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovimiento;
    
    @Column(name = "numerocuenta")
    private String numeroCuenta;

    @Column(name = "tipomovimiento")
    private char tipoMovimiento;

    private double monto;

    @Column(name = "fechamovimiento")
    private Date fechaMovimiento;
}
