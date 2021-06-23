package Logica;

import java.awt.Point;
import java.util.ArrayList;
import ControlComunicacion.BarcoP;
public class Barco {

	private BarcoP[] piezas;
	private Point posicioninicial;


	Barco(BarcoP[] list) {
		piezas = list;
		posicioninicial = new Point(0,0);
	}
	
	Barco(ArrayList<BarcoP> list){
		piezas = list.toArray(new BarcoP[0]);
		posicioninicial = new Point(0,0);
	}
	public boolean acabado() {
		boolean isDead = true;
		for (int i = 0; i < piezas.length; i++) {
			if (!piezas[i].Destruido()) {
				isDead = false;
			}
		}
		return isDead;
	}
	public BarcoP[] getpiezas() {
		return piezas;
	}
	
	public void setStartingOffGridPosition(Point sp){
		posicioninicial = sp;
	}
	
	public Point getStartingOffGridPosition(){
		return posicioninicial;
	}
}