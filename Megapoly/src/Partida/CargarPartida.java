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
public class CargarPartida {
    FileInputStream cargar = null;
    ObjectInputStream datos = null;
    public CargarPartida() {
    }
    
    public void cargar(Jugador jugador1, Jugador jugador2){
        try{
            cargar = new FileInputStream("partida.dat");
            datos = new ObjectInputStream(cargar);
        }
        catch(IOException error){
            System.out.println(error.getMessage());
        }
        try{
            jugador1 = (Jugador) datos.readObject();
            System.out.println(jugador1.toString());
            jugador2 = (Jugador) datos.readObject();
            System.out.println(jugador2.toString());
        }
        catch(IOException | ClassNotFoundException er){
            System.out.println(er.getMessage());
        }
        finally{
            try{
                datos.close();
                cargar.close();
            }
            catch(IOException er2){
                System.out.println(er2.getMessage());
            }
        }
        
        
    }
}
