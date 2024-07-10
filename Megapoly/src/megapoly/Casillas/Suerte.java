/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoly.Casillas;

import megapoly.CartasSuerte.CartaMulta;
import megapoly.CartasSuerte.CartaHerencia;
import megapoly.CartasSuerte.CartaCarcel;
import megapoly.CartasSuerte.CartaSuerte;
import java.util.Random;
import javax.swing.JOptionPane;
import megapoly.Jugador;

/**
 *
 * @author jjesu
 */
public class Suerte extends CasillaGen {

    private CartaSuerte[] cartas = new CartaSuerte[3];

    /**
     *
     */
    public Suerte() {
        cartas[0] = new CartaHerencia("Herencia");
        cartas[1] = new CartaCarcel("Abogado");
        cartas[2] = new CartaMulta("Multa");
    }

    /**
     * Cuando tablero llama a este constructor, ademas de la casilla Suerte,
     * crea su array de cartas.
     *
     * @param nombreCasilla
     * @param colorCasilla
     */
    public Suerte(String nombreCasilla, String colorCasilla) {
        super(nombreCasilla, colorCasilla);
        cartas[0] = new CartaHerencia("Herencia");
        cartas[1] = new CartaCarcel("Abogado");
        cartas[2] = new CartaMulta("Multa");

    }

    /**
     *
     * @return
     */
    public CartaSuerte[] getCartas() {
        return cartas;
    }

    /**
     *
     * @param cartas
     */
    public void setCartas(CartaSuerte[] cartas) {
        this.cartas = cartas;
    }

    /**
     * Saca una carta de forma aleatoria, teniendo en cuenta que un jugador solo
     * puede tener una carta abogado y que si sale carta Multa, el importe a
     * pagar va al bote de la casilla Parking
     *
     * @param jugador
     * @param bote
     */
    @Override
    public void robarCarta(Jugador jugador, Parking bote) {
        Random robar = new Random();
        int resultado = 0;
        do {
            resultado = robar.nextInt(0, 3);
            if (jugador.isAbogado() && resultado == 1) {
                JOptionPane.showMessageDialog(null,"Solo puedes tener una carta de abogado, saca otra carta");
            }
        } while (resultado == 1 && jugador.isAbogado());

        JOptionPane.showMessageDialog(null,"Has robado una carta " + cartas[resultado]);
        cartas[resultado].efectoCarta(jugador); //selecciono un tipo de carta del array y sobre ella aplico el metodo sobreescrito
        if (resultado == 2) {
            bote.ingresoBote();
        }
    }
}
