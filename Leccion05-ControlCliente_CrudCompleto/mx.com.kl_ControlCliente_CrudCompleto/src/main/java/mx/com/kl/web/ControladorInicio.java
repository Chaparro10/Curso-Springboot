package mx.com.kl.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.kl.domain.Persona;
import mx.com.kl.servicio.IPersonsaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired //Injecta
    private IPersonsaService PersonaService;//Variable de la interfaz

    @GetMapping("/")//Ruta http://localhost:8080/
    public String getinicio(Model model) {

        var personas = PersonaService.listarPersonas();//utiliza la variable de la Interfaz para acceder a los metodos(mostrar todas las persona)

        log.info("Ejecutando el controlador Spring MVC");//Ejecuta del lado del backend
        model.addAttribute("personas", personas);
        return "index";
    }
    ///****************************GUARDAR************************

    @GetMapping("/agregar")
    public String agregar(Persona persona) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Persona persona) {
        PersonaService.guardar(persona);
        return ("redirect:/");
    }

    //***************EDITAR******************************************************
    @GetMapping("/editar/{id}")
    public String editar(Persona persona, Model model) {
        persona = PersonaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }

    //***********ELIMINAR*************************************************
    @GetMapping("/eliminar")
    public String eliminar(Persona persona) {
        PersonaService.eliminar(persona);
        return "redirect:/";
    }

    //*****************ERROR POR SI NO SE ENCUENTRA LA PAGINA
    @GetMapping("/error")
    public String handleError() {
        // Lógica para manejar el error
        return "error"; // Nombre de la vista de error
    }

}
