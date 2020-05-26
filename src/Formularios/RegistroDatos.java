
package Formularios;

import static Formularios.Panel_Autenticacion.txtUsuario;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegistroDatos extends JFrame{//INDICAMOS QUE ESTA CLASE HEREDA DE LA CLASE JFrame
    //COMPONENTES QUE UTILIZAREMOS
    static JLabel lblTitulo= new JLabel();//Instanciamos la etiqueta titulo para poder mostrar el nombre del usuario
    static JLabel lblNombre;
    static JLabel lblApellidos;
    static JLabel lblE_mail;
    static JLabel lblNumControl;
    static JLabel lblCarrera;
    //cajas de texto
    static JTextField txtNombre;
    static JTextField txtApellidos;
    static JTextField txtE_mail;
    static JTextField txtNum_Control;
    //lista dessplegable
    static JComboBox cbxCarrera;
    //botones
    static JButton btnOk;
    static JButton btnCancelar;
    //panel
    static JPanel pnlPrincipal= new JPanel();
    
    public RegistroDatos(String nombre){    //COnstructor de la clase que rcibe un parametro de tipo String 
        this.setSize(500,500);  //Tamaño de la ventana
        lblTitulo.setText("BIENVENID@ "+nombre);    //La etiqueta del titulo mostrara el nombre (parametro que recibio de la clase Panel_Autenticacion)
        this.add(pnlPrincipal); //Añadimos el panel principal al JFrame
        agregarComponentes();   //agregamos todos los componentes
        this.setResizable(false); //Hacemos que el usuario no pueda cambiar el tamaño de la ventana
        this.setVisible(true);//Hacemos que la ventana sea visible
        this.setLocationRelativeTo(null);   //Hacemos que la ventana aparesca en el centro de la pantalla
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);   //al cerrar la ventana se terminara el programa  
    }
    
    //Panel para añadir el titulo
    static JPanel pnlTitulo= new JPanel(); //se instancia fuera del metodo para poder añadirlo al panel principal
    private void agregarTitulo(){//metodo para añadir el titulo
       
        pnlTitulo.setLayout(new FlowLayout());//agregamos un Flow layout al panel
        lblTitulo.setFont(new Font("arial",Font.BOLD,25));  //cambiamos el tipo de fuente de la etiqueta
        pnlTitulo.add(lblTitulo);   //añadimos la etiqueta al panel  
    }
    
    static JPanel pnlFormulario= new JPanel();//panel para añadir el formulario
    private void agregarFormulario(){//metodo para añadir el formulario
        
        pnlFormulario.setLayout(new GridLayout(4,1,2,10));//añadimos un GridLayout al panel de 4 filas y 2 columnas ademas de un espacio de 2 horizontal y 10 en vertical
        
        //Instanciamos las etiquetas y las cajas de texto
        lblNombre= new JLabel("Nombre");
        txtNombre= new JTextField();
        lblApellidos= new JLabel("Apellidos");
        txtApellidos= new JTextField();
        lblE_mail= new JLabel("E-mail");
        txtE_mail= new JTextField();
        lblNumControl= new JLabel("N° Control");
        txtNum_Control= new JTextField();
        //Añadimos los componentes al panel
        pnlFormulario.add(lblNombre);
        pnlFormulario.add(txtNombre);
        pnlFormulario.add(lblApellidos);
        pnlFormulario.add(txtApellidos);
        pnlFormulario.add(lblE_mail);
        pnlFormulario.add(txtE_mail);
        pnlFormulario.add(lblNumControl);
        pnlFormulario.add(txtNum_Control);    
    }
    
    
    
    JPanel pnlCarreras= new JPanel();//panel para añadir la lista desplegable
    //arreglo con las carreras que se mostraran en la lista desplegable
    static String carreras[]= {"Ing. Sistemas Computacionales","Ing. Quimica","Ing. TICS","Ing. Industrial","Ing. Informatica","Ing. Mecatronica","Ing. Civil","Lic. Administracion"};
    
    private void agregarCarreras(){
        
        pnlCarreras.setLayout(new FlowLayout());//añadimos un Flowlayout al panel
        
        cbxCarrera = new JComboBox(carreras);//llenamos la lista desplegable con las carreras
        lblCarrera= new JLabel("Carrera");  //instanciamos la etiqueta de carrera
        pnlCarreras.add(lblCarrera);    //añadimos la etiqueta al panel
        pnlCarreras.add(cbxCarrera);    //añadimos la lista desplegable al panel
        
    }
    
    JPanel pnlBotones= new JPanel();//panel para añadir los botones
    private void agregarBotones(){ //metodo para añadir los botones
        pnlBotones.setLayout(new FlowLayout()); //añadimos un FlowLayout al panel
        btnOk= new JButton("Guardar");  //Instanciamos el boton ok y agragamos el texto que mostrara
        btnCancelar= new JButton("cancelar");//Instanciamos el boton canelar y agragamos el texto que mostrara 
        pnlBotones.add(btnOk);//añadimos el boton ok al panel
        pnlBotones.add(btnCancelar);    //añadimos el boton cancelar al panel
       guardarDatos();   //mandamos llamar al metodo guardar datos
       cancelar();  //mandamos llamar al metodo cancelar
    }
    
     private void guardarDatos(){//metodo para guardar los datos y posteriormente imprimirlos en otra ventana
        ActionListener acceso; //creamos un objeto de la clase ActionListener
        acceso= new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String nombre=txtUsuario.getText();//varaible nombre que tendra el valor del texto que este en txtUsuario
            String apellidos= txtApellidos.getText();//variable apellidos que tendra el valor del texto que este en txtApellidos
            String mail= txtE_mail.getText();//variable mail que tendra el valor del texto que este en txtE_mail
            String numControl= txtNum_Control.getText();//variable numControl que tendra el valor del texto que este en txtnumControl
            String carrera= cbxCarrera.getSelectedItem().toString();//variable carrera que tendra el valor del elemento que este seleccionado de la lista desplegable
            //creamos un objeto de la clase DatosPersonales
            DatosPersonales ob1 = new DatosPersonales(nombre, apellidos, mail, numControl,carrera);//le pasamos como parametros nombre,apellidos,mail,numControl y carrera
            ob1.setVisible(true);   //hacemos visible a la otra ventana
            setVisible(false);//hacemos esta invisible
            }            
        };   
        btnOk.addActionListener(acceso);   //añadimos el evento al boton ok
    }
     
     private void cancelar(){// metodo para cancelar
          ActionListener cancelar  ;
        cancelar= new ActionListener() {          
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);//hacemos esta ventana invicible
                Panel_Autenticacion ob1= new Panel_Autenticacion();// creamos un objeto de la clase Panel_Autenticacion
                ob1.setVisible(true);   //hacemos visible a la ventana anterior
            }           
        };      
        btnCancelar.addActionListener(cancelar);    //agregamos el evento al boton cancelar
     }
     
     private void agregarComponentes(){//metodo para agregar todos los componentes
        pnlPrincipal.setLayout(new GridLayout(4,1,10,10));//añadimos un GridLayout al panel principal
        //añadimos todos los paneles al panel principal
        pnlPrincipal.add(pnlTitulo);
        pnlPrincipal.add(pnlFormulario);
        pnlPrincipal.add(pnlCarreras);
        pnlPrincipal.add(pnlBotones);
        agregarTitulo();//agregamos el titulo
        agregarFormulario();//agregamos el formulario
        agregarCarreras();//agregamos las carreras
        agregarBotones();//agregamos los botones
    }
}
