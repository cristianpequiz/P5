
package com.example.web;

import com.example.entididades.Individuo;
import com.example.services.IndividuoServicio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorAgregarIndividuo {
    
    @Autowired
    public IndividuoServicio individuoServicio;
    
    //Para volver al inicio
    @GetMapping("/volver")
    public String volver(Individuo individuo){
    return "redirect:/";
    }
    
    //Para guardar un dato ala base de datos y validando para que no falte ningun dato
    @PostMapping("/guardar")
    public String guardar(@Valid Individuo individuo, Errors error){
        if(error.hasErrors()){
        return "AgregarIndividuo";
        }
           
        individuoServicio.salvar(individuo);
        return "redirect:/";
    }
    
}
