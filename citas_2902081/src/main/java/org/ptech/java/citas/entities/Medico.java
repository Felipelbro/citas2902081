package org.ptech.java.citas.entities;

public class Medico {
    
    //los atributos de una clase deben ser privados 
    private int id;
    private String nombres;
    private String apellidos;
    private TipoDocumento tipoDocumento;
    private Long numeroDocumento;
    private Long registroMedico;
    private Especialidad especialidad;
    public Medico() {
    }
    public Medico(int id, String nombres, String apellidos, TipoDocumento tipoDocumento, Long numeroDocumento,
            Long registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
        }
        //Getters y Setters deben de ser publicos
        //Firma de un Getter:
        //Tipo de dato de reterno de un getter
        //El tipo de dato del atributo
        //Nombre del metodo;
        //      get seguiido de nombre del atributo
        //parametros: 0
        //retorna: valor del atributo
    
    public String getNombres() {
        //Return sirve para retornar el valor al invocante
        return this.nombres;
    }
    //Setter: Sirve para asignar un valor a un atributo privado 
    // Firma de un Setter:
    // - Tipo de dato de retorno: void
    // -  Nombre: Set seguido del nombre del atributo
    // - Parametros: 1 solo, input del valor a asignar
    //                      al atributo
    // - retorna: nada
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public Long getNumeroDocumento() {
        return numeroDocumento;
    }
    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
   

}
