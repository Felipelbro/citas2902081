package org.ptech.java.citas.entities;
import java.time.LocalDateTime;
import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.MotivoCita;
import org.ptech.java.citas.interfaces.IAgendable;

public class CitaMedico extends Cita implements IAgendable{

    Medico medico;
    EstadoCita estado;
    MotivoCita motivo;
    
    

    public CitaMedico(int id, LocalDateTime fecha, Consultorio consultorio, Paciente paciente, Medico medico,
            EstadoCita estado, MotivoCita motivo) {
        super(id, fecha, consultorio, paciente);
        this.medico = medico;
        this.estado = estado;
        this.motivo = motivo;
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



    public Medico getMedico() {
        return medico;
    }



    public void setMedico(Medico medico) {
        this.medico = medico;
    }



    public EstadoCita getEstado() {
        return estado;
    }



    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }



    public MotivoCita getMotivo() {
        return motivo;
    }



    public void setMotivo(MotivoCita motivo) {
        this.motivo = motivo;
    }

        

}
