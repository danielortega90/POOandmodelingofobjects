/*
* Desarrolle una clase en Java que realice la abstracción de un sistema planetario,
* debiendo tener en cuenta para cada cuerpo del sistema aspectos como: masa,densidad,
* diámetro, distancia al sol (suponga órbitas circulares), un número de identificador único y un nombre textual.
* Incluya métodos que calculen la atracción gravitatoria entre dos cuerpos cualesquiera del siste
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Daniel CAVS
 */
public class SistemaPlanetario {

    public static void main(String[] args) {
        //instanciar los objetos 
        Scanner entrada =new Scanner(System.in);
        Marte marte = new Marte();
        Mercurio mercurio = new Mercurio();
        Jupiter jupiter = new Jupiter();
        //atributos de la clase
        int a = 0;
        //Creo el menu de App
        do {            
            
        
        System.out.println("---------MENU----------");
        System.out.println("--ELIJA LA OPCION QUE DESEE--");
        System.out.println("\n1-LA ATRACCION ENTRE MERCURIO Y MARTE ES:");
        System.out.println("\n2-LA ATRACCION ENTRE MERCURIO Y JUPITER ES: ");
        System.out.println("\n3-LA ATRACCION ENTRE JUPITER Y MARTE ES: ");
        System.out.println("\n4-PRECIONE CUALQUIER OTRO NUMERO PARA SALIR");
        a =entrada.nextInt();
        switch (a) {
            case 1:
                  System.out.println("La atraccion en tre lso cuerpo Martes y Mercurio es :" + marte.atraccionCuerpo(mercurio));
                  break;
            case 2:
                  System.out.println("La atraccion en tre lso cuerpo Mercurio y Jupiter es :"+ mercurio.atraccionCuerpo(jupiter));
                  break;
            case 3:
                  System.out.println("La atraccion en tre lso cuerpo Jupiter y Marte es :"+jupiter.atraccionCuerpo(marte));
                  break;
             default :
               System.exit(0);      
        }

        } while (a>=0 || a<=3);
    }
}
