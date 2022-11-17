package Principal;

import Modelos.Participante;
import EntradaSalida_Datos.AccesoDiscoDuro;
import EntradaSalida_Datos.Consola;
import Excepciones.ErrorDeTipoDeDato;
import Excepciones.ErrorEntradaNoValida;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Kevin
 */
public class Main {
        public static ArrayList<Participante> participantes;
    
    public static void main(String[] args) {
        
            try {
                participantes = AccesoDiscoDuro.cargarDatos();
            } catch(FileNotFoundException ex){
                Consola.imprimirMensaje("No hay datos.");
                participantes=new ArrayList<>();
            } catch (IOException ex) {
                participantes=new ArrayList<>();
                System.out.println("IOExcepcion");
                Consola.imprimirMensaje(ex.getMessage());
            } catch (ClassNotFoundException ex) {
                participantes=new ArrayList<>();
                Consola.imprimirMensaje(ex.getMessage());
            }
        
        boolean funcionando=true;
        
        while(funcionando){
            
            Consola.mostrarOpciones();
            int opcion = Consola.ObtenerOpcion();
            
            
            if(opcion==1){
                participantes.add(Consola.entrarParticipante());
            }
            else if(opcion==2){
                Consola.mostrarParticipantes(participantes);
            }
            else if(opcion==3){
                try{
                int participante = Consola.elegirParticipante();
                Consola.modificarParticipante(participante);
                }catch(ErrorDeTipoDeDato | ErrorEntradaNoValida e){
                        Consola.imprimirMensaje(e.getMessage());
                }
            }
            else if(opcion==4){
                int numeroParticipante;
                try {
                    numeroParticipante = Consola.elegirParticipante();
                    participantes.remove(numeroParticipante);
                    Consola.borrarParticipanteNotificacion();
                } catch (ErrorDeTipoDeDato | ErrorEntradaNoValida ex) {
                    Consola.imprimirMensaje(ex.getMessage());
                }
            }
            else if(opcion==5){
                try {
                    AccesoDiscoDuro.guardarDatos(participantes);
                    Consola.guardarCambiosNotificacion();
                } catch (IOException ex) {
                    Consola.imprimirMensaje(ex.getMessage());
                }
            }
            else if(opcion==6){
                Consola.salirNotificacion();
                System.exit(0);
            }
            
        }
    }
    
}
