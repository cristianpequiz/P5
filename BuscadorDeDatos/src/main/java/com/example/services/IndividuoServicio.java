
package com.example.services;

import com.example.entididades.Individuo;
import java.util.List;


public interface IndividuoServicio {    
    
   //Para mostrar los datos 
   public List<Individuo> listaIndividuos();    
   
   //Para borrar un dato
   public void borrar(Individuo individuo);    
   
   //Para guardar un dato
   public void salvar(Individuo individuo);    
   
   //Para buscar por id
   public Individuo localizarIndividuo(Individuo individuo);    
  
   //Para buscar por nombre y apellido
   public List<Individuo> buscarNombreApellido(Individuo individuo);
   
   //Para buscar por nombre o por apellido
   public List<Individuo> buscarNombreOrApellido(Individuo individuo);
   
   public int total();
   
   //Para buscar por fecha de nacimiento
   public List<Individuo> buscarFechaNac(Individuo individuo);
   
   //Para buscar por género
   public List<Individuo> buscarGenero(Individuo individuo);
   
   //Para buscar por teléfono
   public List<Individuo> buscarTelefono(Individuo individuo);
   
   //Para buscar por gmail
   public List<Individuo> buscarCorreo(Individuo individuo);
}
