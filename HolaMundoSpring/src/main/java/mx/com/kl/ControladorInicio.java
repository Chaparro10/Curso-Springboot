/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.kl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {
    @GetMapping("/")//Ruta http://localhost:8080/
    public String getinicio(){
        log.info("Ejecutando el controlador REST");//Ejecuta del lado del backend
        return "Hola Mundo with Spring ,";
    }
}
