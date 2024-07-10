/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoly;

import java.io.Serializable;
import megapoly.Casillas.Salida;

/**
 *@deprecated 
 * @author jjesu
 */
public class Ficha implements Serializable {

    private String color;
    private int posicion;

    /**
     * Constructor por defecto
     */
    public Ficha() {
        this.color = "sin color";
        this.posicion = 0;

    }

    /**
     *
     * @param color
     */
    public Ficha(String color) {
        this.color = color;
        this.posicion = 0;

    }

    /**
     *
     * @param color
     * @param posicion
     */
    public Ficha(String color, int posicion) {
        this.color = color;
        this.posicion = posicion;

    }

    /**
     *
     * @return
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     *
     * @param posicion
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Nos devuelve la casilla a la que se mueve el jugador, se reinicia si pasa
     * por la salida y el jugador cobra 20 megamonedas. Si la nueva posición es
     * mayor que el numero de casillas, pasas por salida, y recalcula la nueva
     * posicion restandole el total
     *
     * @param tirada1
     * @param tirada2
     * @param miTablero
     * @param jugador
     * @param casillaSalida //El metodo cobrar por pasar por la salida está en
     * esta clase
     * @return
     */
    public int movimientoJugador(int tirada1, Tablero miTablero, Jugador jugador, Salida casillaSalida) {

        setPosicion(tirada1 + getPosicion()); //obtengo la nueva posición y la guardo
        if (getPosicion() == 20) {
            setPosicion(0);
            casillaSalida.cobraSalida(jugador);
            return getPosicion();
        } else if (getPosicion() > miTablero.getCasillas().length) {
            setPosicion(getPosicion() - (miTablero.getCasillas().length + 1));
            casillaSalida.cobraSalida(jugador);
            return getPosicion();
        } else {
            return getPosicion();
        }
    }
}
