package ControlComunicacion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class player extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;
	private BufferedImage cuadricula;
	private Object[][] array;
	public static final int X = 54; 
	public static final int Y = 56; // 
	public static final int titulo = 47;
	public static final int borde = 5; 
	private volatile boolean isTurn;
	private boolean state;

	public player() {
		this(new Object[10][10], "gridLabels.png");
	}
	public player(Object[][] arr) {
		this(arr, "gridLabels.png");
	}

	
	public player(Object[][] arr, String path) {
		array = arr;
		isTurn = true;
		state = false;
		
		setBackground(Color.blue);
		setPreferredSize(new Dimension((X+ arr.length + 1 + ((titulo+borde)*array.length)), 
				Y+ arr.length + 1 + ((titulo+borde)*array.length)));
		setSize(getPreferredSize());
		setLocation(0,0);

		try {
			cuadricula = ImageIO.read(new File(path));
		} catch (IOException e) {
			System.out.println("Failed to load image");
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.drawImage(cuadricula, 0, 0, this);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
			
				if (array[i][j].equals((Object) 1) || ((array[i][j]).getClass().getName().equals("ShipPiece")
						&& !((BarcoP) array[i][j]).Destruido())) {
			
					g2.setColor(Color.gray);
					g2.fillRect(X + i + 1 + ((titulo + borde) * i), Y + j + 1 + ((titulo + borde) * j),
							titulo+(borde/2)-1, titulo+(borde/2)-1);
				
				} else if ((array[i][j]).getClass().getName().equals("ShipPiece")) {
					
					g2.drawImage(((BarcoP) array[i][j]).getImagen(),
							X + i + ((titulo + borde) * i) + borde/2,
							Y + j + ((titulo + borde) * j) + borde/2, this);
				}
			}
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {

		if (isTurn && e.getButton() == MouseEvent.BUTTON1) {

			int value = e.getX();
			int counter1 = 0;
			while (X + ((titulo + borde) * counter1) + borde < value) {
				counter1++;
			}
			counter1--;

		
			int value2 = e.getY() - (borde / 2);
			int counter2 = 0;
			while (Y + ((titulo + borde) * counter2) + borde < value2) {
				counter2++;
			}
			counter2--;

		
			if (counter1 < array.length && counter1 >= 0) {
				if (counter2 < array[0].length && counter2 >= 0) {
					if (array[counter1][counter2].equals((Object) 1)) {
						array[counter1][counter2] = 0;
						repaint();
						isTurn = false;
					} else if ((array[counter1][counter2]).getClass().getName().equals("ShipPiece")
							&& !((BarcoP) array[counter1][counter2]).Destruido()) {
						((BarcoP) array[counter1][counter2]).destruir();
						repaint();
						// Fin
						isTurn = false;
					}
					state = false;
				}
			}
		}else if(!isTurn && e.getButton() == MouseEvent.BUTTON1){
			state = true;
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	public boolean isTurn() {
		return isTurn;
	}
	public void setTurn(boolean t) {
		isTurn = t;
	}
	public Object[][] getArray() {
		return array;
	}
	public void setArray(Object[][] arr) {
		array = arr;
	}
	
	public boolean getState(){
		return state;
	}
	
	public void setState(boolean s){
		state = s;
	}

}
