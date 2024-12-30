
package com.example.entididades;

import jakarta.persistence.*;    // el * es para que implemnete todas librerias de jakarta.persistence
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

@Data    
@Entity    
@Table(name = "individuo")   
public class Individuo implements Serializable{    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_individuo;
    
    @NotEmpty(message = "El nombre no puede estar vacio")    
    private String nombre;
    
    @NotEmpty(message = "El apellido no puede estar vacio")
    private String apellido;
    
    @NotEmpty(message = "La edad no puede estar vacio")
    private String edad;
    
    @NotEmpty(message = "El correo es invalido")
    @Email
    private String correo;
    
    @NotEmpty(message = "El numero de telefono no puede estar vacio")
    private String telefono;
    
    @Column(name = "fecha_nac")
    private LocalDate fechaNac;
    
    @NotEmpty(message = "Falta el género")
    private String genero;
    
}
