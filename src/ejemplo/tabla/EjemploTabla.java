/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.tabla;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanf
 */
public class EjemploTabla extends javax.swing.JDialog {

    DefaultTableModel modeloTabla = new DefaultTableModel();
    private JButton btnRegresar;
    private JScrollPane jScrollPane1;
    private JLabel lblTitulo;
    private JTable tabla;

    public EjemploTabla(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        iniciarComponentes();
        setLocationRelativeTo(null);
        cargarModeloTabla();
        setSize(500, 500);
        setLocationRelativeTo(null);

    }

    private void cargarModeloTabla() {
        //Añadimos las columnas a la tabla
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Celular");

    }

    JPanel pnlTitulo;

    private void agregarTitulo() {
        pnlTitulo = new JPanel();    //instanciamos el panel
        pnlTitulo.setLayout(new FlowLayout());  //al panel le asignamos un FlowLayout
        lblTitulo = new JLabel("Usuarios Registrados");   //Instanciamos la etiqueta y escribimos el titulo
        lblTitulo.setFont(new Font("arial", Font.BOLD, 15));  //Cambiamos la fuente de la etiqueta
        pnlTitulo.add(lblTitulo);   //añadimos la etiqueta al panel
        this.add(pnlTitulo, BorderLayout.NORTH);  //añadimos el panel al JFrame
    }

    JPanel pnlTabla;

    private void agregarTabla() {
        pnlTabla = new JPanel();
        tabla = new JTable();
        tabla.setModel(modeloTabla);
        jScrollPane1 = new JScrollPane();
        jScrollPane1.setViewportView(tabla);
        pnlTabla.setLayout(new FlowLayout());
        pnlTabla.add(jScrollPane1);
        this.add(pnlTabla, BorderLayout.CENTER);
    }

    static JPanel pnlBoton; //panel para añadir el boton

    private void agregarBoton() { //metodo para añadir el boton

        pnlBoton = new JPanel(); //instanciamos el panel
        pnlBoton.setLayout(new FlowLayout());   //establecemos un FlowLayout al panel
        btnRegresar = new JButton("Regresar");  //instanciamos el boton y escribimos el texto que mostrara
        btnRegresar.setBackground(Color.CYAN);// Establecemos el color del boton
        pnlBoton.add(btnRegresar);    //añadimos el boton al panel
        this.add(pnlBoton, BorderLayout.SOUTH);  //añadimos el panel al JFrame en el sur

        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
    }

    private void iniciarComponentes() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        agregarTitulo(); //Añadimos el titulo
        agregarTabla();    //añadimos el formulario
        agregarBoton(); //añadimos el boton

    }

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    public static void main(String[] args) {
        EjemploTabla tabla = new EjemploTabla(null, true);
        tabla.setVisible(true);

    }

}
