package Practicas;
import java.awt.Frame;
import java.awt.event.*;


public class Pantalla extends Frame implements  KeyListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Contenedor obj_pintable;

    public Pantalla() {
        initComponents();
    }

    public void initComponents() {
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        obj_pintable = new Contenedor();
    
        obj_pintable.addKeyListener(this);
        this.addKeyListener(this);
        this.add(obj_pintable);

        this.setSize(1024,435);
        this.setVisible(true);
    }

    public static void main(String args[]) {
        Pantalla p = new Pantalla();
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("Presionando " + arg0.getKeyChar());
        if (!obj_pintable.isClicked()) {
            switch(arg0.getKeyChar()) {
                case 'd':
                case 'D':
                    obj_pintable.setX(obj_pintable.getX() + 1);
                    obj_pintable.tick();
                    break;
                case 'a':
                case 'A':
                    obj_pintable.setX(obj_pintable.getX() - 1);
                    obj_pintable.tick();
                    break;
                case 'w':
                case 'W':
                    obj_pintable.setY(obj_pintable.getY() - 1);

                    break;
                case 's':
                case 'S':
                    obj_pintable.setY(obj_pintable.getY() + 1);
                    break;

            }
            obj_pintable.repaint();
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
