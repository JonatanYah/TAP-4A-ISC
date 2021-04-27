package Ventana;
import Directorio.Directorios;
import informacionweb.ip.DireccionIp;
import informacionweb.Informacionweb;
import tiempoCarga.TiempoCarga;
import java.util.Arrays;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import org.jsoup.nodes.Document;
public class Venta extends Frame implements ActionListener{

    
    
    
     private static final long serialVersionUID = 1L;
 
    public Venta() {
        super("Información Web");
        this.init();
        setBounds(400,200,500,300);
        this.setVisible(true);
        
         
    }
      public void init() {
           isClicked = false;
         panel1 = new Panel();
         DireccionIp = new Button("Dirección IP");
         Directorios = new Button("Directorios");
         DocuPrin = new Button("Documento");
         TiempoC= new Button("Tiempo de carga");
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
       @Override
      public void actionPerformed(ActionEvent arg0) {
           if (arg0.getSource() == DireccionIp) {
               String host = "itescam.edu.mx";
        DireccionIp ip = new DireccionIp();
        txt_result.setText("Dirección IP: \n"+ip.direccion(host));
           }
             if (arg0.getSource() == Directorios) {
        String host = "https://itescam.edu.mx";
        Directorios dir = new Directorios();
        txt_result.setText("Los directorios son: \n"+Arrays.toString(dir.directoriosExtistentes(host)));
       //System.out.println(dir.getTam());
           }
          if (arg0.getSource() == DocuPrin) {
        String host = "https://itescam.edu.mx";
        Informacionweb i =new Informacionweb();
        String html;
            Document a =(i.gethtml(host));
           String f= a.toString();
            txt_result.setText("Documento principal: \n"+f);
         // html= Document.toString(a);
           }
               if (arg0.getSource() == TiempoC) {
        String host = "https://itescam.edu.mx";
        TiempoCarga t = new TiempoCarga();
       double a=(t.carga(host));
        String f= Double.toString(a);
        txt_result.setText("Tiempo de carga :"+f+" Segundos");
           }
      }
   
    
    
  Panel panel1;
  boolean isClicked;  
  Button DireccionIp;
  Button Directorios;
  Button DocuPrin;
  Button TiempoC;
  TextArea txt_result;
}
