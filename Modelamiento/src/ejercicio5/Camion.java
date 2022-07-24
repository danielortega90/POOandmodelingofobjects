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
public class Camion extends Vehiculo {
    public int altura;
    public Camion(int altura){
     this.altura=5;
    }
    public Camion(){
        this.numPasajero=1;
        this.numRueda=8;
        this.fechaMatriculacion=1985;
        this.medioDesplaza="Nafta";
        this.altura=5;
    
    }
    public void AlturaCa(){
       this.altura=this.altura;
        System.out.println("La altura del camion es de :"+altura+" metros");
    }
}
