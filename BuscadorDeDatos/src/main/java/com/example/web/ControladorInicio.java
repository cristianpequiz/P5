
package com.example.web;

import com.example.services.IndividuoServicio;
import com.example.entididades.Individuo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller    
public class ControladorInicio {
    
    @Autowired
    private IndividuoServicio individuoServicio;
    
    @GetMapping("/")    
    public String comienzo(Model model){
        
        int cantidad = individuoServicio.total();
    
        model.addAttribute("cantidad",cantidad);
        
        List<Individuo> individuos=individuoServicio.listaIndividuos();    
        
        model.addAttribute("individuos",individuos);
        return "Inicio";
    }
    
    //Para borrar un dato de la base de datos
    @GetMapping("/borrar")
    public String borrar(Individuo individuo){
        individuoServicio.borrar(individuo);
        return "redirect:/";
    }
    
    //Para ir ala pagina AgregarIndividuo
    @GetMapping("/agregar")
    public String cambiar(Individuo individuo){
    return "AgregarIndividuo";
    }
    
    //Metodo para buscar Id
    @GetMapping("/buscarPorId")
    public String buscarPorId(Individuo individuo,Model model){
        Individuo individuoId=individuoServicio.localizarIndividuo(individuo);
        
        if(individuoId==null){
        return "UsuarioNoEncontrado";
        }
        
        model.addAttribute("individuos", individuoId);
    return "VistaDeBusqueda";
    }
    
    //Metodo para buscar Nombre y Apellido
    @GetMapping("/buscarPorNombreApellido")
    public String buscarPorNombreApellido(Individuo individuo,Model model){
        List<Individuo> individuoNombreApellido=individuoServicio.buscarNombreApellido(individuo);
        
        if(individuoNombreApellido==null || individuoNombreApellido.isEmpty()){
        return "UsuarioNoEncontrado";
        }
        
        model.addAttribute("individuos", individuoNombreApellido);
    return "VistaDeBusqueda";
    }
    
    //Metodo para buscar Nombre o Apellido
    @GetMapping("/buscarPorNombreOrApellido")
    public String buscarPorNombreOrApellido(Individuo individuo,Model model){
        List<Individuo> individuoNombreOrApellido=individuoServicio.buscarNombreOrApellido(individuo);
        
        if(individuoNombreOrApellido==null || individuoNombreOrApellido.isEmpty()){
        return "UsuarioNoEncontrado";
        }
        
        model.addAttribute("individuos", individuoNombreOrApellido);
    return "VistaDeBusqueda";
    }
    
    //Metodo para buscar Fecha de nacimiento
    @GetMapping("/buscarPorFechaNac")
    public String buscarPorFechaNac(Individuo individuo, Model model){
        List<Individuo> individuoFecha = individuoServicio.buscarFechaNac(individuo);
        
        if(individuoFecha == null || individuoFecha.isEmpty()){
        return "UsuarioNoEncontrado";
        }
        
        model.addAttribute("individuos", individuoFecha);
        return "VistaDeBusqueda";
    }
 
    //Metodo para buscar por género
    @GetMapping("/buscarPorGenero")
    public String buscarPorGenero(Individuo individuo, Model model){
        List<Individuo> individuoGenero = individuoServicio.buscarGenero(individuo);
        
        if(individuoGenero == null || individuoGenero.isEmpty()){
        return "UsuarioNoEncontrado";
        }
        
        model.addAttribute("individuos", individuoGenero);
        return "VistaDeBusqueda";
    }
    
    //Metodo para buscar por teléfono
    @GetMapping("/buscarPorTelefono")
    public String buscarTelefono(Individuo individuo, Model model){
        List<Individuo> individuoTelefono = individuoServicio.buscarTelefono(individuo);
        
        if(individuoTelefono == null || individuoTelefono.isEmpty()){
        return "UsuarioNoEncontrado";
        }
        
        model.addAttribute("individuos", individuoTelefono);
        return "VistaDeBusqueda";
    }
    
    //Metodo para buscar por correo
    @GetMapping("/buscarPorCorreo")
    public String buscarPorCorreo(Individuo individuo, Model model){
        List<Individuo> individuoCorreo = individuoServicio.buscarCorreo(individuo);
        
        if(individuoCorreo == null || individuoCorreo.isEmpty()){
        return "UsuarioNoEncontrado";
        }
        
        model.addAttribute("individuos", individuoCorreo);
    return "VistaDeBusqueda";
    }
    
}
