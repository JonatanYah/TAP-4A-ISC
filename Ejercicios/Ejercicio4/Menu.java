package Ejercicios.Ejercicio4;
import java.awt.Frame;
import java.awt.event.*;
public class Menu extends Frame implements ActionListener{
    public Menu(){
        initComponents();
    }
    public void initComponents() {
    this.addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
    });
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
