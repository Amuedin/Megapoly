/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoly.Casillas;

import megapoly.Jugador;

/**
 *
 * @author jjesu
 */
public class Salida extends CasillaGen {

    /**
     * Constructor por defecto
     */
    public Salida() {

    }

    /**
     *
     * @param nombreCasilla
     * @param colorCasilla
     */
    public Salida(String nombreCasilla, String colorCasilla) {
        super(nombreCasilla, colorCasilla);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Cobras 20 megamonedas por pasar por la Salida";
    }

    /**
     * Metodo para pagar por salida, usado por la clase Ficha
     *
     * @param jugador
     */
    @Override
    public void cobraSalida(Jugador jugador) {
        System.out.println(toString());
        jugador.setMegamonedas(jugador.getMegamonedas() + 20);

    }

}
