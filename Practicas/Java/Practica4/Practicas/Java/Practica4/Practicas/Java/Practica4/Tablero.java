package Practicas.Java.Practica4;
import java.awt.event.*;
import java.io.File;
import javax.swing.JOptionPane;
import java.awt.*;
public class Tablero extends Frame implements ActionListener{
    private static final long serialVersionUID = 1L;
 
    public Tablero() {
        super("Battleship");
        this.init();
        setBounds(400,200,500,300);
        this.setVisible(true);
        public void init() {
            isClicked = false;
          panel1 = new Panel();
          DireccionIp = new Button("Dirección IP");
          Directorios = new Button("Directorios");
          DocuPrin = new Button("Documento");
          TiempoC= new Button("Tiempo de carga");
          this.setLayout(new BorderLayout());
          this.add(panel1,BorderLayout.NORTH);
          this.setLayout(new BorderLayout());
          this.add(panel1,BorderLayout.NORTH);
          panel1.add(DireccionIp, BorderLayout.NORTH);
          panel1.add(Directorios, BorderLayout.NORTH);
          panel1.add(DocuPrin, BorderLayout.NORTH);
          panel1.add(TiempoC, BorderLayout.NORTH);
          txt_result = new TextArea();
          this.add(txt_result, BorderLayout.CENTER);
          DireccionIp.addActionListener(this);
          Directorios.addActionListener(this);
          DocuPrin.addActionListener(this);
          TiempoC.addActionListener(this);
           
           
    }
}
