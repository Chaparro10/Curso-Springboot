package mx.com.kl.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.io.Serializable;
import jakarta.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;


@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message="No puede estar vacio")
    private String nombre;
    
    @NotEmpty
    private String apellido;
    
    @NotEmpty
    @Email
    private String email;
    
    private String telefono;
}
