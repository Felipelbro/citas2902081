package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.Procedimientos;
import org.ptech.java.citas.interfaces.IAgendable;

   

public class CitaEnfermero extends Cita implements IAgendable { 
    Enfermero enfermero;
    Procedimientos procedimientos;
    EstadoCita estadoCita;

    
    public CitaEnfermero(int id, LocalDateTime fecha, Consultorio consultorio, Paciente paciente, Enfermero enfermero,
            Procedimientos procedimientos, EstadoCita estadoCita) {
        super(id, fecha, consultorio, paciente);
        this.enfermero = enfermero;
        this.procedimientos = procedimientos;
        this.estadoCita = estadoCita;
    }
    public Enfermero getEnfermero() {
        return enfermero;
    }
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }
    public Procedimientos getProcedimientos() {
        return procedimientos;
    }
    public void setProcedimientos(Procedimientos procedimientos) {
        this.procedimientos = procedimientos;
    }
    public EstadoCita getEstadoCita() {
        return estadoCita;
    }
    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }
    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) {
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }
    @Override
    public boolean reAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc) {
        throw new UnsupportedOperationException("Unimplemented method 'reAgendarCita'");
    }
    @Override
    public boolean cancelarCita() {
        throw new UnsupportedOperationException("Unimplemented method 'cancelarCita'");
    }

    
    
}