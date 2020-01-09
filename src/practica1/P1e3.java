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
public class P1e3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector=new Scanner(System.in);
        int[] num=new int [5];
        int pos=0, neg=0, cero=0, cont_pos=0, cont_neg=0;
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce un número: ");
            num[i]=lector.nextInt();
        }
        
        for (int i = 0; i<num.length; i++) {
            if (num[i]>0) {
                pos=pos+num[i];
                cont_pos++;
            }
            else if (num[i]<0) {
                neg=neg+num[1];
                cont_neg++;
            }
            else{
                cero++;
            }
        }
        
        if (cont_pos==0) {
            System.out.println("No se puede hace la media de números positivos.");//probando commits
        } else {
            System.out.println("La media de los números positivos es: "+(float)pos/cont_pos);
        }
        
        if (cont_neg==0) {
            System.out.println("No se puede hace la media de números negativos.");
        } else {
            System.out.println("La media de los números negativos es: "+(float)(neg/cont_neg));
        }
        
        if (cero==0) {
            System.out.println("No hay ningún 0.");
        }else{
            System.out.println("El número de ceros es: "+cero);
        }
    }
    
}
