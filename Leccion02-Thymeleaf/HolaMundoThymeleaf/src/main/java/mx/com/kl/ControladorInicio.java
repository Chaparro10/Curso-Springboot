/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.kl;

import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import mx.com.kl.domain.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @GetMapping("/")//Ruta http://localhost:8080/
    public String getinicio(Model model) {
        var mensaje = "Hola mundo con Thymeleaf";
        var persona= new Persona();
        persona.setNombre("Pedro");
        persona.setApellido("Perez");
        persona.setEmail("perezz@gmail.com");
        persona.setTelefono("6614253515");
        
          var persona2= new Persona();
        persona2.setNombre("Juanito");
        persona2.setApellido("Perez");
        persona2.setEmail("perezz@gmail.com");
        persona2.setTelefono("6614253515");
        
        var personas = new ArrayList();//Lista de Personas
        personas.add(persona);
        personas.add(persona2);
        
        
        log.info("Ejecutando el controlador Spring MVC");//Ejecuta del lado del backend
        model.addAttribute("mensaje", mensaje);
         //model.addAttribute("persona", persona);
         model.addAttribute("personas", personas);
        return "index";
    }
}
