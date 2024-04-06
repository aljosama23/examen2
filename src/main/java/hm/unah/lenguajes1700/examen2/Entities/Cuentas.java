package hm.unah.lenguajes1700.examen2.Entities;


import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuentas")
@Data
public class Cuentas {
    
    @Id
    @Column(name = "numerocuenta")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="numerocuenta", referencedColumnName = "numerocuenta")
    private String numeroCuenta;

    private String dni;

    private double sueldo;

    private Date fechaApertura;

    private boolean estado;

    private boolean sobregiro;

}
