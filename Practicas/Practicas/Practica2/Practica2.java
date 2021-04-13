package Practicas.Practicas.Practica2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practica2 extends JFrame {

   
    private static final long serialVersionUID = 1L;

    public Practica2() {
        componentesinit();
    }

    public void componentesinit() {

        this.setLayout(new BorderLayout());
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                paintContainerKeyPressed(e);
            }
        });

        color = new JButton("Cambio de color (A)");
        color.setFocusable(false);
        color.addActionListener(e -> colorActionPerformed(e));
        Boton = new JPanel();
        Boton.add(color);
        contenedor = new JPanel();
        contenedor.setPreferredSize(new Dimension(200, 400));
        Canvas = new Pintar();
        Canvas.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Canvas.setIsFigura("Circulo");
                paintContainerMouseClicked(e);
            }
        });
        Canvas.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                paintContainerMouseDragged(e);
            }
        });
        Canvas.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                paintContainerKeyPressed(e);
            }
        });

        this.add(Boton, BorderLayout.SOUTH);
        this.add(Canvas, BorderLayout.CENTER);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
    
    public void reiniciar(){
        cont = 0;
        } 
    

    private void colorActionPerformed(ActionEvent e) {
        int col;
        col= (int)(Math.random()*5)+1;
        switch(col)
        {
            case 1:
        Canvas.setIsFigura("verde");
        break;
            case 2:
        Canvas.setIsFigura("azul");
        break;
            case 3:
        Canvas.setIsFigura("rojo");
        break;
            case 4:
        Canvas.setIsFigura("amarillo");
        break;
            case 5:
        Canvas.setIsFigura("cyan");
        break;
        }
        JOptionPane.showMessageDialog(null, "Color cambiado, de click para ver el nuevo ");
    }
        
    
  
    private void paintContainerMouseClicked(MouseEvent e) {
        Canvas.setClicked();
        Canvas.repaint();
    }

    private void paintContainerMouseDragged(MouseEvent e) {
        if (!Canvas.isClicked()) {
            Canvas.setX(e.getX());
            Canvas.setY(e.getY());
        }else{
            Canvas.setW(e.getX());
            Canvas.setH(e.getY());
            }
            Canvas.repaint();
        }
    
    private void paintContainerKeyPressed(KeyEvent e) {
        if (!Canvas.isClicked()) {
            switch (e.getKeyCode()) {
                case 'a':
                case 'A':
                   color.doClick();
                    break;
                default:
                    break;
            }
        }
    }
    JButton color;
    JPanel  Boton;
    Pintar Canvas;
    JPanel contenedor;
    int cont = 0;
}