package hm.unah.lenguajes1700.examen2.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cliente")
@Data
public class Cliente {
    
    @Id
    private String dni;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Direccion direccion;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Cuentas cuentas;

    private String nombre;

    private String apellido;

    private String correo;

    private String telefono;

}
