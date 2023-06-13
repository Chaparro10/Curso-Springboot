package mx.com.kl.domain;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;//Lo que hace es crear los get y set , constructor etc .

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

}
