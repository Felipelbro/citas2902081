package org.ptech.java.citas;
 
 import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.ptech.java.citas.entities.*;
public class Main {
    public static void main(String[] args) {
        //Crear un objeto main
        //Instanciar medico
        //Una manera de dar valor
        //a atributos en una clase
        //es a traves de el constructor parametrizado
        Medico m = new Medico(1, "Eduar", "Cespedes", TipoDocumento.PPT, 1031809796L, 229L, Especialidad.MEDICINA_GENERAL);

        //Instanciar otro medico
        Medico m2 = new Medico();
        //se debe utlizar primero el SETTER 
        //del atributo asignar 
    
        m2.setNombres("daniel");
        m2.setApellidos("toloza");
        m2.setNumeroDocumento(1013603024L);
        System.out.println(m2.getNombres() +" " + m2.getApellidos());
      
        //paciente
        Paciente p1 = new Paciente( 1, "felipe", "sutaquira", TipoDocumento.CC, 101010101L,"dcespedes@gmail.com", 31111122L, LocalDate.of(2006, Month.MAY, 26), 1.72, 58.0, TipoSangre.O, '+');

        //COnsultorio
        Consultorio consultorio1 = new Consultorio();

        consultorio1.setId(1);
        consultorio1.setDireccion("Calle 52 #13-52");
        consultorio1.setNumero(12);

        //Citas
        Cita cita1 =new Cita();

        cita1.setId(1);
        cita1.setEstado(EstadoCita.AGENDADA);
        cita1.setConsultorio(consultorio1);
        cita1.setMedico(m2);
        cita1.setPaciente(p1);
        cita1.setFecha(LocalDateTime.of(2024, Month.MARCH, 13, 14, 20, 12 ));

        System.out.println( cita1.getId() + " " + cita1.getEstado() + " " + cita1.getConsultorio() + cita1.getMedico() + " " + cita1.getPaciente() + " " + cita1.getFecha());

    }

}