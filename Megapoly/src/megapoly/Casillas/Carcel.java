/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoly.Casillas;

import javax.swing.JOptionPane;
import megapoly.Jugador;

/**
 *
 * @author jjesu
 */
public class Carcel extends CasillaGen {

    /**
     *
     * @param nombreCasilla
     * @param colorCasilla
     */
    public Carcel(String nombreCasilla, String colorCasilla) {
        super(nombreCasilla, colorCasilla);
        

    }

    /**
     * 
     * @param preso
     */
    @Override
    public void aLaCarcel(Jugador preso) {
        if (!preso.isEncarcelado() && !preso.isAbogado()) {
            preso.setEncarcelado(true);
            JOptionPane.showMessageDialog(null,preso.getNombre() + " va a la carcel");
        }
    }
}
