package es.cic.Figuras;

import java.awt.Color;

import es.cic.Figura;
import es.cic.Lienzo;

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
		if( (this.x > Lienzo.ANCHURA ) || (this.y > Lienzo.ALTURA))
			return;
		
		for (int i = 0; i < Math.floor(longitud / 2); i++) 
		{
			//Pos
			if( !(this.x + 1 > Lienzo.ANCHURA))
			{
				this.coordenadas.add(this.x + i);
				this.coordenadas.add(this.y);
			}
			//Neg
			if(!(this.x - 1 < 0))
			{
				this.coordenadas.add(this.x - i);
				this.coordenadas.add(this.y);
			}
		}	
	}

}
