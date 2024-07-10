/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megapoly.Casillas;

import java.util.Scanner;
import javax.swing.JOptionPane;
import megapoly.Jugador;

/**
 *
 * @author jjesus
 */
public class Calle extends CasillaGen {

    private int precioCompra;
    private int precioVenta;
    private Jugador propietario;
    private boolean enVenta;
    private final int peaje;

    /**
     *
     */
    public Calle() {
        super();
        this.precioCompra = 0;
        this.precioVenta = 0;
        this.propietario = new Jugador();
        this.enVenta = true;
        this.peaje = 0;
    }

    /**
     *
     * @param nombreCasilla
     * @param colorCasilla
     * @param precioCompra
     * @param precioVenta
     * @param enVenta
     */
    public Calle(String nombreCasilla, String colorCasilla, int precioCompra, int precioVenta, boolean enVenta) {
        super(nombreCasilla, colorCasilla);
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.enVenta = enVenta;
        this.propietario = new Jugador();
        this.peaje = (this.precioCompra * 30) / 100;

    }

    /**
     *
     * @return
     */
    public int getPrecioCompra() {
        return precioCompra;
    }

    /**
     *
     * @param precioCompra
     */
    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     *
     * @return
     */
    public int getPrecioVenta() {
        return precioVenta;
    }

    /**
     *
     * @param precioVenta
     */
    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     *
     * @return
     */
    public Jugador getPropietario() {
        return propietario;
    }

    /**
     *
     * @param propietario
     */
    public void setPropietario(Jugador propietario) {
        this.propietario = propietario;
    }

    /**
     *
     * @return
     */
    public boolean isEnVenta() {
        return enVenta;
    }

    /**
     *
     * @param enVenta
     */
    public void setEnVenta(boolean enVenta) {
        this.enVenta = enVenta;
    }

    /**
     *
     * @return
     */
    public int getPeaje() {
        return peaje;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Calle " + super.toString() + ", precioCompra= " + precioCompra + ", precioVenta= " + precioVenta + ", peaje= " + peaje;
    }

    /**
     * Define la compra de una propiedad,si esta o no disponible, y si el
     * jugador que pasa es propietario o visitante, en cuyo caso paga peaje
     *
     * @param propietario
     */
    @Override
    public void comprarPropiedad(Jugador propietario) {
        //Scanner teclado = new Scanner(System.in);
        //String respuesta = "";
        int resp;
        try {

            if (isEnVenta()) {

                //respuesta = teclado.nextLine();
                resp = JOptionPane.showConfirmDialog(null, "Tienes " + propietario.getMegamonedas() + " megamonedas. Quieres comprar " + getNombreCasilla() + '?' + ". Precio = " + getPrecioCompra(), "Comprar propiedad", JOptionPane.YES_NO_OPTION);
                if (JOptionPane.YES_OPTION == resp) {
                    setPropietario(propietario);
                    super.setPropiedad(true);
                    propietario.setMegamonedas(propietario.getMegamonedas() - getPrecioCompra());
                    if (propietario.getMegamonedas() <= 0) {
                        JOptionPane.showMessageDialog(null, "Tu saldo es insuficiente para comprar la propiedad");
                        throw new Exception();
                    }
                    setEnVenta(false);

                    //System.out.println("Tu saldo resultante es " + propietario.getMegamonedas());
                }
                /*else {
                    System.out.println("Tal vez en otra ocasion");
                    }*/
            } else {
                if (propietario == this.getPropietario()) {
                    //JOptionPane.showMessageDialog(null,"Eres dueño de la propiedad");
                    //System.out.println("Eres dueño de la propiedad");
                    resp = JOptionPane.showConfirmDialog(null, "Eres dueño de la propiedad ¿deseas vender?", "Vender propiedad", JOptionPane.YES_NO_OPTION);
                    //System.out.println("¿Deseas venderla?");
                    //respuesta = teclado.nextLine();
                    if (JOptionPane.YES_OPTION == resp) {
                        venderPropiedad(propietario);
                    } else if (JOptionPane.NO_OPTION == resp) {

                    }
                } else {
                    JOptionPane.showMessageDialog(null, super.getNombreCasilla() + " es propiedad de " + getPropietario().getNombre() + ". Paga a tu oponente");
                    pagarPeaje(propietario);

                }
            }
        } catch (Exception error) {
            System.out.println(error.getMessage());
            propietario.setMegamonedas(propietario.getMegamonedas() + getPrecioCompra());
        }
    }
    /**
     * @deprecated 
     * @param propietario 
     */
    public void compraPropiedad(Jugador propietario) {
        Scanner teclado = new Scanner(System.in);
        String respuesta = "";
        try {

            if (isEnVenta()) {
                System.out.println("Tienes " + propietario.getMegamonedas() + " megamonedas. Quieres comprar " + getNombreCasilla() + '?' + ". Precio = " + getPrecioCompra());
                respuesta = teclado.nextLine();
                if (respuesta.equalsIgnoreCase("si")) {
                    setPropietario(propietario);
                    propietario.setMegamonedas(propietario.getMegamonedas() - getPrecioCompra());
                    if(propietario.getMegamonedas()<= 0){
                        throw new Exception("Tu saldo es insuficiente para comprar la propiedad, intentalo en otra ocasion");
                    }
                    setEnVenta(false);
                    System.out.println("Tu saldo resultante es " + propietario.getMegamonedas());
                } else {
                    System.out.println("Tal vez en otra ocasion");
                }
            } else {
                if (propietario == getPropietario()) {
                    System.out.println("Eres dueño de la propiedad");
                    System.out.println("¿Deseas venderla?");
                    respuesta = teclado.nextLine();
                    if (respuesta.equalsIgnoreCase("si")) {
                        venderPropiedad(propietario);
                    }
                } else {
                    System.out.println(super.getNombreCasilla() + " es propiedad de " + getPropietario().getNombre() + ". Paga a tu oponente");
                    pagarPeaje(propietario);

                }
            }
        } catch (Exception error) {
            System.out.println(error.getMessage());
            propietario.setMegamonedas(propietario.getMegamonedas() + getPrecioCompra());
        }
    }
    /**
     * Vender propiedades
     *
     * @param propietario
     */
    @Override
    public void venderPropiedad(Jugador propietario) {
        propietario.setMegamonedas(propietario.getMegamonedas() + getPrecioVenta());
        setEnVenta(true);
        super.setPropiedad(false);
    }

    /**
     * Resta megamoneds del pagador, que se suman al propietario
     *
     * @param pagador
     */
    public void pagarPeaje(Jugador pagador) {
        pagador.setMegamonedas(pagador.getMegamonedas() - getPeaje());
        this.getPropietario().setMegamonedas(this.getPropietario().getMegamonedas() + getPeaje());
        //System.out.println("Saldo Actual:\n" + pagador.getNombre() + " = " + pagador.getMegamonedas() + " megamonedas " + "\n" + getPropietario().getNombre() + " = " + getPropietario().getMegamonedas() + " megamonedas");
    }
}
