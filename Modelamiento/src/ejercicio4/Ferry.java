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
        Vehiculo[] vehiculo = new Vehiculo[10];
        
        llenarVehiculo(vehiculo);
        //Muestro el array de los objetos
        for (int i = 0; i < vehiculo.length; i++) {
            System.out.println("Lista de autos \n"+vehiculo[i]);
        }
            
    }
    //metodo para Pedir datos al usuario por consola
    public static void llenarVehiculo(Vehiculo[] vehiculo){
         Scanner entrada = new Scanner(System.in);
         
         for (int i = 0;i < vehiculo.length; i++) {
             System.out.println("Ingrese Marca del auto");
             String nom = entrada.nextLine();
             System.out.println("Número de Pasajeros");
             int numPas = entrada.nextInt();
             System.out.println("Número de Ruedas");
             int numR= entrada.nextInt();
             System.out.println("Año de creacion");
             int fechaMatri= entrada.nextInt();
             System.out.println("Combustible que utiliza");
             entrada.nextLine();
             String medioDea= entrada.nextLine();
            
             vehiculo[i]= new Vehiculo(nom, numPas, numR, fechaMatri, medioDea);
        }
    }
            
    }
    
    
}
