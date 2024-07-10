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
public class Banco extends CasillaGen{

    /**
     *
     * @param nombreCasilla
     * @param colorCasilla
     */
    public Banco(String nombreCasilla, String colorCasilla) {
        super(nombreCasilla, colorCasilla);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Banco";
    }

    /**
     *
     * @param jugador
     */
    @Override
    public void pagoImpuesto(Jugador jugador){
        jugador.setMegamonedas(jugador.getMegamonedas() - 10);
    }
}
