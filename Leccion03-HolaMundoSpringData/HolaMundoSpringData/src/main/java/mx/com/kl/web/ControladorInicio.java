package mx.com.kl.web;


import lombok.extern.slf4j.Slf4j;
import mx.com.kl.dao.IPersonaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired //Injecta
    private IPersonaDao PersonaDao;//Variable de la interfaz

    @GetMapping("/")//Ruta http://localhost:8080/
    public String getinicio(Model model) {

        var personas = PersonaDao.findAll();//utiliza la variable de la Interfaz para acceder a los metodos(mostrar todas las persona)

        log.info("Ejecutando el controlador Spring MVC");//Ejecuta del lado del backend
        model.addAttribute("personas", personas);
        return "index";
    }
}
