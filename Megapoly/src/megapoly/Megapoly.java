/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package megapoly;

import megapoly.Jugador;
import Partida.CargarPartida;
import Partida.GuardarPartida;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import megapoly.Casillas.CasillaGen;

/**
 * @deprecated 
 * @author jjesu
 */
public class Megapoly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tablero mitablero = new Tablero(); // inicializamos tablero
        mitablero.mostrarDatos(mitablero.getCasillas(), 18);//CC
        CasillaGen[] micasilla;
        micasilla = mitablero.getCasillas();
        Turno turnos = new Turno();
        String ganador = "";
        GuardarPartida mipartida = new GuardarPartida();
        CargarPartida partidaG = new CargarPartida();
        Scanner teclado = new Scanner(System.in);
        String respuesta = "";
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        jugadores.add(new Jugador("Pepe","rojo",100));
        jugadores.add(new Jugador("Juan","verde",100));
        System.out.println(jugadores.size());
        for (Jugador j: jugadores){
            System.out.println(j.toString());
            
        }
        
        Jugador jugador1 = null;
        Jugador jugador2 = null;
        //jugadores.add(jugador1);
        FileInputStream cargar = null;
        ObjectInputStream datos = null;
        //System.out.println("Bienvenido a Megapoly, elige el número de jugadores"); Para arraylist?
        System.out.println("Deseas cargar partida?");
        respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            try {
                cargar = new FileInputStream("partida.dat");
                datos = new ObjectInputStream(cargar);

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            try {
                //jugador1 = (Jugador) datos.readObject();
                jugadores.set(0,(Jugador) datos.readObject());
                //jugador2 = (Jugador) datos.readObject();
                jugadores.set(1, (Jugador) datos.readObject());
            } catch (IOException | ClassNotFoundException er) {
                System.out.println("No se pudieron cargar los datos");
            }
        }
        /*if (respuesta.equalsIgnoreCase("si")) {

            partidaG.cargar(jugador1, jugador2);

        } else {
            jugador1 = new Jugador("Juan", "Verde", 100);
            jugador2 = new Jugador("Pepe", "Azul", 100);
        }*/

        System.out.println(jugadores.get(0).toString());//CC
        System.out.println(jugadores.get(1).toString());

        /*//////////////////////////////////
        //////EMPIEZA EL JUEGO//////////////
        ///////////////////////////////////*/
        while (jugadores.get(0).getMegamonedas() > 0 && jugadores.get(1).getMegamonedas() > 0) {
            ////////TURNO JUGADOR 1/////////

            turnos.turnoJugador(jugadores.get(0), jugadores.get(1), micasilla, mitablero);

            ////////TURNO JUGADOR 2/////////
            turnos.turnoJugador(jugadores.get(1), jugadores.get(0), micasilla, mitablero);

            System.out.println("Deseas guardar partida?");
            respuesta = teclado.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                mipartida.guardar(jugadores.get(0), jugadores.get(1));

            }

        }

        System.out.println("EL GANADOR ES: " + (ganador = (jugadores.get(0).getMegamonedas() > jugadores.get(1).getMegamonedas()) ? jugadores.get(0).getNombre() : jugadores.get(1).getNombre()));

    }
}
