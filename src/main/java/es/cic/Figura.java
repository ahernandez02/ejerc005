package es.cic;

import java.awt.Color;
import java.util.ArrayList;

import java.util.List;
import java.util.UUID;

public abstract class Figura 
{
	//ID
	protected final String ID = UUID.randomUUID().toString();
	//Centro
	protected int x;
	protected int y;	
	//Guarda cada una de las posiciones de la figura sobre el lienzo,
	//de forma que cada 2 posiciones sera un par de x&y
	//Si su longitud divida entre 2 no es 0 lanzar una excepción
	protected ArrayList<Integer> coordenadas;
	//Color
	protected int color;
	
	public Figura(int x, int y, Color color)
	{
		this.x = x;
		this.y = y;
		this.color = color.getRGB();
		this.coordenadas = new ArrayList<Integer>();
	}
	/**
	 * Calcula los valores para el array de coordenadas n = x, n + 1 = y
	 */
	public abstract void dibujar();
}
