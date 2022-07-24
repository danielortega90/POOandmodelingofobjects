/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Vector;

/**
 *
 * @author Daniel CAVS
 */
public class ArrayTres extends Array {

    //atributos de la clase
    Vector<Integer> num;

    //constructor 
    public ArrayTres() {
    }

    public ArrayTres(Vector<Integer> num) {
        this.num = num;
    }
    //metodo  sobreescritos

    @Override
    public void rellenar() {
        num = new Vector<Integer>();
        do {
            System.out.println("Por favor ingrese un número");
            numero = entrada.nextInt();

            vectorNumeros.add(numero);

            for (int i = 0; i < vectorNumeros.size(); i++) {
                for (int j = i + 1; j < vectorNumeros.size(); j++) {
                    if (vectorNumeros.get(i) == vectorNumeros.get(j)) {
                        continuar = false;
                    }
                }
            }

        } while (continuar == true);

        System.out.println("El Vector es: " + vectorNumeros);
    }
}
