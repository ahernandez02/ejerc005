package es.cic.Figuras;

import java.awt.Color;

import es.cic.Figura;

public class Linea extends Figura{

	private int longitud;
	
	public Linea(int x, int y, Color color, int longitud) 
	{
		super(x, y, color);
		this.longitud = longitud;
	}
	
	@Override
	public void dibujar() 
	{
		//A partir del centro de la línea:
		//ej. longitud 100px
		// <- -50 (x,y) +50 -> 
		
		
		
	}

}
