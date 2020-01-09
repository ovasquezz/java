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
public class P1e5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner(System.in);
        int[] lista1=new int [10];
        int[] lista2=new int [10];
        int[] lista3=new int [20];
        
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
        for (int i = 0; i < 10; i++) {
            lista3[i+i]=lista1[i];
            lista3[i+i+1]=lista2[i];
        }
        
        System.out.println("Este es el resultado de la tercera tabla:");
        for (int i = 0; i < 20; i++) {
            System.out.println(lista3[i]+" ");
        }
        
    }
    
}
