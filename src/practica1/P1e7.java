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
public class P1e7 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner lector=new Scanner(System.in);

    public static void e1(){
        int[] num=new int [5];
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce un número: ");
            num[i]=lector.nextInt();
        }
        
        System.out.println("Los números que has introducido son: ");
        
        for(int i: num){
            System.out.println(i);
        }
    }
    
    public static void e2(){
        int[] num=new int [5];
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce un número: ");
            num[i]=lector.nextInt();
        }
        
        System.out.println("Los números que has introducido son: ");
        
        for(int i=num.length-1; i>=0; i--){
            System.out.println(num[i]);
        }
    }
    
    public static void e3(){
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
                neg=neg+num[i];
                cont_neg++;
            }
            else{
                cero++;
            }
        }
        
        if (cont_pos==0) {
            System.out.println("No se puede hace la media de números positivos.");
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
    
    public static void e4(){
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
    
    public static void e5(){
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
    
    public static void e6(){
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
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salir=false;
        int opcion;
        
        while(!salir){
            
            System.out.println("");
            System.out.println("MENÚ");
            System.out.println("1- Leer 5 num y mostrarlos en orden.");
            System.out.println("2- Leer 5 num y mostrarlos en orden inverso.");
            System.out.println("3- Leer 5 num y realizar la media de positivos, la de negativos y el num de ceros");
            System.out.println("4- Leer 10 num y mostrarlos en este orden: primero, último, segunto, penúltimo...");
            System.out.println("5- Rellenar dos tablas con numeros y mostrar una tercera con valores de ambas tablas mezclados tal que: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.");
            System.out.println("6- Rellenar dos tablas con números y mostrar una tercera con valores de ambas tablas mezclados tal que: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3\n" +
"de la B, etc.");
            System.out.println("7- Salir");
            System.out.println("");
            System.out.println("Elije una opcion: ");
            opcion=lector.nextInt();
            System.out.println("");
            
            switch(opcion){
                case 1:
                    e1();
                    break;
                case 2:
                    e2();
                    break;
                case 3:
                    e3();
                    break;
                case 4:
                    e4();
                    break;
                case 5:
                    e5();
                    break;
                case 6:
                    e6();
                    break;
                case 7:
                    salir=true;
                    break;
            }
        }
    }
    
}
