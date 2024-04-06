package hm.unah.lenguajes1700.examen2;


import lombok.Data;

@Data

public class ClienteDTO {
    private String dni;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String cuentas;
}
