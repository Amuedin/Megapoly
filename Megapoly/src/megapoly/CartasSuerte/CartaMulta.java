/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoly.CartasSuerte;

import megapoly.Jugador;

/**
 *
 * @author jjesu
 */
public class CartaMulta extends CartaSuerte {

    /**
     *
     * @param nombre
     */
    public CartaMulta(String nombre) {
        super(nombre);

    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Multa";
    }

    /**
     * El importe de las multas pasa a engrosar el bote de la casilla Parking, 
     * implementado en el metodo obtenerCarta de la clase Suerte
     * @param jugador
     */
    @Override
    public void efectoCarta(Jugador jugador) {
        System.out.println("Recibes una multa de aparcamiento");
        jugador.setMegamonedas(jugador.getMegamonedas() - 20);

    }

}
