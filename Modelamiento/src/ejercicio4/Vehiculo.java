/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Daniel CAVS
 */
public class Vehiculo {
    //atributos de la clase
    public String nombre;
    public int numPasajero;
    public int numRueda;
    public int fechaMatriculacion;
    public String medioDesplaza;

    //constructo de la clase

    Vehiculo(String nom,int numPas,int numR, int fechaMatri, String medioDea) {
         nombre=nom;
         numPasajero=numPas;
         numRueda=numR;
         fechaMatriculacion=fechaMatri;
         medioDesplaza=medioDea;
         
         
         
    }

    
    
    
    
    public Integer getNumPasajero() {
        return numPasajero;
    }

    public void setNumPasajero(Integer numPasajero) {
        this.numPasajero = numPasajero;
    }

    public int getNumRueda() {
        return numRueda;
    }

    public void setNumRueda(int numRueda) {
        this.numRueda = numRueda;
    }

    public int getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(int fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getMedioDesplaza() {
        return medioDesplaza;
    }

    public void setMedioDesplaza(String medioDesplaza) {
        this.medioDesplaza = medioDesplaza;
    }

    @Override
    public String toString() {
        return "{" +"Marca = "+ nombre +
                "- Número de pasajero = " + numPasajero + 
               "\n- Número de Ruedas  = " + numRueda + 
                "\n- Fecha de creacion = " + fechaMatriculacion + 
                "\n- Combustible = " + medioDesplaza + '}';
    }
    
}
