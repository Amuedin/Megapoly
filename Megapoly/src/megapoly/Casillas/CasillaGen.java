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
public class CasillaGen {

    private String nombreCasilla;
    private String colorCasilla;
    private Boolean propiedad;

    /**
     *
     */
    public CasillaGen() {
        this.colorCasilla = "";
        this.nombreCasilla = "";
        this.propiedad = false;

    }

    /**
     *
     * @param nombreCasilla
     * @param colorCasilla
     */
    public CasillaGen(String nombreCasilla, String colorCasilla) {
        this.nombreCasilla = nombreCasilla;
        this.colorCasilla = colorCasilla;
        this.propiedad = false;
    }
    /**
     * 
     * @return 
     */
    public Boolean getPropiedad() {
        return propiedad;
    }
    /**
     * 
     * @param propiedad 
     */
    public void setPropiedad(Boolean propiedad) {
        this.propiedad = propiedad;
    }

    /**
     *
     * @return
     */
    public String getNombreCasilla() {
        return nombreCasilla;
    }

    /**
     *
     * @param nombreCasilla
     */
    public void setNombreCasilla(String nombreCasilla) {
        this.nombreCasilla = nombreCasilla;
    }

    /**
     *
     * @return
     */
    public String getColorCasilla() {
        return colorCasilla;
    }

    /**
     *
     * @param colorCasilla
     */
    public void setColorCasilla(String colorCasilla) {
        this.colorCasilla = colorCasilla;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return nombreCasilla + '(' + colorCasilla + ')';
    }

    /**
     * Para la clase Calle
     *
     * @param propietario
     */
    public void comprarPropiedad(Jugador propietario) {

    }

    /**
     * Para la clase Calle
     *
     * @param jugador
     */
    public void venderPropiedad(Jugador jugador) {

    }

    /**
     * Para la clase Salida
     *
     * @param jugador
     */
    public void cobraSalida(Jugador jugador) {

    }

    /**
     * Para la clase Banco
     *
     * @param jugador
     */
    public void pagoImpuesto(Jugador jugador) {

    }

    /**
     * Para la clase Carcel
     *
     * @param preso
     */
    public void aLaCarcel(Jugador preso/*, Jugador liberado*/) {

    }

    /**
     * Para la clase Carcel
     *@deprecated 
     * @param prisionero
     */
    public void setPrisionero(boolean prisionero) {

    }

    /**
     * Para la clase Suerte
     *
     * @param jugador
     * @param bote
     */
    public void robarCarta(Jugador jugador, Parking bote) {

    }

    /**
     * Para la clase Parking
     *
     * @param jugador
     */
    public void obtenerBote(Jugador jugador) {

    }

    /**
     * Para la clase Parking
     */
    public void ingresoBote() {

    }
    
}
