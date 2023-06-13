package mx.com.kl.servicio;

import java.util.List;
import mx.com.kl.domain.Persona;

public interface IPersonsaService {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);
}
