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
public class P1e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner(System.in);
        int[] num=new int [10];
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce un número: ");
            num[i]=lector.nextInt();
        }
        
        System.out.println("Los números que has introducido son: ");
        
        for (int i = 0; i <= 4; i++) {
            System.out.println(num[i]);
            System.out.println(num[9-i]);
        }
    }
    
}
