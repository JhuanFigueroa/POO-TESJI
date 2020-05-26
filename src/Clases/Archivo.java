
package Clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    File archivo = new File("agendaContactos.txt");
    
    
    public void crearArchivo(){
        try {
            if(archivo.createNewFile()){
                //Creamos el archivo
            }
        } catch (IOException ex) {
            System.out.println("Error:"+ex);
        }
     
    }
    
   public void escribirTexto(Persona persona){
        try {
            FileWriter escribir = new FileWriter(archivo,true);
            escribir.write(persona.getNombre()+"%"+persona.getCorreo()+"%"+persona.getCelular()+"\r\n");//ecribimos en nuestro archivo los datos de cada persona
            escribir.close();
            
        } catch (IOException ex) {
            System.out.println("error: "+ex);
        }
   }
}
