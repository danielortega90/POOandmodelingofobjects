/*
  Se quiere implementar el control de un Ferry. Para ello cree una clase Vehículo.
  Incluya aspectos comunes a todos los vehículos como número de pasajeros, presencia o ausencia de tripulación, 
  número de ruedas, fecha de matriculación,medio por el que se desplaza, etc. 
  Incluya los métodos que considere oportunos.Realice un programa capaz de leer por teclado los datos de 10 vehículos y los liste a continuación por pantalla.
 */
package ejercicio5;

/**
 *
 * @author Daniel CAVS
 */
public abstract class Vehiculo {
    public Integer numPasajero;
    public int numRueda;
    public int fechaMatriculacion;
    public String medioDesplaza;

    public Vehiculo() {
        this.numPasajero = 0;
        this.numRueda = 0;
        this.fechaMatriculacion = 0;
        this.medioDesplaza = "";
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
        return "{" + "- Número de pasajero = " + numPasajero + 
               "\n- Número de Ruedas  = " + numRueda + 
                "\n- Fecha de creacion = " + fechaMatriculacion + 
                "\n- Combustible = " + medioDesplaza + '}';
    }
    
    
    
}
