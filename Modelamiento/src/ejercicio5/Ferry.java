/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Daniel CAVS
 */
public class Ferry {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;
        do {
            System.out.println("\n\n----Menu--");
            System.out.println("1-Desea crear una Moto");
            System.out.println("2-Desea crear un Avion");
            System.out.println("3-Desea crear un Coche");
            System.out.println("4-Desea crear un Camion");
            System.out.println("Cualquier otra Numero para salir");
            a = entrada.nextInt();

            switch (a) {
                case 1:
                    Moto v = new Moto();
                    System.out.println("Moto\n" + v);
                    v.frenarM();
                    break;
                case 2:
                    Avion av = new Avion();
                    System.out.println("Avion\n " + av);
                    av.alturaAv();
                    break;
                case 3:
                    Coche c = new Coche();
                    System.out.println("Coche\n " + c);
                    c.cuantasPuerta();
                    break;
                case 4:
                    Camion ca = new Camion();
                    System.out.println("Camion\n " + ca);
                    ca.AlturaCa();
                    break;
                default:
                    System.exit(0);
            }
        } while (a >= 0 || a <= 4);

    }
}
