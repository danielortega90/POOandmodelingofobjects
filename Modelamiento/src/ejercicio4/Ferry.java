/*
  Se quiere implementar el control de un Ferry. 
  Para ello cree una clase Vehículo.Incluya aspectos comunes a todos los vehículos como número de pasajeros,
  presencia o ausencia de tripulación, número de ruedas,
  fecha de matriculación,medio por el que se desplaza, etc.
  Incluya los métodos que considere oportunos.
  Realice un programa capaz de leer por teclado los datos de 10 vehículos y los liste a continuación por pantalla.
 */
package ejercicio4;

/**
 *
 * @author Daniel CAVS
 */
public class Ferry {

    public static void main(String[] args) {
        //Creo un array de objetos de la calse vehiculos
        Vehiculo[] vehiculo = {new Vehiculo("BMW",4, 4, 1980, "Nafta")
                              ,new Vehiculo("Audi A4",4, 4, 2020, "Nafta")
                              ,new Vehiculo("Camaro",2, 4, 2010, "Nafta")
                              ,new Vehiculo("Audi A5",2, 4, 2018, "Nafta")
                              ,new Vehiculo("Golf",4, 4, 1990, "Nafta")
                              ,new Vehiculo("Renault",4, 4, 2001, "Nafta")
                              ,new Vehiculo("Fiat ",5, 4, 1970, "Nafta")
                              ,new Vehiculo("Audi A1",2, 4, 2010, "Nafta")
                              ,new Vehiculo("Ferrari",1, 4, 2015, "Nafta")
                              ,new Vehiculo("Fiat Uno",1, 4, 2013, "Nafta")};
        //Muestro el array de los objetos
        for (int i = 0; i < vehiculo.length; i++) {
            System.out.println("Lista de autos \n"+vehiculo[i]);
        }
            
    }
    
    
}
