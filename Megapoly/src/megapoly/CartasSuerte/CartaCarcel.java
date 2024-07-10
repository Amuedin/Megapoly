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
public class CartaCarcel extends CartaSuerte {

    /**
     *
     * @param nombre
     */
    public CartaCarcel(String nombre) {
        super(nombre);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Carcel";
    }

    /**
     * Establece que el jugador tiene una carta carcel en su mano, solo podra 
     * tener una(implementado en la Clase Suerte)
     * @param jugador
     */
    @Override
    public void efectoCarta(Jugador jugador) {

        System.out.println("Puedes usar esta carta para salir de la carcel");
        jugador.setAbogado(true);

    }

}
