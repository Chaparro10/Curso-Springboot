package mx.com.kl.servicio;

import java.util.List;
import mx.com.kl.dao.IPersonaDao;
import mx.com.kl.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImplementation implements IPersonsaService {

    @Autowired
    private IPersonaDao personaDao;

    @Override
    @Transactional(readOnly=true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDao.findAll();//Obtenemos los datos y los convertimos en una lista
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
     @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
     @Transactional(readOnly=true)
    public Persona encontrarPersona(Persona persona) {
        return personaDao.findById(persona.getId()).orElse(null);
    }

}
