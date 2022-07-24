/*
* Una interesante clase predefinida en el lenguaje java es la clase Vector,
* que implemente la abstracción "array dinámico". Revise la clase y úsela (en ficheros diferentes) 
* para realizar un programa que lea números del teclado hasta que se introduce dos veces seguidas el mismo número.
* Entonces el programa muestra todos los números introducidos y termina.
*/
package ejercicio6;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Daniel CAVS
 */
public class ArrayDinamico {

    public static void main(String[] args) {
       //Instancio las dos clases hijas de la clase abstracta para darle la funcionalidad
       //y realizar el ejercicio pedido 
        
       ArrayDos array = new ArrayDos();
      
       array.rellenar();
       ArrayTres ar = new ArrayTres();
       ar.rellenar();
      
}
}