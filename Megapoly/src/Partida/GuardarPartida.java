/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Partida;

import java.io.*;
import megapoly.Jugador;

/**
 *
 * @author jjesu
 */
public class GuardarPartida {
    
    FileOutputStream guardado = null;
    ObjectOutputStream objetos = null;
    File borrado = null;

    public GuardarPartida() {
    }

    
    public void guardar(Jugador jugador1, Jugador jugador2){
    try {
            guardado = new FileOutputStream("partida.dat");
            objetos = new ObjectOutputStream(guardado);
            
        } catch (IOException ex) {
           System.out.println(ex.getMessage());
        }

    try{
      
      objetos.writeObject(jugador1); 
      objetos.writeObject(jugador2);
    }
    catch(IOException error){
        System.out.println(error.toString());
    }
    finally{
        try{
            objetos.close();
            guardado.close();
        }
        catch(IOException er){
            System.out.println(er.toString());
        }
    }
}
   
    
    


        

     
}
