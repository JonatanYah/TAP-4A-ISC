package Practicas.Java.Practica2; 
import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class Pantalla extends JFrame implements MouseListener, MouseMotionListener, KeyListener{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public Contenedor obj_pintable;
    public JButton btnColor;
    public JButton btnTexto;
    public int maxX;
    public int maxY;
    public Pantalla() {
        initComponents();
    }

    public void initComponents() {
        maxX=1100;
        maxY=650;
        this.setLayout(new BorderLayout());
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        obj_pintable = new Contenedor();
        btnColor = new JButton();
        btnColor.setBounds(490,390,50,50);
        ImageIcon b= new ImageIcon("recursos/bcolor.png");
        btnColor.setSize(140,139);
        btnColor.setIcon(new ImageIcon(b.getImage().getScaledInstance( btnColor.getWidth(), btnColor.getHeight(),Image.SCALE_SMOOTH)));
        btnTexto = new JButton();
        btnTexto.setBounds(490,390,50,50);
        ImageIcon t= new ImageIcon("recursos/btexto.png");
        btnTexto.setSize(140,139);
        btnTexto.setIcon(new ImageIcon(t.getImage().getScaledInstance( btnTexto.getWidth(), btnTexto.getHeight(),Image.SCALE_SMOOTH)));
        Panel panel1= new Panel();
        btnTexto.addActionListener(e -> btnTextoActionPerformed(e));
        btnColor.addActionListener(e -> btnColorActionPerformed(e));
        btnColor.addMouseMotionListener(this);
        obj_pintable.addMouseListener(this);
        obj_pintable.addMouseMotionListener(this);
        obj_pintable.addKeyListener(this);
        this.addKeyListener(this);
        this.add(obj_pintable, BorderLayout.CENTER);
        this.add(panel1, BorderLayout.SOUTH);
        panel1.add(btnColor);
        panel1.add(btnTexto);
        this.setSize(1000,650);
        this.setVisible(true);
    }

    public static void main(String args[]) {
        Pantalla p = new Pantalla();
    }
    private void collisionChek()
    {
        if(obj_pintable.getX() <= 440 && obj_pintable.getY() <= 350 )
        {
            maxX=440;
            maxY=350;
        }
            if(obj_pintable.getX() >= maxX)
            {
                obj_pintable.setX(maxX);
            }

            if(obj_pintable.getY() >= maxY)
            {
                obj_pintable.setY(maxY);
            }
            
        
       
    }
    private void btnTextoActionPerformed(ActionEvent e) {
        String Nombre=JOptionPane.showInputDialog("Escriba el texto");
        obj_pintable.setstr(Nombre);
    }
  private void btnColorActionPerformed(ActionEvent e) {
        int col;
        col= (int)(Math.random()*5)+1;
        switch(col)
        {
            case 1:
         obj_pintable.setIsFigura("verde");
        break;
            case 2:
        obj_pintable.setIsFigura("azul");
        break;
            case 3:
         obj_pintable.setIsFigura("rojo");
        break;
            case 4:
         obj_pintable.setIsFigura("amarillo");
        break;
            case 5:
         obj_pintable.setIsFigura("cyan");
        break;
        }
        JOptionPane.showMessageDialog(null, "Color cambiado, de click para ver el nuevo ");
    }
    @Override
    public void mouseClicked(MouseEvent arg0) {
        System.out.println("Clicked");
        if (obj_pintable.isClicked()) {
            obj_pintable.setW(arg0.getX());
            obj_pintable.setH(arg0.getY());
            obj_pintable.repaint();
        } 
        //else {
          //  obj_pintable.setX();
            //obj_pintable.setY();
        //}
        obj_pintable.setClicked();
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("Entrando");
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("Saliendo");
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("Presionado");
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("Liberado");
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        if(!obj_pintable.isClicked()) {
            obj_pintable.setX(arg0.getX());
            obj_pintable.setY(arg0.getY());
            collisionChek();
            obj_pintable.repaint();
        }
        
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
        System.out.println("Mover");
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("Presionando " + arg0.getKeyChar());
        if (!obj_pintable.isClicked()) {
            switch(arg0.getKeyChar()) {
                case 'a':
                case 'A':
                    int col;
        col= (int)(Math.random()*5)+1;
        switch(col)
        {
            case 1:
         obj_pintable.setIsFigura("verde");
        break;
            case 2:
        obj_pintable.setIsFigura("azul");
        break;
            case 3:
         obj_pintable.setIsFigura("rojo");
        break;
            case 4:
         obj_pintable.setIsFigura("amarillo");
        break;
            case 5:
         obj_pintable.setIsFigura("cyan");
        break;
        }
        JOptionPane.showMessageDialog(null, "Color cambiado, de click para ver el nuevo ");
            }
           
            obj_pintable.repaint();
        }
        if (!obj_pintable.isClicked()) {
            switch(arg0.getKeyChar()) {
                case 's':
                case 'S':
        String Nombre=JOptionPane.showInputDialog("Escriba el texto");
        obj_pintable.setstr(Nombre);
        obj_pintable.repaint();
        break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("Liberando " + arg0.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("Tecleada: " + arg0.getKeyChar());
    }
}

