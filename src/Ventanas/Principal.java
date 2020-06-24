
package Ventanas;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Principal extends javax.swing.JFrame {

    private boolean casilla[][]= new boolean[3][3];
    private String turno="usuario1";
    private int matriz[][]= new int [3][3];
    private String usuario1,usuario2;
    private int gu1=0,gu2=0,e=0;

    public Principal(String usuario1, String usuario2) {
         this.usuario1=usuario1;
        this.usuario2=usuario2;
        
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        llenarCasilas();
        
       
    }
    private void dibujarX(JButton boton){
        
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/x.png")));
        
    }
    private void dibujarO(JButton boton){
        
        boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/circulo.png")));
        
    }
    
    private void llenarCasilas(){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casilla[i][j]=true;
            }
        }
        
    }
     private void llenarMatriz(){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=0;
            }
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnarriba_izquierda = new javax.swing.JButton();
        btnArriba = new javax.swing.JButton();
        btnArriba_derecha = new javax.swing.JButton();
        btnIzquierda = new javax.swing.JButton();
        btnCentro = new javax.swing.JButton();
        btnDerecha = new javax.swing.JButton();
        btnAbajo_izquierda = new javax.swing.JButton();
        btnAbajo = new javax.swing.JButton();
        btnAbajo_derecha = new javax.swing.JButton();
        barra_menu = new javax.swing.JMenuBar();
        menu_juego = new javax.swing.JMenu();
        comenzar = new javax.swing.JCheckBoxMenuItem();
        resultado = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JCheckBoxMenuItem();
        menu_ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        btnarriba_izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnarriba_izquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(btnarriba_izquierda);

        btnArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArribaActionPerformed(evt);
            }
        });
        jPanel1.add(btnArriba);

        btnArriba_derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArriba_derechaActionPerformed(evt);
            }
        });
        jPanel1.add(btnArriba_derecha);

        btnIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(btnIzquierda);

        btnCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCentro);

        btnDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerechaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDerecha);

        btnAbajo_izquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajo_izquierdaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbajo_izquierda);

        btnAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbajo);

        btnAbajo_derecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbajo_derechaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbajo_derecha);

        menu_juego.setText("Juego");
        menu_juego.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        comenzar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        comenzar.setSelected(true);
        comenzar.setText("Comenzar de nuevo");
        comenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/comenzar.png"))); // NOI18N
        comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarActionPerformed(evt);
            }
        });
        menu_juego.add(comenzar);

        resultado.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        resultado.setSelected(true);
        resultado.setText("Mostrar resultado");
        resultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/resultados.png"))); // NOI18N
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });
        menu_juego.add(resultado);
        menu_juego.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        salir.setSelected(true);
        salir.setText("Salir");
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu_juego.add(salir);

        barra_menu.add(menu_juego);

        menu_ayuda.setText("Ayuda");
        menu_ayuda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        menu_ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_ayudaMouseClicked(evt);
            }
        });
        menu_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_ayudaActionPerformed(evt);
            }
        });
        barra_menu.add(menu_ayuda);

        setJMenuBar(barra_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void btnarriba_izquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnarriba_izquierdaActionPerformed
        if (casilla[0][0]==true) {  //veridficamos si aun no se a dado click al boton
            if (turno.equals("usuario1")) { //verificamos el turno
                dibujarX(btnarriba_izquierda);
                matriz[0][0]=1;
                turno="usuario2";
            }else{
                dibujarO(btnarriba_izquierda);
                matriz[0][0]=2;
                turno="usuario1";
            }
            
            casilla[0][0]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnarriba_izquierdaActionPerformed

    private void btnArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArribaActionPerformed
        if (casilla[0][1]==true) {  //veridficamos si aun no se a dado click al boton
            if (turno.equals("usuario1")) { //verificamos el turno
                dibujarX(btnArriba);
                matriz[0][1]=1;
                turno="usuario2";
            }else{
                dibujarO(btnArriba);
                matriz[0][1]=2;
                turno="usuario1";
            }
            
            casilla[0][1]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnArribaActionPerformed

    private void btnArriba_derechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArriba_derechaActionPerformed
       if (casilla[0][2]==true) {  //veridficamos si aun no se a dado click al boton
            if (turno.equals("usuario1")) { //verificamos el turno
                dibujarX(btnArriba_derecha);
                matriz[0][2]=1;
                turno="usuario2";
            }else{
                dibujarO(btnArriba_derecha);
                matriz[0][2]=2;
                turno="usuario1";
            }
            
            casilla[0][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnArriba_derechaActionPerformed

    private void btnIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzquierdaActionPerformed
        if (casilla[1][0]==true) {  //veridficamos si aun no se a dado click al boton
            if (turno.equals("usuario1")) { //verificamos el turno
                dibujarX(btnIzquierda);
                matriz[1][0]=1;
                turno="usuario2";
            }else{
                dibujarO(btnIzquierda);
                matriz[1][0]=2;
                turno="usuario1";
            }
            
            casilla[1][0]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnIzquierdaActionPerformed

    private void btnCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentroActionPerformed
       if (casilla[1][1]==true) {  //veridficamos si aun no se a dado click al boton
            if (turno.equals("usuario1")) { //verificamos el turno
                dibujarX(btnCentro);
                matriz[1][1]=1;
                turno="usuario2";
            }else{
                dibujarO(btnCentro);
                matriz[1][1]=2;
                turno="usuario1";
            }
            
            casilla[1][1]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnCentroActionPerformed

    private void btnDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerechaActionPerformed
        if (casilla[1][2]==true) {  //veridficamos si aun no se a dado click al boton
            if (turno.equals("usuario1")) { //verificamos el turno
                dibujarX(btnDerecha);
                matriz[1][2]=1;
                turno="usuario2";
            }else{
                dibujarO(btnDerecha);
                matriz[1][2]=2;
                turno="usuario1";
            }
            
            casilla[1][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnDerechaActionPerformed

    private void btnAbajo_izquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajo_izquierdaActionPerformed
        if (casilla[2][0]==true) {  //veridficamos si aun no se a dado click al boton
            if (turno.equals("usuario1")) { //verificamos el turno
                dibujarX(btnAbajo_izquierda);
                matriz[2][0]=1;
                turno="usuario2";
            }else{
                dibujarO(btnAbajo_izquierda);
                matriz[2][0]=2;
                turno="usuario1";
            }
            
            casilla[2][0]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnAbajo_izquierdaActionPerformed

    private void btnAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajoActionPerformed
        if (casilla[2][1]==true) {  //veridficamos si aun no se a dado click al boton
            if (turno.equals("usuario1")) { //verificamos el turno
                dibujarX(btnAbajo);
                matriz [2][1]=1;
                turno="usuario2";
            }else{
                dibujarO(btnAbajo);
                 matriz [2][1]=2;
                turno="usuario1";
            }
            
            casilla[2][1]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnAbajoActionPerformed

    private void btnAbajo_derechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbajo_derechaActionPerformed
       if (casilla[2][2]==true) {  //veridficamos si aun no se a dado click al boton
            if (turno.equals("usuario1")) { //verificamos el turno
                dibujarX(btnAbajo_derecha);
                 matriz [2][2]=1;
                turno="usuario2";
            }else{
                dibujarO(btnAbajo_derecha);
                 matriz [2][2]=2;
                turno="usuario1";
            }
            
            casilla[2][2]=false;
            comprobarGanador();
        }
    }//GEN-LAST:event_btnAbajo_derechaActionPerformed

    private void comenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarActionPerformed
        gu1=0;
        gu2=0;
        e=0;
        reiniciarJuego();
    }//GEN-LAST:event_comenzarActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
       new Resultados(this, true, usuario1, usuario2, gu1, gu2, e).setVisible(true);
    }//GEN-LAST:event_resultadoActionPerformed

    private void menu_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_ayudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_ayudaActionPerformed

    private void menu_ayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_ayudaMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.guiainfantil.com/articulos/ocio/juegos/juego-de-tres-en-raya-como-jugar-con-los-ninos-con-papel-y-lapiz/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menu_ayudaMouseClicked

    private void comprobarGanador (){
       boolean g1=false,g2=false;
       int casillasEmpate=0;
       //Comprobamos el ganador
       g1=comprobar(1);
       g2=comprobar(2);
       
        if (g1==true) {
            new Ganador(this,true,usuario1).setVisible(true);
            gu1++;
            reiniciarJuego();
            
        }else if (g2==true) {
              new Ganador(this,true,usuario2).setVisible(true);
              gu2++;
              reiniciarJuego();
        }
        else{//Talvez el tablero esta lleno 
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matriz[i][j]!=0) {//puede haber num 1 o 2
                       casillasEmpate++; 
                    }
                }
            }
            
            if (casillasEmpate==9) {
                new Empate(this,true).setVisible(true);
                e++;
                reiniciarJuego();
            }else{
                casillasEmpate=0;
            }
        }
       
    }
    
    private boolean comprobar(int n){
        boolean ganador=false;
        //filas
        if ((matriz[0][0]==n)  && (matriz[0][1]==n) && (matriz[0][2]==n)) {//si en la matriz hay tres num iguales entonces el usuario gana
            ganador=true;
        }else if ((matriz[1][0]==n)  && (matriz[1][1]==n) && (matriz[1][2]==n)) {
            ganador=true;
        }
        else if ((matriz[2][0]==n)  && (matriz[2][1]==n) && (matriz[2][2]==n)) {
            ganador=true;
        }
        
        //columnas
        else if ((matriz[0][0]==n)  && (matriz[1][0]==n) && (matriz[2][0]==n)) {
            ganador=true;
        }
         else if ((matriz[0][1]==n)  && (matriz[1][1]==n) && (matriz[2][1]==n)) {
            ganador=true;
        }
         else if ((matriz[0][2]==n)  && (matriz[1][2]==n) && (matriz[2][2]==n)) {
            ganador=true;
        }
        
        //Diagonales
        
         else if ((matriz[0][0]==n)  && (matriz[1][1]==n) && (matriz[2][2]==n)) {
            ganador=true;
        } else if ((matriz[0][2]==n)  && (matriz[1][1]==n) && (matriz[2][0]==n)) {
            ganador=true;
        }
        return ganador;
    }
    
    private void reiniciarJuego(){
      llenarCasilas();
      llenarMatriz();
      
      btnarriba_izquierda.setIcon(null);
      btnArriba.setIcon(null);
      btnArriba_derecha.setIcon(null);
      btnIzquierda.setIcon(null);
      btnCentro.setIcon(null);
      btnDerecha.setIcon(null);
      btnAbajo_izquierda.setIcon(null);
      btnAbajo.setIcon(null);
      btnAbajo_derecha.setIcon(null);
      
      turno="usuario1";
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barra_menu;
    private javax.swing.JButton btnAbajo;
    private javax.swing.JButton btnAbajo_derecha;
    private javax.swing.JButton btnAbajo_izquierda;
    private javax.swing.JButton btnArriba;
    private javax.swing.JButton btnArriba_derecha;
    private javax.swing.JButton btnCentro;
    private javax.swing.JButton btnDerecha;
    private javax.swing.JButton btnIzquierda;
    private javax.swing.JButton btnarriba_izquierda;
    private javax.swing.JCheckBoxMenuItem comenzar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu_ayuda;
    private javax.swing.JMenu menu_juego;
    private javax.swing.JCheckBoxMenuItem resultado;
    private javax.swing.JCheckBoxMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
