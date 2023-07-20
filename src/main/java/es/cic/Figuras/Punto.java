package es.cic.Figuras;

import java.awt.Color;
import java.util.ArrayList;

import es.cic.Figura;
import es.cic.Lienzo;

public class Punto extends Figura
{

	public Punto(int x, int y, Color color)
	{
		super(x, y, color);
	}

	@Override
	public void dibujar() 
	{
		if( (this.x > Lienzo.ANCHURA ) || (this.y > Lienzo.ALTURA))
			return; //Controla que no salte excepción array fuera de limites

		this.coordenadas.add(this.x);
		this.coordenadas.add(this.y);
	}
}
