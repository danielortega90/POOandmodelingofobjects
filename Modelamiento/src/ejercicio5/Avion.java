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
public class Avion extends Vehiculo {

    public int metroSobre;

    public Avion(int metroSobre) {
        this.metroSobre = 50000;
    }

    public Avion() {
        this.numPasajero = 55;
        this.numRueda = 3;
        this.fechaMatriculacion = 2010;
        this.medioDesplaza = "Nafta de Avion";
        this.metroSobre = 50000;
    }

    public void alturaAv() {
        this.metroSobre = this.metroSobre;
        System.out.println("El Avion viaja a :" + metroSobre + " metros de altura");
    }

}
