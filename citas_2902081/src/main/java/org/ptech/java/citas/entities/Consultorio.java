package org.ptech.java.citas.entities;

public class Consultorio {

        private int id;
        private String direccion;
        private int numero;
        
        
        @Override
        public String toString() {
            return "Consultorio ID: " + id + ", Direccion: " + direccion + ", Numero:" + numero + " ";
        }
        //sin parametros
        public Consultorio() {
        }
        //parametros
          public Consultorio(int id, String direccion, int numero) {
            this.id = id;
            this.direccion = direccion;
            this.numero = numero;
        }
        //getters and setters 
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        

        
        
}
