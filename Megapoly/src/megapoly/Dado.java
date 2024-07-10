/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoly;

import java.util.Random;

/**
 *
 * @author jjesu
 */
public class Dado {

    private final static int[] caras;

    static {
        caras = new int[]{1, 2, 3, 4, 5, 6};
    }

    /**
     * Simula la tirada de un dado de 6 caras
     *
     * @return
     */
    public static int lanzarDados() {
        Random rnd = new Random();
        return caras[rnd.nextInt(0, 6)];

    }

    /**
     * Implementa que las tiradas se hagan con dos dados y si sale 6 y 6 vuelvas
     * a tirar (revisable), como metodo estatico de Dado.
     *
     * @param dado1
     * @return
     */
    public static String comprobarTirada(int dado1) {

        if (dado1 == 12) {
            return "Avanza " + (dado1) + " y vuelve a lanzar";

        }
        return "Avanza " + (dado1);
    }
}
