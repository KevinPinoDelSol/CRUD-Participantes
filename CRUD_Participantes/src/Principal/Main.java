package Principal;

import Modelos.Participante;
import EntradaSalida_Datos.AccesoDiscoDuro;
import EntradaSalida_Datos.Consola;
import java.util.ArrayList;


/**
 *
 * @author Kevin
 */
public class Main {
        public static ArrayList<Participante> participantes;
    
    public static void main(String[] args) {
        
        participantes = new ArrayList<>();
        AccesoDiscoDuro.cargarDatos();
        
        boolean funcionando=true;
        
        while(funcionando){
            
            Consola.mostrarOpciones();
            int opcion = Consola.ObtenerOpcion();
            
            if(opcion==1) Consola.
        }
    }
    
}
