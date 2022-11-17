package EntradaSalida_Datos;


import Modelos.Participante;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class AccesoDiscoDuro {
    static String ruta="dataBase.data";

    public static ArrayList<Participante> cargarDatos() throws FileNotFoundException, IOException, ClassNotFoundException {
        File baseDatos = new File(ruta);
        FileInputStream entradaDatos= new FileInputStream(baseDatos);
        ObjectInputStream entradaObjetos= new ObjectInputStream(entradaDatos);
        
        ArrayList<Participante> participantes = new ArrayList<>();
        
        int cantidadParticipantes = entradaObjetos.readInt();
        
        for(int i=0; i<cantidadParticipantes;i++){
            Participante nuevo=(Participante)entradaObjetos.readObject();
            participantes.add(nuevo);
        }
        
        return participantes;
    }
    
    public static void guardarDatos(ArrayList<Participante> participantes) throws FileNotFoundException, IOException{
        
        File baseDatos = new File(ruta);
        FileOutputStream salidaDatos = new FileOutputStream(baseDatos);
        ObjectOutputStream salidaObjetos = new ObjectOutputStream(salidaDatos);
        
        int cantidad = participantes.size();
        salidaObjetos.writeInt(cantidad);
        
        for(int i=0;i<cantidad;i++){
            salidaObjetos.writeObject(participantes.get(i));
        }
        
        salidaObjetos.flush();
        salidaObjetos.close();
    }
    
}
