
package com.example.dao;


import com.example.entididades.Individuo;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface IndividuoDao extends CrudRepository<Individuo,Long> {
    
    public List<Individuo> findByAndNombreAndApellido(String nombre,String apellido);
    public List<Individuo> findByNombreOrApellido(String nombre,String apellido);
    public List<Individuo> findByOrderByNombreAsc();
    
    @Query(value = "SELECT COUNT(*) FROM individuo", nativeQuery = true)
    int countByTotal();
    
    //public List<Individuo> findByFechaNac(LocalDate FechaNac);
    
    public List<Individuo> findByEdad(String edad);
    
    public List<Individuo> findByFechaNac(LocalDate fechaNac);
    
    public List<Individuo> findByGenero(String genero);
    
    public List<Individuo> findByTelefono(String telefono);
    
    public List<Individuo> findByCorreo(String correo);
}

