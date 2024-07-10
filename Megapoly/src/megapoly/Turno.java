/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoly;

import megapoly.Jugador;
import java.util.Scanner;
import megapoly.Casillas.*;

/**
 * @deprecated 
 * @author jjesu
 */
public class Turno {

    Scanner teclado = new Scanner(System.in);
    int turno;
    int resultado1;

    public Turno() {
    }

    /**
     *
     * @param jugador1
     * @param jugador2
     * @param micasilla
     * @param mitablero
     *
     */
    public void turnoJugador(Jugador jugador1, Jugador jugador2, CasillaGen[] micasilla, Tablero mitablero) {

        if (!jugador1.isEncarcelado()) {
            System.out.println("Turno de " + jugador1.getNombre());
            turno = teclado.nextInt();//CC
            resultado1 = Dado.lanzarDados() + Dado.lanzarDados();

            System.out.println(resultado1);

            System.out.println(Dado.comprobarTirada(resultado1));//comprueba tirada por si sale doble 6

            System.out.println(jugador1.getNombre() + " se mueve a la casilla " + jugador1.movimientoJugador(resultado1, mitablero, jugador1, (Salida) micasilla[0]));

            //El jugador se mueve y ahora hay que comprobar que ocurre dependiendo de la casilla en la que caiga
            switch (jugador1.getFichaJugador().getPosicion()) { //(posicion actual del jugador)
                case 0 -> {
                    //lo que pasa en casilla de salida está definido en el metodo movimientoJugador de la clase ficha
                    System.out.println("Tu saldo actual es " + jugador1.getMegamonedas());
                }
                case 1, 2, 4, 6, 8, 9, 11, 13, 14, 16, 17, 19 -> { //calles

                    micasilla[jugador1.getFichaJugador().getPosicion()].comprarPropiedad(jugador1); //evalua en esta posicion si se quiere comprar una calle

                }
                case 3, 12 -> {
                    System.out.println("Estas en el " + micasilla[jugador1.getFichaJugador().getPosicion()].getNombreCasilla() + ", pagas 10 megamonedas por impuestos");
                    micasilla[jugador1.getFichaJugador().getPosicion()].pagoImpuesto(jugador1);
                }
                case 10 -> {
                    System.out.println("Estas en el " + micasilla[jugador1.getFichaJugador().getPosicion()].getNombreCasilla());
                    micasilla[jugador1.getFichaJugador().getPosicion()].obtenerBote(jugador1);
                    System.out.println("Tu saldo es: " + jugador1.getMegamonedas());

                }
                case 5 -> {
                    System.out.println("Visitas la carcel");
                }
                case 15 -> {
                    jugador1.getFichaJugador().setPosicion(5);
                    System.out.println("Estas en la " + micasilla[jugador1.getFichaJugador().getPosicion()].getNombreCasilla());
                    micasilla[jugador1.getFichaJugador().getPosicion()].aLaCarcel(jugador1/*, jugador2*/);
                }
                case 7, 18 -> {
                    System.out.println("Estas en la " + micasilla[jugador1.getFichaJugador().getPosicion()].getNombreCasilla());
                    micasilla[jugador1.getFichaJugador().getPosicion()].robarCarta(jugador1, (Parking) micasilla[10]);
                }
            }
        } else if (jugador1.getContadorCarcel() < 2 && jugador1.isEncarcelado()) {
            System.out.println(jugador1.getNombre() + " te quedan " + (2 - jugador1.getContadorCarcel()) + " turnos en la carcel");
            jugador1.setContadorCarcel(jugador1.getContadorCarcel()+1);
        } else {
            jugador1.setEncarcelado(false);
            System.out.println(jugador1.getNombre() + " sales de la carcel");
            jugador1.setContadorCarcel(0);
            micasilla[jugador1.getFichaJugador().getPosicion()].setPrisionero(false);
        }
    }
}
