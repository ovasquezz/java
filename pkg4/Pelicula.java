/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg4;

import java.util.Scanner;

/**
 *
 * @author Alumnat
 */
public class Pelicula {
    static Scanner lector=new Scanner(System.in);
    static int almacen=0;
    private int idPelicula;
    private String titulo;
    private String director;
    private int duracion;
    private String genero;
    private int año;
    private boolean disponibilidad;
    private int numCopias;
    private int numCopiasReservadas;

    public Pelicula(int idPelicula, String titulo, String director, int duracion, String genero, int año, boolean disponibilidad, int numCopias, int numCopiasReservadas) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.año = año;
        this.disponibilidad = disponibilidad;
        this.numCopias = numCopias;
        this.numCopiasReservadas = numCopiasReservadas;
    }

    public Pelicula() {
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getNumCopias() {
        return numCopias;
    }

    public void setNumCopias(int numCopias) {
        this.numCopias = numCopias;
    }

    public int getNumCopiasReservadas() {
        return numCopiasReservadas;
    }

    public void setNumCopiasReservadas(int numCopiasReservadas) {
        this.numCopiasReservadas = numCopiasReservadas;
    }
    
    public void añadirPelicula(){
        System.out.println("Introduzca el nombre de la película: ");
        String titulo1=lector.nextLine();
        System.out.println("Introduzca la cantidad de copias que desea introducir: ");
        int copias2=lector.nextInt();
        if (copias2>3000||almacen>3000) {
            System.out.println("Imposible almacenar. Limite alcanzado");
            lector.nextLine();
            return;
        } else {
            this.setNumCopias(copias2);
            almacen=almacen+copias2;
        }
        lector.nextLine();
        almacen=almacen+this.getNumCopias();
        System.out.println("Introduzca el director de la película: ");
        this.setDirector(lector.nextLine());
        System.out.println("Introduzca el genero: ");
        this.setGenero(lector.nextLine());
        System.out.println("Introduzca el año de estreno: ");
        this.setAño(lector.nextInt());
        System.out.println("Introdzca la duración: ");
        this.setDuracion(lector.nextInt());
        lector.nextLine();
        this.setIdPelicula(idPelicula+1);
        this.setNumCopiasReservadas(numCopiasReservadas=0);
        this.setDisponibilidad(true);
    }   
    
    public void reservarPelicula(){
        
    }
}
