package Practicas.Practicas.Practica1;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.*;

public class Main {
    public static void main(String args[]) {
        CalculadoraGUI v = new CalculadoraGUI("XD");
        v.addWindowListener(new WindowListener(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowOpened(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowActivated(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // TODO Auto-generated method stub
                
            }
        });
    }
}
