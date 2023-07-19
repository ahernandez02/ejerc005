package es.cic.Figuras;

import java.awt.Color;
import java.util.ArrayList;

import es.cic.Figura;

public class Punto extends Figura
{

	public Punto(int x, int y, Color color)
	{
		super(x, y, color);
	}

	@Override
	public void dibujar() 
	{
		this.coordenadas.add(this.x);
		this.coordenadas.add(this.y);
	}
}
