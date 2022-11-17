package Modelos;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
 public class Participante implements Serializable{
     private String nombre;
     private String Apellidos;
     private long carnetIdentidad;
     private int edad;

    public Participante(String nombre, String Apellidos, long carnetIdentidad, int edad) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.carnetIdentidad = carnetIdentidad;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "{" + "nombre: " + nombre + ", Apellidos: " + Apellidos +
                ", carnetIdentidad: " + carnetIdentidad + ", edad: " + edad + " }";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public long getCarnetIdentidad() {
        return carnetIdentidad;
    }

    public void setCarnetIdentidad(long carnetIdentidad) {
        this.carnetIdentidad = carnetIdentidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
