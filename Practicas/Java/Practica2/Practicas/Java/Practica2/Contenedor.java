package Practicas.Java.Practica2;
import java.awt.*;

public class Contenedor extends Canvas{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String str;
    private int x, y;
    private int w, h;
    private Image redr;
    private Image rombo;
    private boolean isClicked;
    private String isFigura;

    public Contenedor() {
        x = 750;
        y = 250;
        w = 300;
        h = 220;
        str="Messi";
        isClicked = false;
        String Rom="recursos/rombo.png";
        rombo=Toolkit.getDefaultToolkit().getImage(Rom);
        String Rs="recursos/red.png";
        redr=Toolkit.getDefaultToolkit().getImage(Rs);
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
                    g.drawString(str, x+8, y+14);
                    break;
                    case "azul":
                    g.setColor(Color.blue);
                    g.fillArc(x, y, 50, 50,0,360);
                    g.drawString(str, x+8, y+14);
                    break;
                    case "rojo":
                    g.setColor(Color.red);
                    g.fillArc(x, y, 50, 50,0,360);
                    g.drawString(str, x+8, y+14);
                    break;
                    case "amarillo":
                    g.setColor(Color.yellow);
                    g.fillArc(x, y, 50, 50,0,360);
                    g.drawString(str, x+8, y+14);
                    break;
                    case "cyan":
                    g.setColor(Color.cyan);
                    g.fillArc(x, y, 50, 50,0,360);
                    g.drawString(str, x+8, y+14);
                    break;
                    
        }
        
             } catch (Exception e) {}
                 
     
    
     g.drawImage(redr, 0, 0, 500,400, this);
     g.drawImage(rombo, 600, 0, 380,350, this);
     g.drawArc(x, y, 50, 50,0,360);
     g.setColor(Color.GRAY);
     g.drawString(str, x+8, y+14);
     
    
    }
    
    public int getstr() {
        return str;
    }

    public void setstr(String str) {
        this.str = str;
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
