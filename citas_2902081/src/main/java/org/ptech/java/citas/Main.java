package org.ptech.java.citas;
 

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.ptech.java.citas.entities.CitaEnfermero;
import org.ptech.java.citas.entities.CitaMedico;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.Usuario; 
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.MotivoCita;
import org.ptech.java.citas.entities.enums.Procedimientos;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");
        //consultorio 
        Consultorio c1 = new Consultorio(012, "Calle 129 A98 7", 303030);
        //Crear un nuevo medico
        Medico m1 = new Medico(1, "daniel", "Toloza", TipoDocumento.CC, 1011010110L, 323432423L, Especialidad.CARDIOLOGO);
        //System.out.println("ID del medico: " + " " + m1.getId() + " " + "Nombre del medico" + " " + m1.getNombres() + " " +  " apellidos del medico " + " " + m1.getApellidos());
        Medico m2 = new Medico(2, "LAURA", "HERNANDEZ", TipoDocumento.RC, 1212123L, 2344l, Especialidad.MEDICINA_GENERAL);
        //System.out.println("ID del medico: " + " " + m2.getId() + " " + "Nombre del medico" + " " + m2.getNombres() + " " +  " Apellido del medico " + " " + m2.getApellidos());
        
        //Crear un nuevo paciente
        Paciente p1 = new Paciente(1, "Sofia", "Clavijo", TipoDocumento.CC, 12131415L, "asdfg@gmail.com", 3200000l, LocalDate.of(2004, Month.FEBRUARY, 13), 1.70, 70.0, TipoSangre.O, '+');
        //System.out.println("ID del paciente" + " " + p1.getId());
        Paciente p2 = new Paciente(2, "Sara", "Calvo", TipoDocumento.CC, 12131412L, "sara@gmail.com", 3300000l, LocalDate.of(2006, Month.FEBRUARY, 12), 1.72, 40.0, TipoSangre.O, '+');
        Paciente p3 = new Paciente(3, "Juliana", "Beltran", TipoDocumento.CC, 12131413L, "juliana@gmail.com", 340000l, LocalDate.of(2007, Month.FEBRUARY, 14), 1.60, 50.0, TipoSangre.B, '+');
        Paciente p4 = new Paciente(4, "Mariana", "Barreto", TipoDocumento.CC, 12131414L, "mariana@gmail.com", 3500000l, LocalDate.of(2003, Month.FEBRUARY, 15), 1.62, 60.0, TipoSangre.AB, '+');
        Paciente p5 = new Paciente(5, "Catalina", "Monte", TipoDocumento.CC, 12131415L, "catalian@gmail.com", 3600000l, LocalDate.of(2002, Month.FEBRUARY, 16), 1.75, 56.0, TipoSangre.O, '-');
        //Crear un enfermero :
        Enfermero e1 = new Enfermero( 1, "Karen", "Cardenas", TipoDocumento.PPT , 12312432453L);
        Enfermero e2 = new Enfermero( 2, "Paula", "Morales", TipoDocumento.CC , 1100000000L);
        Enfermero e3 = new Enfermero( 3, "camila", "Londoño", TipoDocumento.CC , 1230000000L);

        //Registro de CitaMedico
        CitaMedico b1 = new CitaMedico(1, LocalDateTime.of(2024, Month.AUGUST, 12, 12, 30), c1 , p2, m2,EstadoCita.AGENDADA, MotivoCita.Escopolamina);
        CitaMedico b2 = new CitaMedico(2, LocalDateTime.of(2024, Month.APRIL, 2, 20, 30), c1 , p3, m1, EstadoCita.AGENDADA, MotivoCita.Gripa);
        System.out.println("Fecha: " + " " + b1.getFecha() + " " + "Consultorio: " + " " +  b1.getConsultorio() + " " + "NombreMedico: " + " " + m2.getNombres() + " " + "Apellido: " + " " + m2.getApellidos() + " " + "NombrePaciente: " + " " + p2.getNombres() + " " + "ApellidoPaciente" + " " + p2.getApellidos()+ " " + "Motivo: " + " " + b1.getMotivo());
        System.out.println("Fecha: " + " " + b2.getFecha() + " " + "Consultorio: " + " " +  b2.getConsultorio() + " " + "NombreMedico: " + " " + m1.getNombres() + " " + "Apellido: " + " " + m1.getApellidos() + " " + "NombrePaciente: " + " " + p3.getNombres() + " " + "ApellidoPaciente" + " " + p3.getApellidos()+ " " + "Motivo: " + " " + b2.getMotivo());
        //Registro de CiaEnfermero
        CitaEnfermero f1 = new CitaEnfermero(1,LocalDateTime.of(2024, Month.SEPTEMBER, 13, 11, 30) , c1, p4, e3, Procedimientos.Lavado_Oidos, EstadoCita.AGENDADA);
        CitaEnfermero f2 = new CitaEnfermero(2,LocalDateTime.of(2024, Month.MAY, 13, 11, 30) , c1, p1, e2, Procedimientos.Lavado_Oidos, EstadoCita.AGENDADA);
        CitaEnfermero f3 = new CitaEnfermero(3,LocalDateTime.of(2024, Month.MARCH, 13, 11, 30) , c1, p5, e1, Procedimientos.Vacuna, EstadoCita.CANCELADA);
        System.out.println("Fecha: " + " "+ f3.getFecha() + " " + "Consultorio: " + " " + f3.getConsultorio() + " " + "NombreEnfermero: " + " " + e1.getNombres() + " " + "ApellidoEnfermero:" + " " + e1.getApellidos() + " " + "NombrePaciente: " + p5.getNombres() + " " + "ApellidoPaciente:" + " " + p5.getApellidos() + " " + "Procedimiento:" + " " + f3.getProcedimientos() + " " + "Estado: " +" " + f3.getEstadoCita() );
    }
    


}