/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoly;

import megapoly.Jugador;
import megapoly.Casillas.Salida;
import java.io.Serializable;

/**
 *
 * @author jjesu
 */
public class Jugador implements Serializable {

    private String nombre;
    private String color;
    private int megamonedas;
    private int contadorCarcel;
    private Ficha fichaJugador;
    private boolean encarcelado;
    private boolean Abogado;

    /**
     * Constructor por defecto
     */
    public Jugador() { 
        this.nombre = "Sin nombre";
        this.color = "Sin color";
        this.megamonedas = 0;
        this.contadorCarcel = 0;
        this.encarcelado = false;
        this.Abogado = false;
        this.fichaJugador = new Ficha();
    }
    /**
     * 
     * @param nombre 
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.color = "Sin color";
        this.megamonedas = 100;
        this.contadorCarcel = 0;
        this.encarcelado = false;
        this.Abogado = false;
        this.fichaJugador = new Ficha();
    }

    /**
     *
     * @param nombre
     * @param color
     * @param megamonedas
     */
    public Jugador(String nombre, String color, int megamonedas) {
        this.nombre = nombre;
        this.color = color;
        this.megamonedas = megamonedas;
        this.contadorCarcel = 0;
        this.encarcelado = false;
        this.Abogado = false;
        this.fichaJugador = new Ficha();

    }

    /**
     * Marca el estado del jugador, si está en la carcel o no
     *
     * @return
     */
    public boolean isEncarcelado() {
        return encarcelado;
    }

    /**
     *
     * @param encarcelado
     */
    public void setEncarcelado(boolean encarcelado) {
        this.encarcelado = encarcelado;
    }

    /**
     *
     * @return
     */
    public boolean isAbogado() {
        return Abogado;
    }

    /**
     * Se pasa a true cuando un jugador obtiene la carta abogado de la clase
     * Suerte
     *
     * @param Abogado
     */
    public void setAbogado(boolean Abogado) {
        this.Abogado = Abogado;
    }

    /**
     *
     * @return
     */
    public Ficha getFichaJugador() {
        return fichaJugador;
    }

    /**
     *
     * @param fichaJugador
     */
    public void setFichaJugador(Ficha fichaJugador) {
        this.fichaJugador = fichaJugador;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
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
     * @return
     */
    public int getMegamonedas() {
        return megamonedas;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @param megamonedas
     */
    public void setMegamonedas(int megamonedas) {
        this.megamonedas = megamonedas;
    }
    /**
     * Cada jugador tendrá un contador interno de turnos en la carcel
     * @return 
     */
    public int getContadorCarcel() {
        return contadorCarcel;
    }
    /**
     * 
     * @param contadorCarcel 
     */
    public void setContadorCarcel(int contadorCarcel) {
        this.contadorCarcel = contadorCarcel;
    }

    /**
     *@
     * @return
     */
    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", color=" + color + ", megamonedas=" + megamonedas + '}';
    }

    /**
     * @deprecated 
     * @param tirada1
     * @param mitablero
     * @param jugador
     * @param casillaSalida
     * @return
     */
    public int movimientoJugador(int tirada1, Tablero mitablero, Jugador jugador, Salida casillaSalida) {

        return getFichaJugador().movimientoJugador(tirada1, mitablero, jugador, casillaSalida);

    }

}
