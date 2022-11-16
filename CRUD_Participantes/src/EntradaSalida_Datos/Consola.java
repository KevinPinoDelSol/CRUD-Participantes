package EntradaSalida_Datos;


import Excepciones.ErrorPosicionNoValida;
import Excepciones.ErrorDeTipoDeDato;
import java.util.Scanner;
import Modelos.Participante;
import Principal.Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Consola {

    public static void mostrarOpciones() {
        System.out.println("Opciones:");
        System.out.println("1: Añadir participante");
        System.out.println("2: Mostrar lista de participantes");
        System.out.println("3: Modificar Partipicante");
        System.out.println("4: Borrar Participante");
        System.out.println("5: Guardar cambios");
        System.out.println("6: Salir");
    }

    public static int ObtenerOpcion() throws ErrorDeTipoDeDato{
        
        Scanner read = new Scanner(System.in);
        int opcionEscogida = read.nextInt();
        
        return opcionEscogida;
    }
    
    /**
     * Opcion #1 de la consola
     */
    public static Participante entrarParticipante(){
        Scanner read = new Scanner(System.in);
        
        System.out.println("\nAñadiendo participante:");
        
        System.out.println("Diga el nombre: ");
        String nombre = read.nextLine();
        
        System.out.println("Diga los apellidos: ");
        String apellidos = read.nextLine();
        
        System.out.println("Diga el Carnet de identidad: ");
        int carnetIdentidad = read.nextInt();
        
        System.out.println("Diga la edad:");
        int edad = read.nextInt();
        
        Participante nuevo = new Participante(nombre, apellidos, carnetIdentidad, edad);
        return nuevo;
    }
    
    /**
     * Opcion #2 de la consola
     */
    public static void mostrarParticipantes(){
        
    }
    
    /**
     * Opcion #3 de la consola
     */
    public static void modificarParticipante(){
        
        
        
    }
    
    /**
     * Opcion #4 de la consola
     * (Es solo notificacion)
     */
    public static void borrarParticipante() throws ErrorDeTipoDeDato, ErrorPosicionNoValida{
        System.out.println("El participante fue borrado correctamente.");
    }
    
    /**
     * Opcion #5 de la consola
     * (Es solo notificacion)
     */
    public static void guardarCambios(){
        System.out.println("\nLos datos fueron guardados correctamente.\n");
    }
    
    /**
     * Opcion #6 de la consola
     */
    public static void salir(){
        System.exit(0);
    }
    
    public static int elegirParticipante()throws ErrorDeTipoDeDato, ErrorPosicionNoValida{
        System.out.println("Diga el numero del participante");
        
        Scanner read = new Scanner(System.in);
        int pos = read.nextInt();
        
        if(pos<1 || pos>Main.participantes.size()){
            throw new ErrorPosicionNoValida();
        }
        
        pos -- ;
        return pos;
    }
    
}
