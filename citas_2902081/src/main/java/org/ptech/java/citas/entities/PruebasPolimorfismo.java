package org.ptech.java.citas.entities;

import java.time.LocalDate;
import java.time.Month;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class PruebasPolimorfismo {

    public static void main(String[] args) {
    ///Instanciar usuario
        Usuario u =  new Medico(3  , "Brayan ", "Penelope", TipoDocumento.CC, 101010101L, 282828L, Especialidad.PEDIATRA);    
        
    System.out.println(u.toString());

    Usuario n =  new Paciente(101231, 
                      "Cristian", 
                      "Guayacan", 
                      TipoDocumento.TI, 1019027121L,
                       "akdjsa1@gmail.com", 101010L, LocalDate.of(2004 , Month.AUGUST , 14), 
                       1.29, 0.70 , 
                       TipoSangre.O, 
                       '+');

System.out.println(n.toString());

Consultorio c = new Consultorio(012, "Calle 129 A98 7", 303030);
System.out.println(c.toString());

        Enfermero e = new Enfermero(1012, "Juan", "Gutierrez", TipoDocumento.CC , 101012L);
        System.out.println(e.toString());
    }
















}
