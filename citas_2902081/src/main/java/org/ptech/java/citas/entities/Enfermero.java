package org.ptech.java.citas.entities;

import java.util.ArrayList;
import java.util.List;
import org.ptech.java.citas.entities.enums.TipoDocumento;

public class Enfermero extends Usuario {

    private List<String> procedimientos;
    
    
    public Enfermero(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento) {
        super(id, 
        nombres, 
        apellidos, 
        tipoDocumento, 
        numeroDocumento);
        //llamar al constructor de la super clase
        //intrinsecos del objeto


        this.procedimientos = new ArrayList<String>();
      
    }
    @Override
    public String toString() {
        return "Enfermero [procedimientos=" + procedimientos + "]";
    }
    public void addProcedure(String procedure) {

        //añadir el string procedimiento a la lista de procedimientos 
        this.procedimientos.add(procedure); 
    }

    public List<String> getProcedimientos() {
        return procedimientos;
    }
}
