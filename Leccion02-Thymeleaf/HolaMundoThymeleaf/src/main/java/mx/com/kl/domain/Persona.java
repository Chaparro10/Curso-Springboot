package mx.com.kl.domain;

import lombok.Data;//Lo que hace es crear los get y set , constructor etc .


@Data
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
  
}
