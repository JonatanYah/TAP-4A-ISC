package Practicas.Practicas.Practica2;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author molin
 */
public class Pintar extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int x, y;
    private int w, h;
    private String isFigura;
    boolean isClicked;

    public Pintar() {
        x = y = 100;
        w = h = 40;
    }

    @Override
    public void paintComponent(Graphics u) {
        super.paintComponent(u);
        try {
                    switch (isFigura) {
                    case "Circulo":
                    u.setColor(Color.green);
                    u.fillOval(x, y, w, h);
                    break;
                    case "verde":
                    u.setColor(Color.green);
                    u.fillOval(x, y, w, h);
                    break;
                    case "azul":
                    u.setColor(Color.blue);
                    u.fillOval(x, y, w, h);
                    break;
                    case "rojo":
                    u.setColor(Color.red);
                    u.fillOval(x, y, w, h);
                    break;
                    case "amarillo":
                    u.setColor(Color.yellow);
                    u.fillOval(x, y, w, h);
                    break;
                    case "cyan":
                    u.setColor(Color.cyan);
                    u.fillOval(x, y, w, h);
                    break;
              
              
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void update(Graphics g) {
        super.update(g);
        paintComponent(g);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Pintar(LayoutManager layout) {
        super(layout);
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public String getIsFigura() {
        return isFigura;
    }

    public void setIsFigura(String isFigura) {
        this.isFigura = isFigura;
    }

    public boolean isClicked() {
        return isClicked;
    }

    public void setClicked() {
        this.isClicked = !this.isClicked;
    }
}
