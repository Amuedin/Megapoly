/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoly.Casillas;

import java.util.Random;
import javax.swing.JOptionPane;
import megapoly.Jugador;

/**
 *
 * @author jjesu
 */
public class Parking extends CasillaGen {

    private int bote;

    /**
     * Constructor defecto
     */
    public Parking() {
        this.bote = 0;
    }

    /**
     * Constructor para usar en la Clase Tablero
     *
     * @param nombreCasilla
     * @param colorCasilla
     */
    public Parking(String nombreCasilla, String colorCasilla) {
        super(nombreCasilla, colorCasilla);
        this.bote = 0;
    }

    /**
     *
     * @return
     */
    public int getBote() {
        return bote;
    }

    /**
     *
     * @param bote
     */
    public void setBote(int bote) {
        this.bote = bote;
    }

    /**
     * Cuando un jugador cae en la casilla Parking, tira un dado, y si obtiene
     * un numero par, gana el bote.
     *
     * @param jugador
     */
    @Override
    public void obtenerBote(Jugador jugador) {
        Random r = new Random();
        int lanzamiento;
        JOptionPane.showMessageDialog(null,"El bote actual es " + getBote() + " ,lanza un dado para conseguirlo");
        lanzamiento = r.nextInt(1, 7);
        if (lanzamiento % 2 == 0) {
            JOptionPane.showMessageDialog(null,"Has ganado!");
            jugador.setMegamonedas(jugador.getMegamonedas() + getBote());
            setBote(0);
        } else {
            JOptionPane.showMessageDialog(null,"Mala suerte!");
        }
    }

    /**
     * Aumenta el bote cuando un jugador coge una carta Multa
     */
    @Override
    public void ingresoBote() {
        setBote(getBote() + 20);
    }
}
