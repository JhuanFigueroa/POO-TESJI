
package Formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Panel_Autenticacion extends JFrame {   //INDICAMOS QUE ESTA CLASE HEREDA DE LA CLASE JFrame
    
    //COMPONENTES QUE UTILIZAREMOS
    static JLabel lblTitulo;
    static JLabel lblImagen;
    static JTextField txtUsuario;
    static JPasswordField jpContraseña;
    static JButton btnAcceso;
    static JLabel lblNombre;
    static JLabel lblContraseña;
    
    public Panel_Autenticacion(){   //CONSTRUCTOR DE LA CLASE
        this.setSize(380, 180); //Tamaño de la ventana 
        agregarComponentes();   //mandamos a llamar el metodo agregarComponentes
        this.setResizable(false);   //Hacemos que el usuario no pueda cambiar el tamaño de la ventana
        this.setVisible(true);  //Hacemos que la ventana sea visible
        this.setLocationRelativeTo(null);   //Hacemos que la ventana aparesca en el centro de la pantalla
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);   //al cerrar la ventana se terminara el programa  
    }
    
    static JPanel pnlTitulo;    //Panel para agregar el titulo
    private void agregarTitulo(){    //metodo para agregar el titulo
       pnlTitulo= new JPanel();    //instanciamos el panel
       pnlTitulo.setLayout(new FlowLayout());  //al panel le asignamos un FlowLayout
       lblTitulo= new JLabel("PANEL-AUTENTICACION");   //Instanciamos la etiqueta y escribimos el titulo
       lblTitulo.setFont(new Font("arial",Font.BOLD,15));  //Cambiamos la fuente de la etiqueta
       pnlTitulo.add(lblTitulo);   //añadimos la etiqueta al panel
       this.add(pnlTitulo,BorderLayout.NORTH);  //añadimos el panel al JFrame
    } 
   
    static JPanel pnlFormulario;    //panel para el formulario de autenticacion
    private void agregarFormulario(){    //metodo para agregar el formulario
      
       pnlFormulario=new JPanel();  //instanciamos el panel
       lblNombre= new JLabel("Usuario:");    //instanciamos la etiqueta del nombre   
       lblContraseña=new JLabel("Contraseña: ");    //instanciamos la etiqueta de la contraseña
       txtUsuario=new JTextField(); //instanciamos el JtextField donde se escribira el usuario
       jpContraseña = new JPasswordField(); //instanciamos el JPasswordField donde se escribira la contraseña
       pnlFormulario.setLayout(new GridLayout(2, 2,5,10));  //añadimos un grid layout con 2 filas y 2 columnas ademas de un espacio de 2 horizontal y 10 en vertical
       //AÑADIMOS LOS COMPONENTES AL PANEL
       pnlFormulario.add(lblNombre);
       pnlFormulario.add(txtUsuario);
       pnlFormulario.add(lblContraseña);
       pnlFormulario.add(jpContraseña);
      
       this.add(pnlFormulario,BorderLayout.CENTER);//Añadimos el panel de formulario en el centro
    }
    
    static JPanel pnlBoton; //panel para añadir el boton
    private void agregarBoton(){ //metodo para añadir el boton
        
        pnlBoton= new JPanel(); //instanciamos el panel
        pnlBoton.setLayout(new FlowLayout());   //establecemos un FlowLayout al panel
        btnAcceso= new JButton("Accesar");  //instanciamos el boton y escribimos el texto que mostrara
        btnAcceso.setBackground(Color.CYAN);// Establecemos el color del boton
        pnlBoton.add(btnAcceso);    //añadimos el boton al panel
        this.add(pnlBoton,BorderLayout.SOUTH);  //añadimos el panel al JFrame en el sur
        
        acceder();//mandamos a llamar al evento acceder
    }
    
    private void acceder(){ //metodo que se activara al dar click al boton
        ActionListener acceso;  //creamos un objeto de la clase ActionListener
        acceso= new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                //Establecemos el usuario 
                String contraseña="sistemas";   //establecemos la contraseña
                
                //Creamos una variable llamada nombre de tipo String
                String nombre=txtUsuario.getText(); //  tendra el valor de el texto de la txtusuario y nos servira para instanciar la siguiente ventana
                if ((contraseña.equals(jpContraseña.getText()))) {//si  la contraseña es igual al texto del JPasswordField
                    JOptionPane.showMessageDialog(null,"Bienvenido al sistema");    //Se nos mostrara un mensaje de "Bienvenido al Sistema"
                    RegistroDatos ob1= new RegistroDatos(nombre);   //Instanciamos la siguiente ventana y recibira el nombre como parametro
                    ob1.setVisible(true);   //hacemos a la siguiente ventana visible
                    setVisible(false);  //hacemos esta ventana invisible
                }
                
                else{   //si  la contraseña fue incorrectos
                   JOptionPane.showMessageDialog(null,"Usuario o contraeña incorrectos");   //Nos mostrara un mensaje de usuario o contraseña incorrectos
                } 
            }    
        };
        btnAcceso.addActionListener(acceso);    //añadimos el evento al boton btnAcceso
    }

    private void agregarComponentes(){   //metodo para añadir todos los componentes
        agregarTitulo(); //Añadimos el titulo
        agregarFormulario();    //añadimos el formulario
        agregarBoton(); //añadimos el boton
    }
}