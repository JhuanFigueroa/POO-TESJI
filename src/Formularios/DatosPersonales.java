
package Formularios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DatosPersonales extends JFrame{//INDICAMOS QUE ESTA CLASE HEREDA DE LA CLASE JFrame
    //COMPONENTES QUE USAREMOS
    static JLabel lblNombre= new JLabel();
    static JLabel lblApellidos= new JLabel();
    static JLabel lblE_mail = new JLabel();
    static JLabel lblNumControl =new JLabel();
    static JLabel lblCarrera= new JLabel();
    static JLabel lblTitulo=new JLabel("IMPRESION DE DATOS");
    
    static JPanel panelDatos= new JPanel();
    static JPanel pnltitulo= new JPanel();
    static JPanel pnlCentro = new JPanel();
    
    //Metodo constructor con nombre,apellidos,mail,numControl y carrera como parametros
    public DatosPersonales(String nombre,String apellidos,String mail,String numControl,String carrera){//parametros que recibio de la clase RegistroDatos
        this.setSize(300,300);//Tamaño de la ventana
        pnltitulo.setLayout(new FlowLayout());//añadimos un Flow layout al panel del titulo
        lblTitulo.setFont(new Font("arial",Font.BOLD, 25));//modificamos la fuente de la etiqueta del titulo
        pnltitulo.add(lblTitulo);//añadimos la etiqueta de titulo a su panel correspondiente
        
        panelDatos.setLayout(new GridLayout(5,1,20,20));//añadimos un Grid layout al panel de datos con 5 filas y una columna y ademas un espacio de 2 horizontal y 10 en vertical
        //En cada etiqueta mostramos su texto correspondiente
        lblNombre.setText("Nombre: "+nombre);//mostramos el nombre
        lblApellidos.setText("Apellidos: "+apellidos);//mostramos los apellidos
        lblE_mail.setText("E-mail: "+mail);//mostramos el correo
        lblNumControl.setText("Num de control: "+numControl);//mostrmos el nuemro de control
        lblCarrera.setText("Carrera: "+carrera);//mostramos la carrera
        //Añadimos las etiquetas de los datos a su panel
        panelDatos.add(lblNombre);
        panelDatos.add(lblApellidos);
        panelDatos.add(lblE_mail);
        panelDatos.add(lblNumControl);
        panelDatos.add(lblCarrera);
        
        pnlCentro.setLayout(new FlowLayout());//añadimos un FlowLayout al panel Central
        pnlCentro.add(panelDatos);//añadimos el pnael de datos al panel central
        
        this.add(pnltitulo,BorderLayout.NORTH);//añadimos el panel del titulo al norte del JFrame
        this.add(pnlCentro,BorderLayout.CENTER);//añadimos el panel central en el centro del JFrame
        
        this.setResizable(false);//Hacemos que el usuario no pueda cambiar el tamaño de la ventana
        this.setVisible(true);//Hacemos que la ventana sea visible
        this.setLocationRelativeTo(null);//Hacemos que la ventana aparesca en el centro de la pantalla
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//al cerrar la ventana se terminara el programa 
    }
    
    
    
}
