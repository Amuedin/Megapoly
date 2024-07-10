/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoly;

import megapoly.Casillas.CasillaGen;
import megapoly.Casillas.Banco;
import megapoly.Casillas.Calle;
import megapoly.Casillas.Carcel;
import megapoly.Casillas.Parking;
import megapoly.Casillas.Salida;
import megapoly.Casillas.Suerte;

/**
 *
 * @author jjesu
 */
public class Tablero {

    private CasillaGen[] casillas; //Array de objeto CasillaGen

    /**
     * Constructor por defecto
     */
    public Tablero() {
        casillas = new CasillaGen[20];
        casillas[0] = new Salida("Salida", "negro");
        casillas[1] = new Calle("Palmera", "roja", 45, 25, true);
        casillas[2] = new Calle("Borbolla", "roja", 50, 25, true);
        casillas[3] = new Banco("Banco", "amarilla");
        casillas[4] = new Calle("Betis", "roja", 60, 30, true);
        casillas[5] = new Carcel("Carcel", "azul");
        casillas[6] = new Calle("Luis Montoto", "roja", 65, 30, true);
        casillas[7] = new Calle("Montesierra", "roja", 70, 35, true);
        casillas[8] = new Suerte("Suerte", "morada");
        casillas[9] = new Calle("La Raza", "roja", 70, 35, true);
        casillas[10] = new Parking("Parking", "blanca");
        casillas[11] = new Calle("Calatrava", "roja", 75, 35, true);
        casillas[12] = new Calle("Trajano", "roja", 80, 40, true);
        casillas[13] = new Banco("Banco", "amarillo");
        casillas[14] = new Calle("Constitucion", "roja", 90, 45, true);
        casillas[15] = new Carcel("Carcel", "azul");
        casillas[16] = new Calle("Tetuan", "roja", 90, 50, true);
        casillas[17] = new Calle("ReyesCatolicos", "roja", 95, 50, true);
        casillas[18] = new Suerte("Suerte", "morada");
        casillas[19] = new Calle("Sierpes", "roja", 100, 60, true);

    }

    /**
     *
     * @return
     */
    public CasillaGen[] getCasillas() {
        return casillas;
    }

    /**
     *
     * @param casillas
     */
    public void setCasillas(CasillaGen[] casillas) {
        this.casillas = casillas;
    }

    /**
     *metodo de pruebas
     * @param casillas
     * @param num
     */
    public void mostrarDatos(CasillaGen[] casillas, int num) {
        
        for (int i = 0; i < num; i++) {
            System.out.println(casillas[i]); //sale por teclado lo que tengo en el toString de CasillaSalida
        }

    }

    /**
     *metodo de pruebas
     * @param movimiento
     * @param casillas
     * @deprecated 
     */
    public void obtenerPosicion(int movimiento, CasillaGen[] casillas) {
        casillas = getCasillas();
    }

}
