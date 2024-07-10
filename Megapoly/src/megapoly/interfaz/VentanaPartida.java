/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package megapoly.interfaz;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import megapoly.Jugador;
import megapoly.*;
import megapoly.Casillas.Calle;
import megapoly.Casillas.CasillaGen;
import megapoly.Casillas.Parking;

/**
 *
 * @author jjesu
 */
public class VentanaPartida extends javax.swing.JFrame {

    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;
    private Jugador jugador4;
    private int turno;
    private Tablero tableroJuego;
    private CasillaGen[] casillas;
    private ArrayList<Jugador> jugadores;
    private ArrayList<JLabel> posicionesj1;
    private ArrayList<JLabel> posicionesj2;
    private ArrayList<JLabel> posicionesj3;
    private ArrayList<JLabel> posicionesj4;
    private ArrayList<JLabel> propietario;
    private ArrayList<Jugador> prisioneros;
    private int tirada;

    /**
     * Constructor por defecto de nueva partida Creates new form VentanaPartida
     */
    public VentanaPartida() throws HeadlessException {
        initComponents();
        this.jugador1 = null;
        this.jugador2 = null;
        this.jugador3 = null;
        this.jugador4 = null;
        this.turno = 0;
        this.tableroJuego = new Tablero();
        casillas = tableroJuego.getCasillas();
        jugadores = new ArrayList<>();
        posicionesj1 = new ArrayList<>();
        posicionesj2 = new ArrayList<>();
        posicionesj3 = new ArrayList<>();
        posicionesj4 = new ArrayList<>();
        propietario = new ArrayList<>();
        prisioneros = new ArrayList<>();
    }

    /**
     * Constructor para partidas a 2 jugadores
     *
     * @param jugador1
     * @param jugador2
     */
    public VentanaPartida(Jugador jugador1, Jugador jugador2) {
        initComponents();
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        labNombreJugador1.setText(this.jugador1.getNombre());
        labNombreJugador2.setText(this.jugador2.getNombre());
        labj1megamonedas.setText(Integer.toString(this.jugador1.getMegamonedas()));
        labj2megamonedas.setText(Integer.toString(this.jugador2.getMegamonedas()));
        labNombreJugador3.setVisible(false);
        labNombreJugador4.setVisible(false);
        iconoJ3.setVisible(false);
        iconoJ4.setVisible(false);
        this.tableroJuego = new Tablero();
        casillas = tableroJuego.getCasillas();
        turno = 0;
        jugadores = new ArrayList<>();
        posicionesj1 = new ArrayList<>();
        posicionesj2 = new ArrayList<>();
        posicionesj3 = new ArrayList<>();
        posicionesj4 = new ArrayList<>();
        propietario = new ArrayList<>();
        prisioneros = new ArrayList<>();
        jugadores.add(0, jugador1);
        jugadores.add(1, jugador2);

        initCasillas();

    }

    /**
     * Constructor para partidas a 3 jugadores
     *
     * @param jugador1
     * @param jugador2
     * @param jugador3
     */
    public VentanaPartida(Jugador jugador1, Jugador jugador2, Jugador jugador3) {
        initComponents();
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.jugador3 = jugador3;
        labNombreJugador1.setText(this.jugador1.getNombre());
        labNombreJugador2.setText(this.jugador2.getNombre());
        labNombreJugador3.setText(this.jugador3.getNombre());
        labj1megamonedas.setText(Integer.toString(this.jugador1.getMegamonedas()));
        labj2megamonedas.setText(Integer.toString(this.jugador2.getMegamonedas()));
        labj3megamonedas.setText(Integer.toString(this.jugador3.getMegamonedas()));
        labNombreJugador4.setVisible(false);
        iconoJ4.setVisible(false);
        this.tableroJuego = new Tablero();
        casillas = tableroJuego.getCasillas();
        turno = 0;
        jugadores = new ArrayList<>();
        posicionesj1 = new ArrayList<>();
        posicionesj2 = new ArrayList<>();
        posicionesj3 = new ArrayList<>();
        posicionesj4 = new ArrayList<>();
        propietario = new ArrayList<>();
        prisioneros = new ArrayList<>();
        jugadores.add(0, jugador1);
        jugadores.add(1, jugador2);
        jugadores.add(2, jugador3);

        initCasillas();

    }

    /**
     * COnstructor para 4 jugadores
     *
     * @param jugador1
     * @param jugador2
     * @param jugador3
     * @param jugador4
     */
    public VentanaPartida(Jugador jugador1, Jugador jugador2, Jugador jugador3, Jugador jugador4) {
        initComponents();
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.jugador3 = jugador3;
        this.jugador4 = jugador4;
        labNombreJugador1.setText(this.jugador1.getNombre());
        labNombreJugador2.setText(this.jugador2.getNombre());
        labNombreJugador3.setText(this.jugador3.getNombre());
        labNombreJugador4.setText(this.jugador4.getNombre());
        labj1megamonedas.setText(Integer.toString(this.jugador1.getMegamonedas()));
        labj2megamonedas.setText(Integer.toString(this.jugador2.getMegamonedas()));
        labj3megamonedas.setText(Integer.toString(this.jugador3.getMegamonedas()));
        labj4megamonedas.setText(Integer.toString(this.jugador4.getMegamonedas()));
        this.tableroJuego = new Tablero();
        casillas = tableroJuego.getCasillas();
        turno = 0;
        jugadores = new ArrayList<>();
        posicionesj1 = new ArrayList<>();
        posicionesj2 = new ArrayList<>();
        posicionesj3 = new ArrayList<>();
        posicionesj4 = new ArrayList<>();
        propietario = new ArrayList<>();
        prisioneros = new ArrayList<>();
        jugadores.add(0, jugador1);
        jugadores.add(1, jugador2);
        jugadores.add(2, jugador3);
        jugadores.add(3, jugador4);

        initCasillas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        visitaCarcel = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        labCasilla5 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        labp5j1 = new javax.swing.JLabel();
        labp5j2 = new javax.swing.JLabel();
        labp5j4 = new javax.swing.JLabel();
        labp5j3 = new javax.swing.JLabel();
        montoto = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        labCasilla6 = new javax.swing.JLabel();
        labPropietario4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labp6j1 = new javax.swing.JLabel();
        labp6j2 = new javax.swing.JLabel();
        labp6j4 = new javax.swing.JLabel();
        labp6j3 = new javax.swing.JLabel();
        montesierra = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        labCasilla7 = new javax.swing.JLabel();
        labPropietario5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        labp7j1 = new javax.swing.JLabel();
        labp7j2 = new javax.swing.JLabel();
        labp7j4 = new javax.swing.JLabel();
        labp7j3 = new javax.swing.JLabel();
        suerte = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        labCasilla8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        labp8j1 = new javax.swing.JLabel();
        labp8j2 = new javax.swing.JLabel();
        labp8j4 = new javax.swing.JLabel();
        labp8j3 = new javax.swing.JLabel();
        raza = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        labCasilla9 = new javax.swing.JLabel();
        labPropietario6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        labp9j1 = new javax.swing.JLabel();
        labp9j2 = new javax.swing.JLabel();
        labp9j4 = new javax.swing.JLabel();
        labp9j3 = new javax.swing.JLabel();
        parking = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        labCasilla10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        labp10j1 = new javax.swing.JLabel();
        labp10j2 = new javax.swing.JLabel();
        labp10j4 = new javax.swing.JLabel();
        labp10j3 = new javax.swing.JLabel();
        betis = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labCasilla4 = new javax.swing.JLabel();
        labPropietario3 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        labp4j1 = new javax.swing.JLabel();
        labp4j2 = new javax.swing.JLabel();
        labp4j4 = new javax.swing.JLabel();
        labp4j3 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        labIconoTurno = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        labBote = new javax.swing.JLabel();
        labTituloBote = new javax.swing.JLabel();
        calatrava = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        labCasilla11 = new javax.swing.JLabel();
        labPropietario7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        labp11j1 = new javax.swing.JLabel();
        labp11j2 = new javax.swing.JLabel();
        labp11j4 = new javax.swing.JLabel();
        labp11j3 = new javax.swing.JLabel();
        banco = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        labCasilla3 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        labp3j1 = new javax.swing.JLabel();
        labp3j2 = new javax.swing.JLabel();
        labp3j4 = new javax.swing.JLabel();
        labp3j3 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jug1 = new javax.swing.JPanel();
        labNombreJugador1 = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        labposj1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        labj1megamonedas = new javax.swing.JLabel();
        iconoJ1 = new javax.swing.JLabel();
        pancarcelj1 = new javax.swing.JPanel();
        labcarcelj1 = new javax.swing.JLabel();
        jug2 = new javax.swing.JPanel();
        labNombreJugador2 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        labposj2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        labj2megamonedas = new javax.swing.JLabel();
        iconoJ2 = new javax.swing.JLabel();
        pancarcelj2 = new javax.swing.JPanel();
        labcarcelj2 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        trajano = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        labCasilla12 = new javax.swing.JLabel();
        labPropietario8 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        labp12j1 = new javax.swing.JLabel();
        labp12j2 = new javax.swing.JLabel();
        labp12j4 = new javax.swing.JLabel();
        labp12j3 = new javax.swing.JLabel();
        borbolla = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        labCasilla2 = new javax.swing.JLabel();
        labPropietario2 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        labp2j1 = new javax.swing.JLabel();
        labp2j2 = new javax.swing.JLabel();
        labp2j4 = new javax.swing.JLabel();
        labp2j3 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jug3 = new javax.swing.JPanel();
        labNombreJugador3 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        labposj3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        labj3megamonedas = new javax.swing.JLabel();
        iconoJ3 = new javax.swing.JLabel();
        pancarcelj3 = new javax.swing.JPanel();
        labcarcelj3 = new javax.swing.JLabel();
        jug4 = new javax.swing.JPanel();
        labNombreJugador4 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        labposj4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        labj4megamonedas = new javax.swing.JLabel();
        iconoJ4 = new javax.swing.JLabel();
        pancarcelj4 = new javax.swing.JPanel();
        labcarcelj4 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        banco2 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        labCasilla13 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        labp13j1 = new javax.swing.JLabel();
        labp13j2 = new javax.swing.JLabel();
        labp13j4 = new javax.swing.JLabel();
        labp13j3 = new javax.swing.JLabel();
        palmera = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        labCasilla1 = new javax.swing.JLabel();
        labPropietario1 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        labp1j1 = new javax.swing.JLabel();
        labp1j2 = new javax.swing.JLabel();
        labp1j4 = new javax.swing.JLabel();
        labp1j3 = new javax.swing.JLabel();
        PanelDados = new javax.swing.JPanel();
        butDados = new javax.swing.JButton();
        jPanel56 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        labResultado = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        butMovimiento = new javax.swing.JButton();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        constitucion = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        labCasilla14 = new javax.swing.JLabel();
        labPropietario9 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        labp14j1 = new javax.swing.JLabel();
        labp14j2 = new javax.swing.JLabel();
        labp14j4 = new javax.swing.JLabel();
        labp14j3 = new javax.swing.JLabel();
        casillaSalida = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        labCasilla0 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        labp0j1 = new javax.swing.JLabel();
        labp0j2 = new javax.swing.JLabel();
        labp0j4 = new javax.swing.JLabel();
        labp0j3 = new javax.swing.JLabel();
        sierpes = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        labCasilla19 = new javax.swing.JLabel();
        labPropietario12 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        labp19j1 = new javax.swing.JLabel();
        labp19j2 = new javax.swing.JLabel();
        labp19j4 = new javax.swing.JLabel();
        labp19j3 = new javax.swing.JLabel();
        suerte2 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        labCasilla18 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        labp18j1 = new javax.swing.JLabel();
        labp18j2 = new javax.swing.JLabel();
        labp18j4 = new javax.swing.JLabel();
        labp18j3 = new javax.swing.JLabel();
        catolicos = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labCasilla17 = new javax.swing.JLabel();
        labPropietario11 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        labp17j1 = new javax.swing.JLabel();
        labp17j2 = new javax.swing.JLabel();
        labp17j4 = new javax.swing.JLabel();
        labp17j3 = new javax.swing.JLabel();
        tetuan = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        labCasilla16 = new javax.swing.JLabel();
        labPropietario10 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        labp16j1 = new javax.swing.JLabel();
        labp16j2 = new javax.swing.JLabel();
        labp16j4 = new javax.swing.JLabel();
        labp16j3 = new javax.swing.JLabel();
        carcel = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        labCasilla15 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        labp15j1 = new javax.swing.JLabel();
        labp15j2 = new javax.swing.JLabel();
        labp15j4 = new javax.swing.JLabel();
        labp15j3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 0));

        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jPanel8.setLayout(new java.awt.GridLayout(6, 6, 15, 15));

        visitaCarcel.setBackground(new java.awt.Color(0, 102, 255));
        visitaCarcel.setForeground(new java.awt.Color(0, 102, 255));
        visitaCarcel.setPreferredSize(new java.awt.Dimension(100, 100));
        visitaCarcel.setLayout(new java.awt.BorderLayout());

        jPanel30.setBackground(new java.awt.Color(102, 102, 102));
        jPanel30.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla5.setText("CARCEL");
        labCasilla5.setName(""); // NOI18N
        labCasilla5.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel30.add(labCasilla5);

        visitaCarcel.add(jPanel30, java.awt.BorderLayout.PAGE_START);

        jPanel18.setBackground(new java.awt.Color(0, 102, 255));
        jPanel18.setLayout(new java.awt.GridLayout(2, 2));

        labp5j1.setBackground(new java.awt.Color(51, 153, 255));
        labp5j1.setForeground(new java.awt.Color(51, 153, 255));
        labp5j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp5j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp5j1.setToolTipText("");
        labp5j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp5j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel18.add(labp5j1);

        labp5j2.setBackground(new java.awt.Color(51, 153, 255));
        labp5j2.setForeground(new java.awt.Color(51, 153, 255));
        labp5j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp5j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp5j2.setToolTipText("");
        jPanel18.add(labp5j2);

        labp5j4.setBackground(new java.awt.Color(255, 255, 255));
        labp5j4.setForeground(new java.awt.Color(51, 153, 255));
        labp5j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp5j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel18.add(labp5j4);

        labp5j3.setBackground(new java.awt.Color(51, 153, 255));
        labp5j3.setForeground(new java.awt.Color(51, 153, 255));
        labp5j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp5j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp5j3.setToolTipText("");
        jPanel18.add(labp5j3);

        visitaCarcel.add(jPanel18, java.awt.BorderLayout.CENTER);

        jPanel8.add(visitaCarcel);

        montoto.setBackground(new java.awt.Color(204, 204, 255));
        montoto.setPreferredSize(new java.awt.Dimension(100, 100));
        montoto.setLayout(new java.awt.BorderLayout());

        jPanel32.setBackground(new java.awt.Color(255, 102, 0));
        jPanel32.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla6.setText("CALLE 4");
        labCasilla6.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel32.add(labCasilla6);
        jPanel32.add(labPropietario4);

        montoto.add(jPanel32, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new java.awt.GridLayout(2, 2));

        labp6j1.setBackground(new java.awt.Color(51, 153, 255));
        labp6j1.setForeground(new java.awt.Color(51, 153, 255));
        labp6j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp6j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp6j1.setToolTipText("");
        labp6j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp6j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel3.add(labp6j1);

        labp6j2.setBackground(new java.awt.Color(51, 153, 255));
        labp6j2.setForeground(new java.awt.Color(51, 153, 255));
        labp6j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp6j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp6j2.setToolTipText("");
        jPanel3.add(labp6j2);

        labp6j4.setBackground(new java.awt.Color(255, 255, 255));
        labp6j4.setForeground(new java.awt.Color(51, 153, 255));
        labp6j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp6j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel3.add(labp6j4);

        labp6j3.setBackground(new java.awt.Color(51, 153, 255));
        labp6j3.setForeground(new java.awt.Color(51, 153, 255));
        labp6j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp6j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp6j3.setToolTipText("");
        jPanel3.add(labp6j3);

        montoto.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel8.add(montoto);

        montesierra.setBackground(new java.awt.Color(204, 204, 255));
        montesierra.setPreferredSize(new java.awt.Dimension(100, 100));
        montesierra.setLayout(new java.awt.BorderLayout());

        jPanel34.setBackground(new java.awt.Color(255, 102, 0));
        jPanel34.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla7.setText("CALLE 5");
        labCasilla7.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel34.add(labCasilla7);
        jPanel34.add(labPropietario5);

        montesierra.add(jPanel34, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new java.awt.GridLayout(2, 2));

        labp7j1.setBackground(new java.awt.Color(51, 153, 255));
        labp7j1.setForeground(new java.awt.Color(51, 153, 255));
        labp7j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp7j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp7j1.setToolTipText("");
        labp7j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp7j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel5.add(labp7j1);

        labp7j2.setBackground(new java.awt.Color(51, 153, 255));
        labp7j2.setForeground(new java.awt.Color(51, 153, 255));
        labp7j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp7j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp7j2.setToolTipText("");
        jPanel5.add(labp7j2);

        labp7j4.setBackground(new java.awt.Color(255, 255, 255));
        labp7j4.setForeground(new java.awt.Color(51, 153, 255));
        labp7j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp7j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel5.add(labp7j4);

        labp7j3.setBackground(new java.awt.Color(51, 153, 255));
        labp7j3.setForeground(new java.awt.Color(51, 153, 255));
        labp7j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp7j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp7j3.setToolTipText("");
        jPanel5.add(labp7j3);

        montesierra.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel8.add(montesierra);

        suerte.setBackground(new java.awt.Color(204, 153, 255));
        suerte.setPreferredSize(new java.awt.Dimension(100, 100));
        suerte.setLayout(new java.awt.BorderLayout());

        jPanel38.setBackground(new java.awt.Color(102, 102, 102));
        jPanel38.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla8.setText("SUERTE");
        labCasilla8.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel38.add(labCasilla8);

        suerte.add(jPanel38, java.awt.BorderLayout.PAGE_START);

        jPanel7.setBackground(new java.awt.Color(204, 153, 255));
        jPanel7.setLayout(new java.awt.GridLayout(2, 2));

        labp8j1.setBackground(new java.awt.Color(51, 153, 255));
        labp8j1.setForeground(new java.awt.Color(51, 153, 255));
        labp8j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp8j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp8j1.setToolTipText("");
        labp8j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp8j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel7.add(labp8j1);

        labp8j2.setBackground(new java.awt.Color(51, 153, 255));
        labp8j2.setForeground(new java.awt.Color(51, 153, 255));
        labp8j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp8j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp8j2.setToolTipText("");
        jPanel7.add(labp8j2);

        labp8j4.setBackground(new java.awt.Color(255, 255, 255));
        labp8j4.setForeground(new java.awt.Color(51, 153, 255));
        labp8j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp8j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel7.add(labp8j4);

        labp8j3.setBackground(new java.awt.Color(51, 153, 255));
        labp8j3.setForeground(new java.awt.Color(51, 153, 255));
        labp8j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp8j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp8j3.setToolTipText("");
        jPanel7.add(labp8j3);

        suerte.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel8.add(suerte);

        raza.setBackground(new java.awt.Color(204, 204, 255));
        raza.setPreferredSize(new java.awt.Dimension(100, 100));
        raza.setLayout(new java.awt.BorderLayout());

        jPanel35.setBackground(new java.awt.Color(0, 102, 204));
        jPanel35.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla9.setText("CALLE 6");
        labCasilla9.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel35.add(labCasilla9);
        jPanel35.add(labPropietario6);

        raza.add(jPanel35, java.awt.BorderLayout.PAGE_START);

        jPanel10.setBackground(new java.awt.Color(204, 204, 255));
        jPanel10.setLayout(new java.awt.GridLayout(2, 2));

        labp9j1.setBackground(new java.awt.Color(51, 153, 255));
        labp9j1.setForeground(new java.awt.Color(51, 153, 255));
        labp9j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp9j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp9j1.setToolTipText("");
        labp9j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp9j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel10.add(labp9j1);

        labp9j2.setBackground(new java.awt.Color(51, 153, 255));
        labp9j2.setForeground(new java.awt.Color(51, 153, 255));
        labp9j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp9j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp9j2.setToolTipText("");
        jPanel10.add(labp9j2);

        labp9j4.setBackground(new java.awt.Color(255, 255, 255));
        labp9j4.setForeground(new java.awt.Color(51, 153, 255));
        labp9j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp9j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel10.add(labp9j4);

        labp9j3.setBackground(new java.awt.Color(51, 153, 255));
        labp9j3.setForeground(new java.awt.Color(51, 153, 255));
        labp9j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp9j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp9j3.setToolTipText("");
        jPanel10.add(labp9j3);

        raza.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel8.add(raza);

        parking.setBackground(new java.awt.Color(255, 255, 255));
        parking.setPreferredSize(new java.awt.Dimension(100, 100));
        parking.setLayout(new java.awt.BorderLayout());

        jPanel40.setBackground(new java.awt.Color(102, 102, 102));
        jPanel40.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla10.setText("PARKING");
        labCasilla10.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel40.add(labCasilla10);

        parking.add(jPanel40, java.awt.BorderLayout.PAGE_START);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.GridLayout(2, 2));

        labp10j1.setBackground(new java.awt.Color(51, 153, 255));
        labp10j1.setForeground(new java.awt.Color(51, 153, 255));
        labp10j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp10j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp10j1.setToolTipText("");
        labp10j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp10j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel11.add(labp10j1);

        labp10j2.setBackground(new java.awt.Color(51, 153, 255));
        labp10j2.setForeground(new java.awt.Color(51, 153, 255));
        labp10j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp10j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp10j2.setToolTipText("");
        jPanel11.add(labp10j2);

        labp10j4.setBackground(new java.awt.Color(255, 255, 255));
        labp10j4.setForeground(new java.awt.Color(51, 153, 255));
        labp10j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp10j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel11.add(labp10j4);

        labp10j3.setBackground(new java.awt.Color(51, 153, 255));
        labp10j3.setForeground(new java.awt.Color(51, 153, 255));
        labp10j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp10j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp10j3.setToolTipText("");
        jPanel11.add(labp10j3);

        parking.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel8.add(parking);

        betis.setBackground(new java.awt.Color(204, 204, 255));
        betis.setMinimumSize(new java.awt.Dimension(100, 100));
        betis.setName(""); // NOI18N
        betis.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla4.setText("CALLE 3");
        labCasilla4.setName(""); // NOI18N
        labCasilla4.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel1.add(labCasilla4);
        jPanel1.add(labPropietario3);

        betis.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel20.setBackground(new java.awt.Color(204, 204, 255));
        jPanel20.setLayout(new java.awt.GridLayout(2, 2));

        labp4j1.setBackground(new java.awt.Color(51, 153, 255));
        labp4j1.setForeground(new java.awt.Color(51, 153, 255));
        labp4j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp4j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp4j1.setToolTipText("");
        labp4j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp4j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel20.add(labp4j1);

        labp4j2.setBackground(new java.awt.Color(51, 153, 255));
        labp4j2.setForeground(new java.awt.Color(51, 153, 255));
        labp4j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp4j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp4j2.setToolTipText("");
        jPanel20.add(labp4j2);

        labp4j4.setBackground(new java.awt.Color(255, 255, 255));
        labp4j4.setForeground(new java.awt.Color(51, 153, 255));
        labp4j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp4j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel20.add(labp4j4);

        labp4j3.setBackground(new java.awt.Color(51, 153, 255));
        labp4j3.setForeground(new java.awt.Color(51, 153, 255));
        labp4j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp4j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp4j3.setToolTipText("");
        jPanel20.add(labp4j3);

        betis.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel8.add(betis);

        jPanel51.setBackground(new java.awt.Color(153, 153, 153));
        jPanel51.setLayout(new java.awt.BorderLayout());

        labIconoTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel51.add(labIconoTurno, java.awt.BorderLayout.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("TURNO DE:");
        jLabel7.setPreferredSize(new java.awt.Dimension(38, 35));
        jPanel51.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        jPanel8.add(jPanel51);

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel9);

        jPanel27.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel27);

        jPanel28.setBackground(new java.awt.Color(153, 153, 153));
        jPanel28.setLayout(new java.awt.BorderLayout());

        labBote.setBackground(new java.awt.Color(204, 255, 204));
        labBote.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labBote.setForeground(new java.awt.Color(255, 255, 255));
        labBote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel28.add(labBote, java.awt.BorderLayout.CENTER);

        labTituloBote.setBackground(new java.awt.Color(51, 102, 0));
        labTituloBote.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labTituloBote.setForeground(new java.awt.Color(255, 255, 255));
        labTituloBote.setText("BOTE:");
        labTituloBote.setPreferredSize(new java.awt.Dimension(38, 36));
        jPanel28.add(labTituloBote, java.awt.BorderLayout.PAGE_START);

        jPanel8.add(jPanel28);

        calatrava.setBackground(new java.awt.Color(204, 204, 255));
        calatrava.setPreferredSize(new java.awt.Dimension(100, 100));
        calatrava.setLayout(new java.awt.BorderLayout());

        jPanel36.setBackground(new java.awt.Color(0, 153, 153));
        jPanel36.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla11.setText("CALLE 7");
        labCasilla11.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel36.add(labCasilla11);
        jPanel36.add(labPropietario7);

        calatrava.add(jPanel36, java.awt.BorderLayout.PAGE_START);

        jPanel12.setBackground(new java.awt.Color(204, 204, 255));
        jPanel12.setLayout(new java.awt.GridLayout(2, 2));

        labp11j1.setBackground(new java.awt.Color(51, 153, 255));
        labp11j1.setForeground(new java.awt.Color(51, 153, 255));
        labp11j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp11j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp11j1.setToolTipText("");
        labp11j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp11j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel12.add(labp11j1);

        labp11j2.setBackground(new java.awt.Color(51, 153, 255));
        labp11j2.setForeground(new java.awt.Color(51, 153, 255));
        labp11j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp11j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp11j2.setToolTipText("");
        jPanel12.add(labp11j2);

        labp11j4.setBackground(new java.awt.Color(255, 255, 255));
        labp11j4.setForeground(new java.awt.Color(51, 153, 255));
        labp11j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp11j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel12.add(labp11j4);

        labp11j3.setBackground(new java.awt.Color(51, 153, 255));
        labp11j3.setForeground(new java.awt.Color(51, 153, 255));
        labp11j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp11j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp11j3.setToolTipText("");
        jPanel12.add(labp11j3);

        calatrava.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel8.add(calatrava);

        banco.setBackground(new java.awt.Color(255, 255, 204));
        banco.setPreferredSize(new java.awt.Dimension(100, 100));
        banco.setLayout(new java.awt.BorderLayout());

        jPanel29.setBackground(new java.awt.Color(102, 102, 102));
        jPanel29.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla3.setText("BANCO");
        labCasilla3.setToolTipText("");
        labCasilla3.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel29.add(labCasilla3);

        banco.add(jPanel29, java.awt.BorderLayout.PAGE_START);

        jPanel21.setBackground(new java.awt.Color(255, 255, 204));
        jPanel21.setLayout(new java.awt.GridLayout(2, 2));

        labp3j1.setBackground(new java.awt.Color(51, 153, 255));
        labp3j1.setForeground(new java.awt.Color(51, 153, 255));
        labp3j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp3j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp3j1.setToolTipText("");
        labp3j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp3j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel21.add(labp3j1);

        labp3j2.setBackground(new java.awt.Color(51, 153, 255));
        labp3j2.setForeground(new java.awt.Color(51, 153, 255));
        labp3j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp3j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp3j2.setToolTipText("");
        jPanel21.add(labp3j2);

        labp3j4.setBackground(new java.awt.Color(255, 255, 255));
        labp3j4.setForeground(new java.awt.Color(51, 153, 255));
        labp3j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp3j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel21.add(labp3j4);

        labp3j3.setBackground(new java.awt.Color(51, 153, 255));
        labp3j3.setForeground(new java.awt.Color(51, 153, 255));
        labp3j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp3j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp3j3.setToolTipText("");
        jPanel21.add(labp3j3);

        banco.add(jPanel21, java.awt.BorderLayout.CENTER);

        jPanel8.add(banco);

        jPanel49.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel49);

        jug1.setBackground(new java.awt.Color(0, 102, 0));
        jug1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jug1.setLayout(new java.awt.GridLayout(3, 2));

        labNombreJugador1.setBackground(new java.awt.Color(0, 0, 0));
        labNombreJugador1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labNombreJugador1.setForeground(new java.awt.Color(255, 255, 255));
        labNombreJugador1.setText("NombreJ1");
        jug1.add(labNombreJugador1);

        jPanel59.setBackground(new java.awt.Color(204, 204, 204));
        jPanel59.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel59.setLayout(new java.awt.BorderLayout());

        labposj1.setBackground(new java.awt.Color(255, 255, 255));
        labposj1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labposj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel59.add(labposj1, java.awt.BorderLayout.CENTER);

        jug1.add(jPanel59);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Megamonedas:");
        jug1.add(jLabel1);

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));
        jPanel58.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel58.setLayout(new java.awt.BorderLayout());

        labj1megamonedas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labj1megamonedas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labj1megamonedas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel58.add(labj1megamonedas, java.awt.BorderLayout.CENTER);

        jug1.add(jPanel58);

        iconoJ1.setBackground(new java.awt.Color(51, 153, 255));
        iconoJ1.setForeground(new java.awt.Color(51, 153, 255));
        iconoJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoJ1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        iconoJ1.setToolTipText("");
        iconoJ1.setMaximumSize(new java.awt.Dimension(25, 29));
        iconoJ1.setPreferredSize(new java.awt.Dimension(25, 28));
        jug1.add(iconoJ1);

        pancarcelj1.setBackground(new java.awt.Color(204, 204, 204));
        pancarcelj1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pancarcelj1.setLayout(new java.awt.BorderLayout());

        labcarcelj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labcarcelj1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/prisionero.png"))); // NOI18N
        labcarcelj1.setMinimumSize(new java.awt.Dimension(46, 20));
        pancarcelj1.add(labcarcelj1, java.awt.BorderLayout.CENTER);

        jug1.add(pancarcelj1);

        jPanel8.add(jug1);

        jug2.setBackground(new java.awt.Color(0, 102, 0));
        jug2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jug2.setLayout(new java.awt.GridLayout(3, 2));

        labNombreJugador2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labNombreJugador2.setForeground(new java.awt.Color(255, 255, 255));
        labNombreJugador2.setText("NombreJ2");
        jug2.add(labNombreJugador2);

        jPanel61.setBackground(new java.awt.Color(204, 204, 204));
        jPanel61.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel61.setLayout(new java.awt.BorderLayout());

        labposj2.setBackground(new java.awt.Color(255, 255, 255));
        labposj2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labposj2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel61.add(labposj2, java.awt.BorderLayout.CENTER);

        jug2.add(jPanel61);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Megamonedas:");
        jug2.add(jLabel2);

        jPanel60.setBackground(new java.awt.Color(255, 255, 255));
        jPanel60.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel60.setLayout(new java.awt.BorderLayout());

        labj2megamonedas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labj2megamonedas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel60.add(labj2megamonedas, java.awt.BorderLayout.CENTER);

        jug2.add(jPanel60);

        iconoJ2.setBackground(new java.awt.Color(51, 153, 255));
        iconoJ2.setForeground(new java.awt.Color(51, 153, 255));
        iconoJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoJ2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        iconoJ2.setToolTipText("");
        jug2.add(iconoJ2);

        pancarcelj2.setBackground(new java.awt.Color(204, 204, 204));
        pancarcelj2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pancarcelj2.setLayout(new java.awt.BorderLayout());

        labcarcelj2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labcarcelj2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/prisionero.png"))); // NOI18N
        labcarcelj2.setMinimumSize(new java.awt.Dimension(46, 20));
        pancarcelj2.add(labcarcelj2, java.awt.BorderLayout.CENTER);

        jug2.add(pancarcelj2);

        jPanel8.add(jug2);

        jPanel45.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel45);

        trajano.setBackground(new java.awt.Color(204, 204, 255));
        trajano.setPreferredSize(new java.awt.Dimension(100, 100));
        trajano.setLayout(new java.awt.BorderLayout());

        jPanel39.setBackground(new java.awt.Color(0, 153, 153));
        jPanel39.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla12.setText("CALLE 8");
        labCasilla12.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel39.add(labCasilla12);
        jPanel39.add(labPropietario8);

        trajano.add(jPanel39, java.awt.BorderLayout.PAGE_START);

        jPanel14.setBackground(new java.awt.Color(204, 204, 255));
        jPanel14.setLayout(new java.awt.GridLayout(2, 2));

        labp12j1.setBackground(new java.awt.Color(51, 153, 255));
        labp12j1.setForeground(new java.awt.Color(51, 153, 255));
        labp12j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp12j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp12j1.setToolTipText("");
        labp12j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp12j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel14.add(labp12j1);

        labp12j2.setBackground(new java.awt.Color(51, 153, 255));
        labp12j2.setForeground(new java.awt.Color(51, 153, 255));
        labp12j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp12j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp12j2.setToolTipText("");
        jPanel14.add(labp12j2);

        labp12j4.setBackground(new java.awt.Color(255, 255, 255));
        labp12j4.setForeground(new java.awt.Color(51, 153, 255));
        labp12j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp12j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel14.add(labp12j4);

        labp12j3.setBackground(new java.awt.Color(51, 153, 255));
        labp12j3.setForeground(new java.awt.Color(51, 153, 255));
        labp12j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp12j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp12j3.setToolTipText("");
        jPanel14.add(labp12j3);

        trajano.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel8.add(trajano);

        borbolla.setBackground(new java.awt.Color(204, 204, 255));
        borbolla.setPreferredSize(new java.awt.Dimension(100, 100));
        borbolla.setLayout(new java.awt.BorderLayout());

        jPanel33.setBackground(new java.awt.Color(102, 153, 0));
        jPanel33.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla2.setText("CALLE 2");
        labCasilla2.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel33.add(labCasilla2);
        jPanel33.add(labPropietario2);

        borbolla.add(jPanel33, java.awt.BorderLayout.PAGE_START);

        jPanel22.setBackground(new java.awt.Color(204, 204, 255));
        jPanel22.setLayout(new java.awt.GridLayout(2, 2));

        labp2j1.setBackground(new java.awt.Color(51, 153, 255));
        labp2j1.setForeground(new java.awt.Color(51, 153, 255));
        labp2j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp2j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp2j1.setToolTipText("");
        labp2j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp2j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel22.add(labp2j1);

        labp2j2.setBackground(new java.awt.Color(51, 153, 255));
        labp2j2.setForeground(new java.awt.Color(51, 153, 255));
        labp2j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp2j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp2j2.setToolTipText("");
        jPanel22.add(labp2j2);

        labp2j4.setBackground(new java.awt.Color(255, 255, 255));
        labp2j4.setForeground(new java.awt.Color(51, 153, 255));
        labp2j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp2j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        labp2j4.setLabelFor(iconoJ4);
        jPanel22.add(labp2j4);

        labp2j3.setBackground(new java.awt.Color(51, 153, 255));
        labp2j3.setForeground(new java.awt.Color(51, 153, 255));
        labp2j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp2j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp2j3.setToolTipText("");
        jPanel22.add(labp2j3);

        borbolla.add(jPanel22, java.awt.BorderLayout.CENTER);

        jPanel8.add(borbolla);

        jPanel46.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel46);

        jug3.setBackground(new java.awt.Color(0, 102, 0));
        jug3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jug3.setLayout(new java.awt.GridLayout(3, 2));

        labNombreJugador3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labNombreJugador3.setForeground(new java.awt.Color(255, 255, 255));
        labNombreJugador3.setText("NombreJ3");
        jug3.add(labNombreJugador3);

        jPanel55.setBackground(new java.awt.Color(204, 204, 204));
        jPanel55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel55.setLayout(new java.awt.BorderLayout());

        labposj3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labposj3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel55.add(labposj3, java.awt.BorderLayout.CENTER);

        jug3.add(jPanel55);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Megamonedas:");
        jug3.add(jLabel3);

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel48.setLayout(new java.awt.BorderLayout());

        labj3megamonedas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labj3megamonedas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel48.add(labj3megamonedas, java.awt.BorderLayout.CENTER);

        jug3.add(jPanel48);

        iconoJ3.setBackground(new java.awt.Color(51, 153, 255));
        iconoJ3.setForeground(new java.awt.Color(51, 153, 255));
        iconoJ3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoJ3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        iconoJ3.setToolTipText("");
        jug3.add(iconoJ3);

        pancarcelj3.setBackground(new java.awt.Color(204, 204, 204));
        pancarcelj3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pancarcelj3.setLayout(new java.awt.BorderLayout());

        labcarcelj3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labcarcelj3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/prisionero.png"))); // NOI18N
        labcarcelj3.setMinimumSize(new java.awt.Dimension(46, 20));
        pancarcelj3.add(labcarcelj3, java.awt.BorderLayout.CENTER);

        jug3.add(pancarcelj3);

        jPanel8.add(jug3);

        jug4.setBackground(new java.awt.Color(0, 102, 0));
        jug4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jug4.setLayout(new java.awt.GridLayout(3, 2));

        labNombreJugador4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labNombreJugador4.setForeground(new java.awt.Color(255, 255, 255));
        labNombreJugador4.setText("NombreJ4");
        jug4.add(labNombreJugador4);

        jPanel62.setBackground(new java.awt.Color(204, 204, 204));
        jPanel62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel62.setLayout(new java.awt.BorderLayout());

        labposj4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labposj4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel62.add(labposj4, java.awt.BorderLayout.CENTER);

        jug4.add(jPanel62);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Megamonedas:");
        jug4.add(jLabel4);

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel63.setLayout(new java.awt.BorderLayout());

        labj4megamonedas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labj4megamonedas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel63.add(labj4megamonedas, java.awt.BorderLayout.CENTER);

        jug4.add(jPanel63);

        iconoJ4.setBackground(new java.awt.Color(255, 255, 255));
        iconoJ4.setForeground(new java.awt.Color(51, 153, 255));
        iconoJ4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoJ4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jug4.add(iconoJ4);

        pancarcelj4.setBackground(new java.awt.Color(204, 204, 204));
        pancarcelj4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pancarcelj4.setLayout(new java.awt.BorderLayout());

        labcarcelj4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labcarcelj4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/prisionero.png"))); // NOI18N
        labcarcelj4.setMinimumSize(new java.awt.Dimension(46, 20));
        pancarcelj4.add(labcarcelj4, java.awt.BorderLayout.CENTER);

        jug4.add(pancarcelj4);

        jPanel8.add(jug4);

        jPanel50.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel50);

        banco2.setBackground(new java.awt.Color(255, 255, 204));
        banco2.setPreferredSize(new java.awt.Dimension(100, 100));
        banco2.setLayout(new java.awt.BorderLayout());

        jPanel41.setBackground(new java.awt.Color(102, 102, 102));
        jPanel41.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla13.setText("BANCO");
        labCasilla13.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel41.add(labCasilla13);

        banco2.add(jPanel41, java.awt.BorderLayout.PAGE_START);

        jPanel15.setBackground(new java.awt.Color(255, 255, 204));
        jPanel15.setLayout(new java.awt.GridLayout(2, 2));

        labp13j1.setBackground(new java.awt.Color(51, 153, 255));
        labp13j1.setForeground(new java.awt.Color(51, 153, 255));
        labp13j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp13j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp13j1.setToolTipText("");
        labp13j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp13j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel15.add(labp13j1);

        labp13j2.setBackground(new java.awt.Color(51, 153, 255));
        labp13j2.setForeground(new java.awt.Color(51, 153, 255));
        labp13j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp13j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp13j2.setToolTipText("");
        jPanel15.add(labp13j2);

        labp13j4.setBackground(new java.awt.Color(255, 255, 255));
        labp13j4.setForeground(new java.awt.Color(51, 153, 255));
        labp13j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp13j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel15.add(labp13j4);

        labp13j3.setBackground(new java.awt.Color(51, 153, 255));
        labp13j3.setForeground(new java.awt.Color(51, 153, 255));
        labp13j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp13j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp13j3.setToolTipText("");
        jPanel15.add(labp13j3);

        banco2.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel8.add(banco2);

        palmera.setBackground(new java.awt.Color(204, 204, 255));
        palmera.setPreferredSize(new java.awt.Dimension(100, 100));
        palmera.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(102, 153, 0));
        jPanel13.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla1.setText("CALLE 1");
        labCasilla1.setName(""); // NOI18N
        labCasilla1.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel13.add(labCasilla1);
        jPanel13.add(labPropietario1);

        palmera.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel23.setBackground(new java.awt.Color(204, 204, 255));
        jPanel23.setLayout(new java.awt.GridLayout(2, 2));

        labp1j1.setBackground(new java.awt.Color(51, 153, 255));
        labp1j1.setForeground(new java.awt.Color(51, 153, 255));
        labp1j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp1j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp1j1.setToolTipText("");
        labp1j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp1j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel23.add(labp1j1);

        labp1j2.setBackground(new java.awt.Color(51, 153, 255));
        labp1j2.setForeground(new java.awt.Color(51, 153, 255));
        labp1j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp1j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp1j2.setToolTipText("");
        jPanel23.add(labp1j2);

        labp1j4.setBackground(new java.awt.Color(255, 255, 255));
        labp1j4.setForeground(new java.awt.Color(51, 153, 255));
        labp1j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp1j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        labp1j4.setLabelFor(iconoJ4);
        jPanel23.add(labp1j4);

        labp1j3.setBackground(new java.awt.Color(51, 153, 255));
        labp1j3.setForeground(new java.awt.Color(51, 153, 255));
        labp1j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp1j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp1j3.setToolTipText("");
        jPanel23.add(labp1j3);

        palmera.add(jPanel23, java.awt.BorderLayout.CENTER);

        jPanel8.add(palmera);

        PanelDados.setBackground(new java.awt.Color(153, 153, 153));
        PanelDados.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        PanelDados.setLayout(new java.awt.BorderLayout());

        butDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/dados.png"))); // NOI18N
        butDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butDados.setMinimumSize(new java.awt.Dimension(70, 50));
        butDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDadosActionPerformed(evt);
            }
        });
        PanelDados.add(butDados, java.awt.BorderLayout.PAGE_START);

        jPanel56.setMinimumSize(new java.awt.Dimension(71, 35));
        jPanel56.setLayout(new java.awt.GridLayout(1, 2));

        jLabel5.setText("Resultado:     ");
        jLabel5.setMinimumSize(new java.awt.Dimension(71, 35));
        jLabel5.setPreferredSize(new java.awt.Dimension(71, 25));
        jPanel56.add(jLabel5);

        labResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel56.add(labResultado);

        PanelDados.add(jPanel56, java.awt.BorderLayout.CENTER);

        jPanel8.add(PanelDados);

        jPanel52.setBackground(new java.awt.Color(153, 153, 153));
        jPanel52.setLayout(new java.awt.BorderLayout());

        butMovimiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        butMovimiento.setText("Mover Ficha");
        butMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butMovimientoActionPerformed(evt);
            }
        });
        jPanel52.add(butMovimiento, java.awt.BorderLayout.CENTER);

        jPanel8.add(jPanel52);

        jPanel53.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel53);

        jPanel54.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 178, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );

        jPanel8.add(jPanel54);

        constitucion.setBackground(new java.awt.Color(204, 204, 255));
        constitucion.setPreferredSize(new java.awt.Dimension(100, 100));
        constitucion.setLayout(new java.awt.BorderLayout());

        jPanel37.setBackground(new java.awt.Color(255, 255, 0));
        jPanel37.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla14.setText("CALLE 9");
        labCasilla14.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel37.add(labCasilla14);
        jPanel37.add(labPropietario9);

        constitucion.add(jPanel37, java.awt.BorderLayout.PAGE_START);

        jPanel16.setBackground(new java.awt.Color(204, 204, 255));
        jPanel16.setLayout(new java.awt.GridLayout(2, 2));

        labp14j1.setBackground(new java.awt.Color(51, 153, 255));
        labp14j1.setForeground(new java.awt.Color(51, 153, 255));
        labp14j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp14j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp14j1.setToolTipText("");
        labp14j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp14j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel16.add(labp14j1);

        labp14j2.setBackground(new java.awt.Color(51, 153, 255));
        labp14j2.setForeground(new java.awt.Color(51, 153, 255));
        labp14j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp14j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp14j2.setToolTipText("");
        jPanel16.add(labp14j2);

        labp14j4.setBackground(new java.awt.Color(255, 255, 255));
        labp14j4.setForeground(new java.awt.Color(51, 153, 255));
        labp14j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp14j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel16.add(labp14j4);

        labp14j3.setBackground(new java.awt.Color(51, 153, 255));
        labp14j3.setForeground(new java.awt.Color(51, 153, 255));
        labp14j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp14j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp14j3.setToolTipText("");
        jPanel16.add(labp14j3);

        constitucion.add(jPanel16, java.awt.BorderLayout.CENTER);

        jPanel8.add(constitucion);

        casillaSalida.setBackground(new java.awt.Color(51, 51, 51));
        casillaSalida.setPreferredSize(new java.awt.Dimension(100, 100));
        casillaSalida.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla0.setBackground(new java.awt.Color(0, 0, 0));
        labCasilla0.setForeground(new java.awt.Color(255, 255, 255));
        labCasilla0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla0.setText("SALIDA");
        labCasilla0.setMinimumSize(new java.awt.Dimension(40, 26));
        labCasilla0.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel6.add(labCasilla0);

        casillaSalida.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jPanel19.setBackground(new java.awt.Color(51, 51, 51));
        jPanel19.setLayout(new java.awt.GridLayout(2, 2));

        labp0j1.setBackground(new java.awt.Color(51, 153, 255));
        labp0j1.setForeground(new java.awt.Color(51, 153, 255));
        labp0j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp0j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp0j1.setToolTipText("");
        labp0j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp0j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel19.add(labp0j1);

        labp0j2.setBackground(new java.awt.Color(51, 153, 255));
        labp0j2.setForeground(new java.awt.Color(51, 153, 255));
        labp0j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp0j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp0j2.setToolTipText("");
        jPanel19.add(labp0j2);

        labp0j4.setBackground(new java.awt.Color(255, 255, 255));
        labp0j4.setForeground(new java.awt.Color(51, 153, 255));
        labp0j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp0j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel19.add(labp0j4);

        labp0j3.setBackground(new java.awt.Color(51, 153, 255));
        labp0j3.setForeground(new java.awt.Color(51, 153, 255));
        labp0j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp0j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp0j3.setToolTipText("");
        jPanel19.add(labp0j3);

        casillaSalida.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel8.add(casillaSalida);

        sierpes.setBackground(new java.awt.Color(204, 204, 255));
        sierpes.setPreferredSize(new java.awt.Dimension(100, 100));
        sierpes.setLayout(new java.awt.BorderLayout());

        jPanel47.setBackground(new java.awt.Color(0, 0, 153));
        jPanel47.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla19.setForeground(new java.awt.Color(255, 255, 255));
        labCasilla19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla19.setText("CALLE 12");
        labCasilla19.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel47.add(labCasilla19);
        jPanel47.add(labPropietario12);

        sierpes.add(jPanel47, java.awt.BorderLayout.PAGE_START);

        jPanel24.setBackground(new java.awt.Color(204, 204, 255));
        jPanel24.setLayout(new java.awt.GridLayout(2, 2));

        labp19j1.setBackground(new java.awt.Color(51, 153, 255));
        labp19j1.setForeground(new java.awt.Color(51, 153, 255));
        labp19j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp19j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp19j1.setToolTipText("");
        labp19j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp19j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel24.add(labp19j1);

        labp19j2.setBackground(new java.awt.Color(51, 153, 255));
        labp19j2.setForeground(new java.awt.Color(51, 153, 255));
        labp19j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp19j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp19j2.setToolTipText("");
        jPanel24.add(labp19j2);

        labp19j4.setBackground(new java.awt.Color(255, 255, 255));
        labp19j4.setForeground(new java.awt.Color(51, 153, 255));
        labp19j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp19j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel24.add(labp19j4);

        labp19j3.setBackground(new java.awt.Color(51, 153, 255));
        labp19j3.setForeground(new java.awt.Color(51, 153, 255));
        labp19j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp19j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp19j3.setToolTipText("");
        jPanel24.add(labp19j3);

        sierpes.add(jPanel24, java.awt.BorderLayout.CENTER);

        jPanel8.add(sierpes);

        suerte2.setBackground(new java.awt.Color(204, 153, 255));
        suerte2.setPreferredSize(new java.awt.Dimension(100, 100));
        suerte2.setLayout(new java.awt.BorderLayout());

        jPanel44.setBackground(new java.awt.Color(102, 102, 102));
        jPanel44.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla18.setText("SUERTE");
        labCasilla18.setName(""); // NOI18N
        labCasilla18.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel44.add(labCasilla18);

        suerte2.add(jPanel44, java.awt.BorderLayout.PAGE_START);

        jPanel25.setBackground(new java.awt.Color(204, 153, 255));
        jPanel25.setLayout(new java.awt.GridLayout(2, 2));

        labp18j1.setBackground(new java.awt.Color(51, 153, 255));
        labp18j1.setForeground(new java.awt.Color(51, 153, 255));
        labp18j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp18j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp18j1.setToolTipText("");
        labp18j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp18j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel25.add(labp18j1);

        labp18j2.setBackground(new java.awt.Color(51, 153, 255));
        labp18j2.setForeground(new java.awt.Color(51, 153, 255));
        labp18j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp18j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp18j2.setToolTipText("");
        jPanel25.add(labp18j2);

        labp18j4.setBackground(new java.awt.Color(255, 255, 255));
        labp18j4.setForeground(new java.awt.Color(51, 153, 255));
        labp18j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp18j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel25.add(labp18j4);

        labp18j3.setBackground(new java.awt.Color(51, 153, 255));
        labp18j3.setForeground(new java.awt.Color(51, 153, 255));
        labp18j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp18j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp18j3.setToolTipText("");
        jPanel25.add(labp18j3);

        suerte2.add(jPanel25, java.awt.BorderLayout.CENTER);

        jPanel8.add(suerte2);

        catolicos.setBackground(new java.awt.Color(204, 204, 255));
        catolicos.setPreferredSize(new java.awt.Dimension(100, 100));
        catolicos.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 102));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla17.setText("CALLE 11");
        labCasilla17.setName(""); // NOI18N
        labCasilla17.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel2.add(labCasilla17);
        jPanel2.add(labPropietario11);

        catolicos.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel26.setBackground(new java.awt.Color(204, 204, 255));
        jPanel26.setLayout(new java.awt.GridLayout(2, 2));

        labp17j1.setBackground(new java.awt.Color(51, 153, 255));
        labp17j1.setForeground(new java.awt.Color(51, 153, 255));
        labp17j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp17j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp17j1.setToolTipText("");
        labp17j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp17j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel26.add(labp17j1);

        labp17j2.setBackground(new java.awt.Color(51, 153, 255));
        labp17j2.setForeground(new java.awt.Color(51, 153, 255));
        labp17j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp17j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp17j2.setToolTipText("");
        jPanel26.add(labp17j2);

        labp17j4.setBackground(new java.awt.Color(255, 255, 255));
        labp17j4.setForeground(new java.awt.Color(51, 153, 255));
        labp17j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp17j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel26.add(labp17j4);

        labp17j3.setBackground(new java.awt.Color(51, 153, 255));
        labp17j3.setForeground(new java.awt.Color(51, 153, 255));
        labp17j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp17j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp17j3.setToolTipText("");
        jPanel26.add(labp17j3);

        catolicos.add(jPanel26, java.awt.BorderLayout.CENTER);

        jPanel8.add(catolicos);

        tetuan.setBackground(new java.awt.Color(204, 204, 255));
        tetuan.setPreferredSize(new java.awt.Dimension(100, 100));
        tetuan.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 51, 102));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla16.setText("CALLE 10");
        labCasilla16.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel4.add(labCasilla16);
        jPanel4.add(labPropietario10);

        tetuan.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel31.setBackground(new java.awt.Color(204, 204, 255));
        jPanel31.setLayout(new java.awt.GridLayout(2, 2));

        labp16j1.setBackground(new java.awt.Color(51, 153, 255));
        labp16j1.setForeground(new java.awt.Color(51, 153, 255));
        labp16j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp16j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp16j1.setToolTipText("");
        labp16j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp16j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel31.add(labp16j1);

        labp16j2.setBackground(new java.awt.Color(51, 153, 255));
        labp16j2.setForeground(new java.awt.Color(51, 153, 255));
        labp16j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp16j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp16j2.setToolTipText("");
        jPanel31.add(labp16j2);

        labp16j4.setBackground(new java.awt.Color(255, 255, 255));
        labp16j4.setForeground(new java.awt.Color(51, 153, 255));
        labp16j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp16j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel31.add(labp16j4);

        labp16j3.setBackground(new java.awt.Color(51, 153, 255));
        labp16j3.setForeground(new java.awt.Color(51, 153, 255));
        labp16j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp16j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp16j3.setToolTipText("");
        jPanel31.add(labp16j3);

        tetuan.add(jPanel31, java.awt.BorderLayout.CENTER);

        jPanel8.add(tetuan);

        carcel.setBackground(new java.awt.Color(153, 204, 255));
        carcel.setPreferredSize(new java.awt.Dimension(100, 100));
        carcel.setLayout(new java.awt.BorderLayout());

        jPanel42.setBackground(new java.awt.Color(102, 102, 102));
        jPanel42.setLayout(new java.awt.GridLayout(1, 0));

        labCasilla15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCasilla15.setText("IR A LA CARCEL");
        labCasilla15.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel42.add(labCasilla15);

        carcel.add(jPanel42, java.awt.BorderLayout.PAGE_START);

        jPanel17.setBackground(new java.awt.Color(153, 204, 255));
        jPanel17.setLayout(new java.awt.GridLayout(2, 2));

        labp15j1.setBackground(new java.awt.Color(51, 153, 255));
        labp15j1.setForeground(new java.awt.Color(51, 153, 255));
        labp15j1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp15j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/corazon2.png"))); // NOI18N
        labp15j1.setToolTipText("");
        labp15j1.setMaximumSize(new java.awt.Dimension(25, 29));
        labp15j1.setPreferredSize(new java.awt.Dimension(25, 28));
        jPanel17.add(labp15j1);

        labp15j2.setBackground(new java.awt.Color(51, 153, 255));
        labp15j2.setForeground(new java.awt.Color(51, 153, 255));
        labp15j2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp15j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/picas2.png"))); // NOI18N
        labp15j2.setToolTipText("");
        jPanel17.add(labp15j2);

        labp15j4.setBackground(new java.awt.Color(255, 255, 255));
        labp15j4.setForeground(new java.awt.Color(51, 153, 255));
        labp15j4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp15j4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/diamante2.png"))); // NOI18N
        jPanel17.add(labp15j4);

        labp15j3.setBackground(new java.awt.Color(51, 153, 255));
        labp15j3.setForeground(new java.awt.Color(51, 153, 255));
        labp15j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labp15j3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/megapoly/imagenes/trebol2.png"))); // NOI18N
        labp15j3.setToolTipText("");
        jPanel17.add(labp15j3);

        carcel.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel8.add(carcel);

        getContentPane().add(jPanel8, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodo para dar nombre a las casillas y gestionar los iconos de jugador
     * al inicio
     */
    private void initCasillas() {
        // arrays para mover el icono de jugador por el tablero
        posicionesj1.add(0, labp0j1);
        posicionesj1.add(1, labp1j1);
        posicionesj1.add(2, labp2j1);
        posicionesj1.add(3, labp3j1);
        posicionesj1.add(4, labp4j1);
        posicionesj1.add(5, labp5j1);
        posicionesj1.add(6, labp6j1);
        posicionesj1.add(7, labp7j1);
        posicionesj1.add(8, labp8j1);
        posicionesj1.add(9, labp9j1);
        posicionesj1.add(10, labp10j1);
        posicionesj1.add(11, labp11j1);
        posicionesj1.add(12, labp12j1);
        posicionesj1.add(13, labp13j1);
        posicionesj1.add(14, labp14j1);
        posicionesj1.add(15, labp15j1);
        posicionesj1.add(16, labp16j1);
        posicionesj1.add(17, labp17j1);
        posicionesj1.add(18, labp18j1);
        posicionesj1.add(19, labp19j1);
        for (JLabel pos : posicionesj1) {
            pos.setVisible(false);
        }

        posicionesj2.add(0, labp0j2);
        posicionesj2.add(1, labp1j2);
        posicionesj2.add(2, labp2j2);
        posicionesj2.add(3, labp3j2);
        posicionesj2.add(4, labp4j2);
        posicionesj2.add(5, labp5j2);
        posicionesj2.add(6, labp6j2);
        posicionesj2.add(7, labp7j2);
        posicionesj2.add(8, labp8j2);
        posicionesj2.add(9, labp9j2);
        posicionesj2.add(10, labp10j2);
        posicionesj2.add(11, labp11j2);
        posicionesj2.add(12, labp12j2);
        posicionesj2.add(13, labp13j2);
        posicionesj2.add(14, labp14j2);
        posicionesj2.add(15, labp15j2);
        posicionesj2.add(16, labp16j2);
        posicionesj2.add(17, labp17j2);
        posicionesj2.add(18, labp18j2);
        posicionesj2.add(19, labp19j2);
        for (JLabel pos : posicionesj2) {
            pos.setVisible(false);
        }

        posicionesj3.add(0, labp0j3);
        posicionesj3.add(1, labp1j3);
        posicionesj3.add(2, labp2j3);
        posicionesj3.add(3, labp3j3);
        posicionesj3.add(4, labp4j3);
        posicionesj3.add(5, labp5j3);
        posicionesj3.add(6, labp6j3);
        posicionesj3.add(7, labp7j3);
        posicionesj3.add(8, labp8j3);
        posicionesj3.add(9, labp9j3);
        posicionesj3.add(10, labp10j3);
        posicionesj3.add(11, labp11j3);
        posicionesj3.add(12, labp12j3);
        posicionesj3.add(13, labp13j3);
        posicionesj3.add(14, labp14j3);
        posicionesj3.add(15, labp15j3);
        posicionesj3.add(16, labp16j3);
        posicionesj3.add(17, labp17j3);
        posicionesj3.add(18, labp18j3);
        posicionesj3.add(19, labp19j3);
        for (JLabel pos : posicionesj3) {
            pos.setVisible(false);
        }

        posicionesj4.add(0, labp0j4);
        posicionesj4.add(1, labp1j4);
        posicionesj4.add(2, labp2j4);
        posicionesj4.add(3, labp3j4);
        posicionesj4.add(4, labp4j4);
        posicionesj4.add(5, labp5j4);
        posicionesj4.add(6, labp6j4);
        posicionesj4.add(7, labp7j4);
        posicionesj4.add(8, labp8j4);
        posicionesj4.add(9, labp9j4);
        posicionesj4.add(10, labp10j4);
        posicionesj4.add(11, labp11j4);
        posicionesj4.add(12, labp12j4);
        posicionesj4.add(13, labp13j4);
        posicionesj4.add(14, labp14j4);
        posicionesj4.add(15, labp15j4);
        posicionesj4.add(16, labp16j4);
        posicionesj4.add(17, labp17j4);
        posicionesj4.add(18, labp18j4);
        posicionesj4.add(19, labp19j4);
        for (JLabel pos : posicionesj4) {
            pos.setVisible(false);
        }
        //Titulos de las casillas
        labCasilla0.setText(casillas[0].getNombreCasilla());
        labCasilla1.setText(casillas[1].getNombreCasilla());
        labCasilla2.setText(casillas[2].getNombreCasilla());
        labCasilla3.setText(casillas[3].getNombreCasilla());
        labCasilla4.setText(casillas[4].getNombreCasilla());
        labCasilla5.setText(casillas[5].getNombreCasilla());
        labCasilla6.setText(casillas[6].getNombreCasilla());
        labCasilla7.setText(casillas[7].getNombreCasilla());
        labCasilla8.setText(casillas[8].getNombreCasilla());
        labCasilla9.setText(casillas[9].getNombreCasilla());
        labCasilla10.setText(casillas[10].getNombreCasilla());
        labCasilla11.setText(casillas[11].getNombreCasilla());
        labCasilla12.setText(casillas[12].getNombreCasilla());
        labCasilla13.setText(casillas[13].getNombreCasilla());
        labCasilla14.setText(casillas[14].getNombreCasilla());
        labCasilla15.setText(casillas[15].getNombreCasilla());
        labCasilla16.setText(casillas[16].getNombreCasilla());
        labCasilla17.setText(casillas[17].getNombreCasilla());
        labCasilla18.setText(casillas[18].getNombreCasilla());
        labCasilla19.setText(casillas[19].getNombreCasilla());

        //oculta iconos de carcel
        labcarcelj1.setVisible(false);
        labcarcelj2.setVisible(false);
        labcarcelj3.setVisible(false);
        labcarcelj4.setVisible(false);

        //Array de JLabel para colocar el nombre del propietario de la casilla al lado del nombre de esta
        propietario.add(0, labCasilla0);
        propietario.add(1, labPropietario1);
        propietario.add(2, labPropietario2);
        propietario.add(3, labCasilla3);
        propietario.add(4, labPropietario3);
        propietario.add(5, labCasilla5);
        propietario.add(6, labPropietario4);
        propietario.add(7, labPropietario5);
        propietario.add(8, labCasilla8);
        propietario.add(9, labPropietario6);
        propietario.add(10, labCasilla10);
        propietario.add(11, labPropietario7);
        propietario.add(12, labPropietario8);
        propietario.add(13, labCasilla13);
        propietario.add(14, labPropietario9);
        propietario.add(15, labCasilla15);
        propietario.add(16, labPropietario10);
        propietario.add(17, labPropietario11);
        propietario.add(18, labCasilla18);
        propietario.add(19, labPropietario12);
        
        labIconoTurno.setIcon(iconoJ1.getIcon());

    }

    /**
     * Metodo que ejecuta la tirada de los dados
     *
     * @param evt
     */
    private void butDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDadosActionPerformed
        
        tirada = Dado.lanzarDados();
        labResultado.setText(Integer.toString(tirada));
        
        
    }//GEN-LAST:event_butDadosActionPerformed
    /**
     * Metodo que implementa un botón que al pulsarlo mueve la ficha de jugador
     * y realiza la acción de la casilla.
     * @param evt 
     */
    private void butMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butMovimientoActionPerformed
        // TODO add your handling code here:
        Jugador jugActual = jugadores.get(turno);
        if (!jugActual.isEncarcelado()) {

            turnoJugador(jugActual, tirada);

        } else if (jugActual.getContadorCarcel() < 2 && jugActual.isEncarcelado()) {

            JOptionPane.showMessageDialog(null, jugActual.getNombre() + " te quedan " + (2 - jugActual.getContadorCarcel()) + " turnos en la carcel");
            jugActual.setContadorCarcel(jugActual.getContadorCarcel() + 1);

        } else { //Salida de la carcel
            if (jugActual == jugador1) {
                labcarcelj1.setVisible(false);
            } else if (jugActual == jugador2) {
                labcarcelj2.setVisible(false);
            } else if (jugActual == jugador3) {
                labcarcelj3.setVisible(false);
            } else if (jugActual == jugador4) {
                labcarcelj4.setVisible(false);
            }

            jugActual.setEncarcelado(false);
            JOptionPane.showMessageDialog(null, jugActual.getNombre() + " sales de la carcel");
            prisioneros.remove(prisioneros.indexOf(jugActual));
            jugActual.setContadorCarcel(0);

        }

        //Actulizacion de megamonedas de todos los jugadores
        if (jugador1 != null) {
            labj1megamonedas.setText(Integer.toString(jugador1.getMegamonedas()));
        }
        if (jugador2 != null) {
            labj2megamonedas.setText(Integer.toString(jugador2.getMegamonedas()));
        }
        if (jugador3 != null) {
            labj3megamonedas.setText(Integer.toString(jugador3.getMegamonedas()));
        }
        if (jugador4 != null) {
            labj4megamonedas.setText(Integer.toString(jugador4.getMegamonedas()));
        }

        //Condiciones de derrota y de victoria
        try {
            condicionVictoria();
        } catch (ConcurrentModificationException e) {
            System.out.println("Un jugador ha sido eliminado de la partida");
        }

        //Actualizacion del turno
        if (turno < (jugadores.size() - 1)) {
            turno++;
        } else {
            turno = 0;
        }
        
        jugActual = jugadores.get(turno);
        
        if (jugActual == jugador1) {
                labIconoTurno.setIcon(iconoJ1.getIcon());
            } else if (jugActual == jugador2) {
                labIconoTurno.setIcon(iconoJ2.getIcon());
            } else if (jugActual == jugador3) {
                labIconoTurno.setIcon(iconoJ3.getIcon());
            } else if (jugActual == jugador4) {
                labIconoTurno.setIcon(iconoJ4.getIcon());
            }
    }//GEN-LAST:event_butMovimientoActionPerformed

    /**
     * Metodo que implementa el movimiento del jugador por el tablero según la tirada, y gestión del
     * cobro al pasar por salida
     *
     * @param jugador
     * @param tirada
     * @param tablero
     * @param casilla
     * @return
     */
    public int posicionJugador(Jugador jugador, int tirada, Tablero tablero, CasillaGen[] casilla) {

        jugador.getFichaJugador().setPosicion(tirada + jugador.getFichaJugador().getPosicion()); //obtengo la nueva posición y la guardo

        if (jugador.getFichaJugador().getPosicion() == 20) {
            jugador.getFichaJugador().setPosicion(0);
            casilla[0].cobraSalida(jugador);
            return jugador.getFichaJugador().getPosicion();
        } else if (jugador.getFichaJugador().getPosicion() > tablero.getCasillas().length) {
            jugador.getFichaJugador().setPosicion(jugador.getFichaJugador().getPosicion() - (tablero.getCasillas().length + 1));
            casilla[0].cobraSalida(jugador);
            return jugador.getFichaJugador().getPosicion();
        } else {
            return jugador.getFichaJugador().getPosicion();
        }

    }

    /**
     * Actualización de iconos y acciones del jugador en su turno
     *
     * @param jugador
     * @param tirada
     */
    public void turnoJugador(Jugador jugador, int tirada) {
        if (jugador == jugador1) {
            
            posicionesj1.get(jugador1.getFichaJugador().getPosicion()).setVisible(false);
            posicionJugador(jugador1, tirada, tableroJuego, casillas);
            posicionesj1.get(jugador1.getFichaJugador().getPosicion()).setVisible(true);
            accionesCasillas(jugador1);
            labposj1.setText("Casilla " + Integer.toString(jugador1.getFichaJugador().getPosicion()));
            
        }
        if (jugador == jugador2) {
           
            posicionesj2.get(jugador2.getFichaJugador().getPosicion()).setVisible(false);
            posicionJugador(jugador2, tirada, tableroJuego, casillas);
            posicionesj2.get(jugador2.getFichaJugador().getPosicion()).setVisible(true);
            accionesCasillas(jugador2);
            labposj2.setText("Casilla " + Integer.toString(jugador2.getFichaJugador().getPosicion()));
            
        }
        if (jugador == jugador3) {
           
            posicionesj3.get(jugador3.getFichaJugador().getPosicion()).setVisible(false);
            posicionJugador(jugador3, tirada, tableroJuego, casillas);
            posicionesj3.get(jugador3.getFichaJugador().getPosicion()).setVisible(true);
            accionesCasillas(jugador3);
            labposj3.setText("Casilla " + Integer.toString(jugador3.getFichaJugador().getPosicion()));
            
        }
        if (jugador == jugador4) {
        
            posicionesj4.get(jugador4.getFichaJugador().getPosicion()).setVisible(false);
            posicionJugador(jugador4, tirada, tableroJuego, casillas);
            posicionesj4.get(jugador4.getFichaJugador().getPosicion()).setVisible(true);
            accionesCasillas(jugador4);
            labposj4.setText("Casilla " + Integer.toString(jugador4.getFichaJugador().getPosicion()));
            
        }

    }

    /**
     * Acciones del jugador según la casilla en que caiga
     *
     * @param jugador
     */
    public void accionesCasillas(Jugador jugador) {

        switch (jugador.getFichaJugador().getPosicion()) {
            case 0 -> { //Salida
                JOptionPane.showMessageDialog(null, "Cobras 20 megamonedas al pasar por la salida");
            }
            case 1, 2, 4, 6, 7, 9, 11, 12, 14, 16, 17, 19 -> {//Calles
                casillas[jugador.getFichaJugador().getPosicion()].comprarPropiedad(jugador);
                if (casillas[jugador.getFichaJugador().getPosicion()].getPropiedad()) {
                    propietario.get(jugador.getFichaJugador().getPosicion()).setText(propietarioCalle((Calle) casillas[jugador.getFichaJugador().getPosicion()]).getNombre());
                } else {
                    propietario.get(jugador.getFichaJugador().getPosicion()).setText("");
                }

            }
            case 5 -> { //visita carcel
                JOptionPane.showMessageDialog(null, "Visitas la carcel");
            }
            case 10 -> { //Parking
                casillas[jugador.getFichaJugador().getPosicion()].obtenerBote(jugador);
                labBote.setText(Integer.toString(boteTotal((Parking) casillas[10])));
            }
            case 15 -> { //Ir a la carcel

                if (jugador == jugador1) {
                    prisioneros.add(jugador1);
                    labcarcelj1.setVisible(true);
                    posicionesj1.get(jugador.getFichaJugador().getPosicion()).setVisible(false);
                    jugador.getFichaJugador().setPosicion(5);// te lleva a la casilla de la carcel
                    posicionesj1.get(jugador.getFichaJugador().getPosicion()).setVisible(true);
                    if (prisioneros.get(prisioneros.indexOf(jugador1)).isAbogado()) {
                        JOptionPane.showMessageDialog(null, "Usas tu carta de abogado y te libras de la carcel");
                        jugador.setAbogado(false);
                        labcarcelj1.setVisible(false);
                    } else {

                        casillas[jugador.getFichaJugador().getPosicion()].aLaCarcel(prisioneros.get(prisioneros.indexOf(jugador1)));
                    }
                } else if (jugador == jugador2) {
                    prisioneros.add(jugador2);
                    labcarcelj2.setVisible(true);
                    posicionesj2.get(jugador.getFichaJugador().getPosicion()).setVisible(false);
                    jugador.getFichaJugador().setPosicion(5);// te lleva a la casilla de la carcel
                    posicionesj2.get(jugador.getFichaJugador().getPosicion()).setVisible(true);
                    if (prisioneros.get(prisioneros.indexOf(jugador2)).isAbogado()) {
                        JOptionPane.showMessageDialog(null, "Usas tu carta de abogado y te libras de la carcel");
                        jugador.setAbogado(false);
                        labcarcelj2.setVisible(false);
                    } else {
                        casillas[jugador.getFichaJugador().getPosicion()].aLaCarcel(prisioneros.get(prisioneros.indexOf(jugador2)));
                    }
                } else if (jugador == jugador3) {
                    prisioneros.add(jugador3);
                    labcarcelj3.setVisible(true);
                    posicionesj3.get(jugador.getFichaJugador().getPosicion()).setVisible(false);
                    jugador.getFichaJugador().setPosicion(5);// te lleva a la casilla de la carcel
                    posicionesj3.get(jugador.getFichaJugador().getPosicion()).setVisible(true);
                    if (prisioneros.get(prisioneros.indexOf(jugador3)).isAbogado()) {
                        JOptionPane.showMessageDialog(null, "Usas tu carta de abogado y te libras de la carcel");
                        jugador.setAbogado(false);
                        labcarcelj3.setVisible(false);
                    } else {
                        casillas[jugador.getFichaJugador().getPosicion()].aLaCarcel(prisioneros.get(prisioneros.indexOf(jugador3)));
                    }
                } else if (jugador == jugador4) {

                    prisioneros.add(jugador4);
                    labcarcelj4.setVisible(true);
                    posicionesj4.get(jugador.getFichaJugador().getPosicion()).setVisible(false);
                    jugador.getFichaJugador().setPosicion(5);// te lleva a la casilla de la carcel
                    posicionesj4.get(jugador.getFichaJugador().getPosicion()).setVisible(true);

                    if (prisioneros.get(prisioneros.indexOf(jugador4)).isAbogado()) {

                        JOptionPane.showMessageDialog(null, "Usas tu carta de abogado y te libras de la carcel");
                        jugador.setAbogado(false);
                        labcarcelj4.setVisible(false);

                    } else {

                        casillas[jugador.getFichaJugador().getPosicion()].aLaCarcel(prisioneros.get(prisioneros.indexOf(jugador4)));

                    }
                }
            }

            case 3, 13 -> { //Banco

                JOptionPane.showMessageDialog(null, "Estas en el" + casillas[jugador.getFichaJugador().getPosicion()].getNombreCasilla() + ", pagas 10 megamonedas por impuestos");
                casillas[jugador.getFichaJugador().getPosicion()].pagoImpuesto(jugador);

            }
            case 8, 18 -> { //Cartas Suerte, y actualizacon de JLabel bote 

                casillas[jugador.getFichaJugador().getPosicion()].robarCarta(jugador, (Parking) casillas[10]);
                labBote.setText(Integer.toString(boteTotal((Parking) casillas[10])));
            }

        }

    }
    /**
     * 
     * @param botepark
     * @return 
     */
    public int boteTotal(Parking botepark) {
        return botepark.getBote();
    }
    /**
     * 
     * @param propiedad
     * @return 
     */
    public Jugador propietarioCalle(Calle propiedad) {
        return propiedad.getPropietario();
    }
    /**
     * 
     * @param micalle
     * @return 
     */
    public Calle obtenerCalle(Calle micalle) {
        return micalle;
    }
    /**
     * Condiciones de derrota y victoria
     * @throws ConcurrentModificationException 
     */
    public void condicionVictoria() throws ConcurrentModificationException {
        for (Jugador jug : jugadores) {
            if (jug.getMegamonedas() < 0) { //Un jugador es eliminado si sus megamonedas son menores que 0
                JOptionPane.showMessageDialog(null, jug.getNombre() + " es eliminado", "DERROTA", 1);

                for (int i = 0; i < casillas.length; i++) {
                    //borrado de las propiedades del jugador eliminado y sus iconos
                    if (propietario.get(i).getText().equalsIgnoreCase(jug.getNombre())) {
                        casillas[i].setPropiedad(false);
                        obtenerCalle((Calle) casillas[i]).setEnVenta(true);
                        obtenerCalle((Calle) casillas[i]).setPropietario(null);
                        propietario.get(i).setText("");

                    }

                }

                if (jug == jugador1) {
                    posicionesj1.get(jug.getFichaJugador().getPosicion()).setVisible(false);
                    iconoJ1.setVisible(false);
                }
                if (jug == jugador2) {
                    posicionesj2.get(jug.getFichaJugador().getPosicion()).setVisible(false);
                    iconoJ2.setVisible(false);
                }
                if (jug == jugador3) {
                    posicionesj3.get(jug.getFichaJugador().getPosicion()).setVisible(false);
                    iconoJ3.setVisible(false);
                }
                if (jug == jugador4) {
                    posicionesj4.get(jug.getFichaJugador().getPosicion()).setVisible(false);
                    iconoJ4.setVisible(false);
                }

                jugadores.remove(jug);

            }
            if (jugadores.size() == 1) {
                JOptionPane.showMessageDialog(null, jugadores.get(0).getNombre() + " es el ganador", "VICTORIA", 1);

            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPartida().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDados;
    private javax.swing.JPanel banco;
    private javax.swing.JPanel banco2;
    private javax.swing.JPanel betis;
    private javax.swing.JPanel borbolla;
    private javax.swing.JButton butDados;
    private javax.swing.JButton butMovimiento;
    private javax.swing.JPanel calatrava;
    private javax.swing.JPanel carcel;
    private javax.swing.JPanel casillaSalida;
    private javax.swing.JPanel catolicos;
    private javax.swing.JPanel constitucion;
    private javax.swing.JLabel iconoJ1;
    private javax.swing.JLabel iconoJ2;
    private javax.swing.JLabel iconoJ3;
    private javax.swing.JLabel iconoJ4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jug1;
    private javax.swing.JPanel jug2;
    private javax.swing.JPanel jug3;
    private javax.swing.JPanel jug4;
    private javax.swing.JLabel labBote;
    private javax.swing.JLabel labCasilla0;
    private javax.swing.JLabel labCasilla1;
    private javax.swing.JLabel labCasilla10;
    private javax.swing.JLabel labCasilla11;
    private javax.swing.JLabel labCasilla12;
    private javax.swing.JLabel labCasilla13;
    private javax.swing.JLabel labCasilla14;
    private javax.swing.JLabel labCasilla15;
    private javax.swing.JLabel labCasilla16;
    private javax.swing.JLabel labCasilla17;
    private javax.swing.JLabel labCasilla18;
    private javax.swing.JLabel labCasilla19;
    private javax.swing.JLabel labCasilla2;
    private javax.swing.JLabel labCasilla3;
    private javax.swing.JLabel labCasilla4;
    private javax.swing.JLabel labCasilla5;
    private javax.swing.JLabel labCasilla6;
    private javax.swing.JLabel labCasilla7;
    private javax.swing.JLabel labCasilla8;
    private javax.swing.JLabel labCasilla9;
    private javax.swing.JLabel labIconoTurno;
    private javax.swing.JLabel labNombreJugador1;
    private javax.swing.JLabel labNombreJugador2;
    private javax.swing.JLabel labNombreJugador3;
    private javax.swing.JLabel labNombreJugador4;
    private javax.swing.JLabel labPropietario1;
    private javax.swing.JLabel labPropietario10;
    private javax.swing.JLabel labPropietario11;
    private javax.swing.JLabel labPropietario12;
    private javax.swing.JLabel labPropietario2;
    private javax.swing.JLabel labPropietario3;
    private javax.swing.JLabel labPropietario4;
    private javax.swing.JLabel labPropietario5;
    private javax.swing.JLabel labPropietario6;
    private javax.swing.JLabel labPropietario7;
    private javax.swing.JLabel labPropietario8;
    private javax.swing.JLabel labPropietario9;
    private javax.swing.JLabel labResultado;
    private javax.swing.JLabel labTituloBote;
    private javax.swing.JLabel labcarcelj1;
    private javax.swing.JLabel labcarcelj2;
    private javax.swing.JLabel labcarcelj3;
    private javax.swing.JLabel labcarcelj4;
    private javax.swing.JLabel labj1megamonedas;
    private javax.swing.JLabel labj2megamonedas;
    private javax.swing.JLabel labj3megamonedas;
    private javax.swing.JLabel labj4megamonedas;
    private javax.swing.JLabel labp0j1;
    private javax.swing.JLabel labp0j2;
    private javax.swing.JLabel labp0j3;
    private javax.swing.JLabel labp0j4;
    private javax.swing.JLabel labp10j1;
    private javax.swing.JLabel labp10j2;
    private javax.swing.JLabel labp10j3;
    private javax.swing.JLabel labp10j4;
    private javax.swing.JLabel labp11j1;
    private javax.swing.JLabel labp11j2;
    private javax.swing.JLabel labp11j3;
    private javax.swing.JLabel labp11j4;
    private javax.swing.JLabel labp12j1;
    private javax.swing.JLabel labp12j2;
    private javax.swing.JLabel labp12j3;
    private javax.swing.JLabel labp12j4;
    private javax.swing.JLabel labp13j1;
    private javax.swing.JLabel labp13j2;
    private javax.swing.JLabel labp13j3;
    private javax.swing.JLabel labp13j4;
    private javax.swing.JLabel labp14j1;
    private javax.swing.JLabel labp14j2;
    private javax.swing.JLabel labp14j3;
    private javax.swing.JLabel labp14j4;
    private javax.swing.JLabel labp15j1;
    private javax.swing.JLabel labp15j2;
    private javax.swing.JLabel labp15j3;
    private javax.swing.JLabel labp15j4;
    private javax.swing.JLabel labp16j1;
    private javax.swing.JLabel labp16j2;
    private javax.swing.JLabel labp16j3;
    private javax.swing.JLabel labp16j4;
    private javax.swing.JLabel labp17j1;
    private javax.swing.JLabel labp17j2;
    private javax.swing.JLabel labp17j3;
    private javax.swing.JLabel labp17j4;
    private javax.swing.JLabel labp18j1;
    private javax.swing.JLabel labp18j2;
    private javax.swing.JLabel labp18j3;
    private javax.swing.JLabel labp18j4;
    private javax.swing.JLabel labp19j1;
    private javax.swing.JLabel labp19j2;
    private javax.swing.JLabel labp19j3;
    private javax.swing.JLabel labp19j4;
    private javax.swing.JLabel labp1j1;
    private javax.swing.JLabel labp1j2;
    private javax.swing.JLabel labp1j3;
    private javax.swing.JLabel labp1j4;
    private javax.swing.JLabel labp2j1;
    private javax.swing.JLabel labp2j2;
    private javax.swing.JLabel labp2j3;
    private javax.swing.JLabel labp2j4;
    private javax.swing.JLabel labp3j1;
    private javax.swing.JLabel labp3j2;
    private javax.swing.JLabel labp3j3;
    private javax.swing.JLabel labp3j4;
    private javax.swing.JLabel labp4j1;
    private javax.swing.JLabel labp4j2;
    private javax.swing.JLabel labp4j3;
    private javax.swing.JLabel labp4j4;
    private javax.swing.JLabel labp5j1;
    private javax.swing.JLabel labp5j2;
    private javax.swing.JLabel labp5j3;
    private javax.swing.JLabel labp5j4;
    private javax.swing.JLabel labp6j1;
    private javax.swing.JLabel labp6j2;
    private javax.swing.JLabel labp6j3;
    private javax.swing.JLabel labp6j4;
    private javax.swing.JLabel labp7j1;
    private javax.swing.JLabel labp7j2;
    private javax.swing.JLabel labp7j3;
    private javax.swing.JLabel labp7j4;
    private javax.swing.JLabel labp8j1;
    private javax.swing.JLabel labp8j2;
    private javax.swing.JLabel labp8j3;
    private javax.swing.JLabel labp8j4;
    private javax.swing.JLabel labp9j1;
    private javax.swing.JLabel labp9j2;
    private javax.swing.JLabel labp9j3;
    private javax.swing.JLabel labp9j4;
    private javax.swing.JLabel labposj1;
    private javax.swing.JLabel labposj2;
    private javax.swing.JLabel labposj3;
    private javax.swing.JLabel labposj4;
    private javax.swing.JPanel montesierra;
    private javax.swing.JPanel montoto;
    private javax.swing.JPanel palmera;
    private javax.swing.JPanel pancarcelj1;
    private javax.swing.JPanel pancarcelj2;
    private javax.swing.JPanel pancarcelj3;
    private javax.swing.JPanel pancarcelj4;
    private javax.swing.JPanel parking;
    private javax.swing.JPanel raza;
    private javax.swing.JPanel sierpes;
    private javax.swing.JPanel suerte;
    private javax.swing.JPanel suerte2;
    private javax.swing.JPanel tetuan;
    private javax.swing.JPanel trajano;
    private javax.swing.JPanel visitaCarcel;
    // End of variables declaration//GEN-END:variables
}
