package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;
//Clases que heredan se le suelen llamar
//- clases hijas;
// - Subclases
// - Clase detalle
// - Clases especificas
public class Medico extends Usuario {
    
    //los atributos de una clase deben ser privados 
    
    private Long registroMedico;
    private Especialidad especialidad;
    
    @Override
    public String toString() {
        return "Medico Registro Medico:" + registroMedico + ", Especialidad:" + especialidad + " " + "Nombres:" + super.nombres + "Apellidos: " + super.apellidos
        ;
    }
    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento, Long registroMedico, Especialidad especialidad) {
        //Si quieres instansear un medico
        //Tamnièn debes instanciar el usuario
        //Super en el construcot invoca(llama,ejecuta)
        //al constructor de la clase padre(superclase)
        super(id, nombres, apellidos, tipoDocumento, numeroDocumento);
        //A continuacion inicializmos
        //Atributos de la clase hija
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    
    }
