    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Otto
 */
public class P1e6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner lector=new Scanner(System.in);
        int[] lista1=new int [12];
        int[] lista2=new int [12];
        int[] lista3=new int [24];
        
        System.out.println("Rellene la primera lista: ");
        for (int i = 0; i < lista1.length; i++) {
            System.out.println("Introduce un número: ");
            lista1[i]=lector.nextInt();
        }
        
        System.out.println("Rellene la segunda lista: ");
        for (int i = 0; i < lista2.length; i++) {
            System.out.println("Introduce un número: ");
            lista2[i]=lector.nextInt();
        }
        
        //crea la tercera lista mezclando los elementos de la primera y la segunda
        for (int i = 0; i < 4; i++) {
            lista3[i*6]=lista1[i*3];
            lista3[(i*6)+1]=lista1[(i*3)+1];
            lista3[(i*6)+2]=lista1[(i*3)+2];
            lista3[(i*6)+3]=lista2[(i*3)];
            lista3[(i*6)+4]=lista2[(i*3)+1];
            lista3[(i*6)+5]=lista2[(i*3)+2];
        }
        
        System.out.println("Este es el resultado de la tercera tabla:");
        for (int i = 0; i < 24; i++) {
            System.out.println(lista3[i]+" ");
        }
    }
    
}
