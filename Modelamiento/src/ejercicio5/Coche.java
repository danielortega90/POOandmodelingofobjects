/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Daniel CAVS
 */
public class Coche extends Vehiculo {

    private int puerta;

    public Coche(int puerta) {
        this.puerta = 1;
    }

    public Coche() {
        this.numPasajero = 5;
        this.numRueda = 4;
        this.fechaMatriculacion = 1995;
        this.medioDesplaza = "Gasoil";
        this.puerta = 1;
    }

    public void cuantasPuerta() {
        this.puerta = this.puerta;
        System.out.println("El auto tiene :" + puerta + " puerta abierta");
    }
}
