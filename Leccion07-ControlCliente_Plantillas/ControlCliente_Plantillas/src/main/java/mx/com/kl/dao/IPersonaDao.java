
package mx.com.kl.dao;

import mx.com.kl.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
}
