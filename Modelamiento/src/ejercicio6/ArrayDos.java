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
public class ArrayDos extends Array {

    //Atributos de la clase
    Vector<Integer> num;

    //Constructor
    public ArrayDos() {
    }

    public ArrayDos(Vector<Integer> num) {
        this.num = num;
    }

    //metodo  sobreescrito
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
