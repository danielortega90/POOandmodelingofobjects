/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Daniel CAVS
 */
public class ArrayNumero {
      
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         //atributos de la clase
         int num [] = new int [10]; 
         int a = 0;
         //Creo el menu de App
         do {             
             
        
          num=relleno(num);
          System.out.println("\n\n------Menu-----");
          System.out.println("1-Mostrar");
          System.out.println("2-Metodo Burbuja");
          System.out.println("3-Metodo quickSort");
          System.out.println("Cualquier otra Numero para salir");
          a=entrada.nextInt();
       switch(a){
           case 1:
                mostrar(num);
                break;
           case 2:
                mostrar(ordenarBurbuja(num));
                break;
           case 3:
               mostrar(quicksort(num, 0, num.length-1));
               break;
           default :
               System.exit(0);
       }
        } while (a>=0 || a<=3);
    }
    //metodo de  mostrar el array 
    private static void mostrar(int[] a){
        for (int i = 0; i < 9; i++) {
             System.out.print("["+a[i]+"] ");
        }
    }
    //metodo de rellenar un array
    private static int[] relleno(int [] num){
      
        for (int i = 0; i < 9; i++) {
              num[i]=(int)(Math.random()*11+1);
              
          }
      return  num;
    }
    //metodo de ordenamiento del array 
    private static int[] ordenarBurbuja(int[] a){
        int aux = 0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j+1]<a[j]) {
                    aux=a[j+1];
                    a[j+1]=a[j];
                    a[j]=aux;
                }
            }
        }
       return a; 
    }
   //metodo de ordenamiento del array 
   public static int [] quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; 
  int i=izq;         
  int j=der;         
  int aux;
 
  while(i < j){                                                             
     while(A[i] <= pivote && i < j) i++; 
     while(A[j] > pivote) j--;           
     if (i < j) {                                            
         aux= A[i];                     
         A[i]=A[j];
         A[j]=aux;
     }
   }
   
   A[izq]=A[j];                                          
   A[j]=pivote;      
   
   if(izq < j-1)
      quicksort(A,izq,j-1);          
   if(j+1 < der)
      quicksort(A,j+1,der);          
   return A;
}
   
}
