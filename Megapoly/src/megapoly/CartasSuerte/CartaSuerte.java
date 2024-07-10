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
public abstract class CartaSuerte {

    private String nombre;

    /**
     *
     * @param nombre
     */
    public CartaSuerte(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "CartaSuerte{ " + nombre + '}';
    }

    /**
     * Todas las cartas suerte usarán este método, deben 
     * porque es abstracto además
     *
     * @param jugador
     */
    public abstract void efectoCarta(Jugador jugador);

}
