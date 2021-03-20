package Ejercicios.Ejercicio6;

import java.awt.*;

public class Contenedor extends Canvas{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int x, y;
    private int w, h;
    private boolean isClicked;

    public Contenedor() {
        x = 30;
        y = 30;
        isClicked = false;
    }

    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(x, y, (int)(w * 0.30), (int)(h * 0.15));
        g.setColor(Color.black);
        g.fillOval(x + 10, y + 5, (int)(w * 0.04), (int)(h * 0.04));
        g.setColor(Color.black);
        g.fillOval(x + 10, y + 20, (int)(w * 0.04), (int)(h * 0.04));
        g.setColor(Color.red);
        g.fillOval((int)(Math.random()*500),(int)(Math.random()*500),(int)(w * 0.08), (int)(h * 0.08));
        
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

    public boolean isClicked() {
        return isClicked;
    }

    public void setClicked() {
        this.isClicked = !this.isClicked;
    }
}