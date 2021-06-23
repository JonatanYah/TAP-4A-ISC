package ControlComunicacion;
import java.awt.*;
import javax.swing.ImageIcon;

public class BarcoP {
	private Image barcovivo;
	private boolean destruido;
	boolean jugador;


	public BarcoP(boolean jugador) {
		this.jugador = jugador;
	
	
			barcovivo = new ImageIcon("Player1.png").getImage();
		
	}

	public void setImagen(String file) {
		barcovivo = new ImageIcon(file).getImage();

	}

	/*
	 * devuelve la imagen de la pieza del barco
	 */
	public Image getImagen() {
		return barcovivo;
	}

	public void destruir() {
		destruido = true;
		if (jugador) {
			setImagen("Player1Hit.png");
		} else {
			setImagen("Player2Hit.png");
		}
	}
	public boolean Destruido() {
		return destruido;
	}

}
