/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2.pkg1;

import java.util.Scanner;

/**
 *
 * @author Otto
 */
public class Practica21 {

    /**
     * @param args the command line arguments
     */
    static Scanner lector=new Scanner(System.in);

    public static void tabla5x5(){
        //Crear una tabla bidimensional de tamaño 5x5 
        //y rellenarla de la siguiente forma: la posición T[n,m] 
        //debe contener n+m. Después se debe mostrar su contenido.
        int[][] tabla=new int [5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tabla[i][j]=i+j;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tabla[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void tabla4x4(){
        //Crear y cargar una tabla de tamaño 4x4 y decir si es simétrica o no, es decir, si se obtiene la misma tabla al cambiar filas por columnas.
        int[][] tabla=new int [4][4];
        boolean simetrico;
        
        //crea tabla
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Introduzca valores numéricos");
                tabla[i][j]=lector.nextInt();
            }
        }
        System.out.println("");
        
        //imprime la tabla
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tabla[i][j]+" ");
            }
            System.out.println("");
        }
        
        simetrico = true;
        int control = tabla.length -1;
        int i=0;
        while (i < control && simetrico == true) {            
            int j=0;
            while (j < control && simetrico == true) {                
                if(tabla[i][j] != tabla[j][i]){
                    simetrico = false;
                }
                j++;
            }
          i++;
        }
        if(simetrico){
            System.out.println("La tabla es Simétrica diagonalmente.");
        }
        else{
            System.out.println("La tabla no es Simétrica diagonalmente.");
        }
    }
    
    public static void tabla3x3(){
        //Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma.
        int[][] tabla1=new int [3][3];
        int[][] tabla2=new int [3][3];
        int[][] tabla3=new int [3][3];
        //crea tabla1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduzca valores numéricos de la 1ª tabla: ");
                tabla1[i][j]=lector.nextInt();
            }
        }
        System.out.println("");
        
        //crea tabla2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Introduzca valores numéricos de la 2ª tabla: ");
                tabla2[i][j]=lector.nextInt();
            }
        }
        System.out.println("");
        
        //suma las tablsa
        for (int i = 0; i < tabla3.length; i++) {
            for (int j = 0; j < tabla3.length; j++) {
                tabla3[i][j]=tabla1[i][j]+tabla2[i][j];
            }
        }
        
        //muestra la tabla3 en la que se suman las otras 2
        System.out.println("El resultado de la suma de las tablas es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabla3[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void tabla7x7(){
        //Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal principal sean 1 y el resto 0.
        int[][] tabla=new int [7][7];
        
        //selecciopna los elementos diagonales y les da el valor de 1
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                if (tabla[i][j]==tabla[j][i]) {
                    tabla[i][j]=1;
                }
                else{
                    tabla[i][j]=0;
                    tabla[j][i]=0;
                }
            }
        }
        
        System.out.println("La tabla resultante es: ");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(tabla[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void marco8x6(){
        int[][] marco=new int[8][6];
        
        //marca los bordes como un 1
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (i==0 || j==0 || i==7 || j==5) {
                    marco[i][j]=1;
                } 
                
                else{
                    marco[i][j]=0;
                }
            }
        }
        
        System.out.println("La tabla resultante es: ");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(marco[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void marcoUsuario(){
        int x=0, y=0;
        
        System.out.println("Introduzca el numero de filas: ");
        x= lector.nextInt();
        System.out.println("Introduce el número de columnas");
        y= lector.nextInt();
        
        int[][] marco=new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i==0 || j==0 || i==(x-1) || j==(y-1)) {
                    marco[i][j]=1;
                } 
                else{
                    marco[i][j]=0;
                }
            }
        }
        
        System.out.println("La tabla resultante es: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(marco[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salir=false;
        int opcion;
        
        while(!salir){
            
            System.out.println("");
            System.out.println("MENÚ");
            System.out.println("1- Tabla5x5 que la posición T[n,m] debe contener n+m.");
            System.out.println("2- Comprobar si tabla 4x4 es simetrica diagonal");
            System.out.println("3- Crear dos matrices de tamaño 3x3, sumarlas y mostrar su resultado.");
            System.out.println("4- Tabla tamaño 7x7 con los elementos de la diagonal principal igual a 1 y el resto 0.");
            System.out.println("5- Marco tamaño 8x6. Todos sus elementos son 0 salvo los de los bordes que son 1.");
            System.out.println("6- Marco tamaño elegirá el usuario. Todos sus elementos son 0 salvo los de los bordes que son 1.");
            System.out.println("7- Salir");
            System.out.println("");
            System.out.println("Elije una opcion: ");
            opcion=lector.nextInt();
            System.out.println("");
            
            switch(opcion){
                case 1:
                    tabla5x5();
                    break;
                case 2:
                    tabla4x4();
                    break;
                case 3:
                    tabla3x3();
                    break;
                case 4:
                    tabla7x7();
                    break;
                case 5:
                    marco8x6();
                    break;
                case 6:
                    marcoUsuario();
                    break;
                case 7:
                    salir=true;
                    break;
            }
        }
    }
    
}

    
    
