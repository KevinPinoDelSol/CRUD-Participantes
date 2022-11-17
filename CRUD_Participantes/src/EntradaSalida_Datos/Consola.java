package EntradaSalida_Datos;


import Excepciones.ErrorEntradaNoValida;
import Excepciones.ErrorDeTipoDeDato;
import java.util.Scanner;
import Modelos.Participante;
import Principal.Main;
import static Principal.Main.participantes;
import java.util.ArrayList;

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
     * @return  objeto Participante
     */
    public static Participante entrarParticipante(){
        Scanner read = new Scanner(System.in);
        
        System.out.println("\nAñadiendo participante:");
        
        System.out.println("Diga el nombre: ");
        String nombre = read.nextLine();
        
        System.out.println("Diga los apellidos: ");
        String apellidos = read.nextLine();
        
        System.out.println("Diga el Carnet de identidad: ");
        long carnetIdentidad = read.nextInt();
        
        System.out.println("Diga la edad:");
        int edad = read.nextInt();
        
        Participante nuevo = new Participante(nombre, apellidos, carnetIdentidad, edad);
        return nuevo;
    }
    
    /**
     * Opcion #2 de la consola
     */
    public static void mostrarParticipantes(ArrayList participantes){
        System.out.println("");
        for(int i=0;i<participantes.size();i++){
            System.out.print("Participante #"+(i+1)+"  ");
            System.out.println(participantes.get(i).toString());
        }
            System.out.println("");
        
    }
    
    /**
     * Opcion #3 de la consola
     */
    public static void modificarParticipante(int numeroParticipante) throws ErrorDeTipoDeDato, ErrorEntradaNoValida{
        Scanner read = new Scanner(System.in);
        
        Participante participante = participantes.get(numeroParticipante);
        
        System.out.println("Diga que dato desea cambiar.");
        System.out.println("1: Nombre.");
        System.out.println("2: Apellidos.");
        System.out.println("3: Carnet de identidad.");
        System.out.println("4: Edad.");
        System.out.println("5: Todo.");
        
        int opcion = read.nextInt();
        if(opcion>5 || opcion<1) throw new ErrorEntradaNoValida();
        
        if(opcion==1){
            String nombre=read.nextLine();
            participante.setNombre(nombre);
        }
        else if(opcion==2){
            String apellidos=read.nextLine();
            participante.setApellidos(apellidos);
        }
        else if(opcion==3){
            long carnetIdentidad=read.nextInt();
            participante.setCarnetIdentidad(carnetIdentidad);
        }
        else if(opcion==4){
            int edad=read.nextInt();
            participante.setEdad(edad);
        } 
        else{
            participante = Consola.entrarParticipante();
        }
    }
    
    /**
     * Opcion #4 de la consola
     * (Es solo notificacion)
     */
    public static void borrarParticipanteNotificacion() {
        System.out.println("El participante fue borrado correctamente.");
    }
    
    /**
     * Opcion #5 de la consola
     * (Es solo notificacion)
     */
    public static void guardarCambiosNotificacion(){
        System.out.println("\nLos datos fueron guardados correctamente.");
    }
    
    /**
     * Opcion #6 de la consola
     */
    public static void salirNotificacion(){
        System.out.println("Tenga buen dia.");
    }
    
    /**
     * Pide al usuario elegir un participante
     * @return el numero de posicion en el arrayList
     * @throws ErrorDeTipoDeDato
     * @throws ErrorEntradaNoValida 
     */
    public static int elegirParticipante()throws ErrorDeTipoDeDato, ErrorEntradaNoValida{
        System.out.println("Diga el numero del participante");
        
        Scanner read = new Scanner(System.in);
        int pos = read.nextInt();
        
        if(pos<1 || pos>Main.participantes.size()){
            throw new ErrorEntradaNoValida();
        }
        
        pos -- ;
        return pos;
    }
    
    /**
     * Imprime un mensaje de una linea por consola.
     * @param msg el mensaje a imprimir
     */
    public static void imprimirMensaje(String msg){
        System.out.println("\n"+msg);
    }
    
}
