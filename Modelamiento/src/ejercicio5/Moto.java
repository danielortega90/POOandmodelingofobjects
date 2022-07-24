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
public class Moto extends Vehiculo{
    public int frenar;
    public Moto(int frenar){
       this.frenar=0;
    }
    public Moto() {
        this.numPasajero=2;
        this.numRueda=2;
        this.fechaMatriculacion=1992;
        this.medioDesplaza="Nafta";
        this.frenar=0;
    }

   public void frenarM(){
      this.frenar=this.frenar;
       System.out.println("La Moto freno a :"+frenar+"  km/h");
   }
    
    
}
