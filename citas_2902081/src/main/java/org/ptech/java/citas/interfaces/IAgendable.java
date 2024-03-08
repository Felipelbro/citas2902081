package org.ptech.java.citas.interfaces;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Consultorio;

public interface IAgendable {
    //Propooner un metodo para agendar la cita
    public boolean agendarCita(LocalDateTime fecha, Consultorio c);
    //Proponer un metodo para reagedar cita
    public boolean reAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc);
    //Cancelar Cita
    public boolean cancelarCita();




}
