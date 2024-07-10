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
public class CartaHerencia extends CartaSuerte {

    /**
     *
     * @param nombre
     */
    public CartaHerencia(String nombre) {
        super(nombre);
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Herencia";
    }

    /**
     *
     * @param jugador
     */
    @Override
    public void efectoCarta(Jugador jugador) {
        System.out.println("Recibes una herencia de un familiar lejano");
        jugador.setMegamonedas(jugador.getMegamonedas() + 10);
    }
}
