package Practicas.Practicas.Practica2;


import java.awt.*;

public class Contenedor extends Canvas{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private int x, y;
    private int w, h;
    private boolean isClicked;
    private String isFigura;

    public Contenedor() {
        x = 250;
        y = 270;
        w = 300;
        h = 220;
        isClicked = false;
    }

    public void paint(Graphics g) {
         super.paint(g);
        try {
            switch (isFigura) {
                    case "Circulo":
                    g.setColor(Color.GRAY);
                    g.fillArc(x, y, 50, 50,0,360);
                    break;
                    case "verde":
                    g.setColor(Color.GREEN);
                    g.fillArc(x, y, 50, 50,0,360);
                    break;
                    case "azul":
                    g.setColor(Color.blue);
                    g.fillArc(x, y, 50, 50,0,360);
                    break;
                    case "rojo":
                    g.setColor(Color.red);
                    g.fillArc(x, y, 50, 50,0,360);
                    break;
                    case "amarillo":
                    g.setColor(Color.yellow);
                    g.fillArc(x, y, 50, 50,0,360);
                    break;
                    case "cyan":
                    g.setColor(Color.cyan);
                    g.fillArc(x, y, 50, 50,0,360);
                    break;
                    
        }
        
             } catch (Exception e) {}
                 
  
        g.setColor(Color.RED);
        g.fillRect(10, 100, 200, 300);
        g.setColor(Color.gray);
        g.drawRect(10,100,200,300);
   
        g.setColor(Color.white);
        g.drawRect(220, 260, 150, 120);
        g.setColor(Color.BLACK);
        g.drawRect(220, 260, 150, 120);
    
        g.setColor(Color.GRAY);
        g.drawArc(x, y, 50, 50,0,360);
      
    
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
   public void setIsFigura(String isFigura) {
        this.isFigura = isFigura;
    }
    public void setClicked() {
        this.isClicked = !this.isClicked;
    }
}
