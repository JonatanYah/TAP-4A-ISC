package Ejercicios.EditorTexto;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;
import java.io.*;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Panel;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.BorderLayout;



public class Editor extends Frame implements ActionListener  {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
 
    public Editor() {
        super("Editor de texto");
        this.init();
        setBounds(400,200,500,300);
        this.setVisible(true);
    }
    /**
     * Inicializamos los widgets y los metemos al contenedor
     */
    public void init() {

        isClicked = false;
        panel1 = new Panel();
        color = new Button("Color");
        comillas = new Button("Comillas");
        tamanio = new Button("Tamaño");
        abrir = new Button("Abrir");
        guardar = new Button("Guardar");
        salir = new Button("Salir");
        btn_click = new Button("Aceptar");
        btn_clear = new Button("Limpiar");
        lbl_msg = new Label("Introduzca el Texto en el campo inferior de la ventana:");
        txt_status = new TextField("");
        txt_result = new TextArea();
        txt_result.setFont(new Font("arial",Font.PLAIN,12));
        this.setLayout(new BorderLayout());
        this.add(panel1,BorderLayout.NORTH);
        panel1.add(color, BorderLayout.NORTH);
        panel1.add(comillas, BorderLayout.NORTH);
        panel1.add(tamanio, BorderLayout.NORTH);
        panel1.add(abrir, BorderLayout.NORTH);
        panel1.add(guardar, BorderLayout.NORTH);
        panel1.add(salir, BorderLayout.NORTH);
        this.add(txt_status, BorderLayout.SOUTH);
        this.add(txt_result, BorderLayout.CENTER);
        btn_clear.addActionListener(this);
        color.addActionListener(this);
        comillas.addActionListener(this);
        tamanio.addActionListener(this);
        abrir.addActionListener(this);
        guardar.addActionListener(this);
        salir.addActionListener(this);
        
    }
    public static void main(String args[]) {
        Editor v = new Editor();
        v.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    int suma;
   int entero;
    @Override
    
    public void actionPerformed(ActionEvent arg0) {
     
    
        if (arg0.getSource() == color) {
            txt_status.setText("Cambiando de color...");
            String texto = txt_result.getText();
            int colores;
            colores= Integer.parseInt(JOptionPane.showInputDialog("¿Qué color desea utilizar? \n"+
            "1.- Azul\n"+
            "2.- Rojo\n"+
            "3.- verde\n"+
            "4.- amarillo\n"+
            "5.- gris\n"+
            "6.- negro"));
            
            if(colores==1)
            {
            txt_result.setForeground(Color.blue);
            txt_status.setText("Color de texto cambiado a azul");
            }
            else if(colores==2)
            {
            txt_result.setForeground(Color.red);
            txt_status.setText("Color de texto cambiado a rojo");
            }
            else if(colores==3)
            {
            txt_result.setForeground(Color.green);
            txt_status.setText("Color de texto cambiado a verde");
            }
            else if(colores==4)
            {
            txt_status.setText("Color de texto cambiado a amarillo");
            txt_result.setForeground(Color.yellow);
            }
            else if(colores==5)
            {
            txt_status.setText("Color de texto cambiado a gris");
            txt_result.setForeground(Color.gray);
            }
            else if(colores==6)
            {
            txt_status.setText("Color de texto cambiado a negro");
            txt_result.setForeground(Color.black);
            }
        }
        if (arg0.getSource() == tamanio) {
            txt_status.setText("Cambiando Tamaño del texto...");
            int Tam;
            Tam= Integer.parseInt(JOptionPane.showInputDialog("¿Qué tamaño de texto quiere?"));
            txt_result.setFont(new Font("arial",Font.PLAIN,Tam));
            txt_status.setText("Color de texto cambiado a "+Tam);
        }
        if (arg0.getSource() == comillas) {
            txt_status.setText("agregando comillas...");
            String texto, parte;
            texto = txt_result.getText();
            parte=(txt_result.getSelectedText());
            txt_result.setText(texto.split(parte)[0]+"'"+"'"+parte+"'"+"'"+texto.split(parte)[1]);
            txt_status.setText("Comillas agregdas en: "+parte);
        }
        if (arg0.getSource() == abrir) {
            txt_status.setText("abriendo archivos...");
            File arc;
            FileInputStream entrada;
            String Nombre=JOptionPane.showInputDialog("Nombre del archivo");
            arc = new File(Nombre+".txt");
            String document = "";
            try {
                entrada = new FileInputStream(arc);
                int ascci;
                while ((ascci = entrada.read()) != -1) {
                    char caracter = (char) ascci;
                    document += caracter;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
          
            txt_result.setText(document);
            txt_status.setText("archivo "+Nombre+".txt abierto.");
              }

        if (arg0.getSource() == guardar) {
       txt_status.setText("guardando archivo...");
        File archivo;
        PrintWriter pintar;
        FileWriter escribir;
        String texto;
        String Nombre=JOptionPane.showInputDialog("Nombre del archivo");
        archivo = new File(Nombre+".txt");
        if(!archivo.exists())
        {
         try {
            archivo.createNewFile();
            texto = txt_result.getText();
            escribir= new FileWriter(archivo);
            pintar=new PrintWriter(escribir);
            pintar.print(texto);
            pintar.close();
          
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        txt_status.setText("archivo "+Nombre+".txt guardado.");
        }

        else
        {
            JOptionPane.showInputDialog("El archivo "+Nombre+".txt ya esxiste");
        }

          
              }
        if (arg0.getSource() == salir) {
            txt_status.setText("saliendo...");
            dispose();
          
        }
        isClicked = !isClicked;
    }
    
    /** 
     * Creación de los widgets
     */
    Button color;
    Button comillas;
    Button tamanio;
    Button abrir;
    Button guardar;
    Button salir;
    Button btn_click;
    Button btn_clear;
    TextField txt_status;
    Label lbl_msg;
    TextArea txt_result;
    Panel panel1;

    boolean isClicked;
}