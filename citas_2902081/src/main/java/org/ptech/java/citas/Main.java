package org.ptech.java.citas;
 

import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Usuario; 
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");
//Crear un nuevo medico
        Medico m1 = new Medico(1, "daniel", "Toloza", TipoDocumento.CC, 1011010110L, 323432423L, Especialidad.CARDIOLOGO);
        System.out.println("id del medico: " + " " + m1.getId() + " " + "nombres del medico" + " " + m1.getNombres() + " " +  " apellidos del medico " + " " + m1.getApellidos());
        //Crear un enfermero :
        Enfermero e1 = new Enfermero( 1, "eduar", "cespedes", TipoDocumento.PPT , 12312432453L);

        //añadir 2 procedimuientos al enfermero

        e1.addProcedure( "Aplicar inyecciones");
        e1.addProcedure( "Lavado de oidos");

        for( String p : e1.getProcedimientos() ){
            System.out.println("procedimientos:" + p);

        }
        

    }



}