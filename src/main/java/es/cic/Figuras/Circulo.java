package es.cic.Figuras;

import static java.lang.Math.pow;

import java.awt.Color;

import es.cic.Figura;
import es.cic.Lienzo;

public class Circulo extends Figura 
{
	private int radio;
	
	public Circulo(int x, int y, Color color, int radio) 
	{
		super(x, y, color);
		this.radio = radio;
	}

	@Override
	public void dibujar() 
	{	
		
		for (int i = 0; i < radio; i++) 
		{
			for (int j = 0; j < radio; j++) 
			{
				if(estaDentroDeCirculo(this.x + i, this.y + j))
				{
					this.coordenadas.add(this.x + i);
					this.coordenadas.add(this.y + j);
					
					this.coordenadas.add(this.x - i);
					this.coordenadas.add(this.y + j);
					
					this.coordenadas.add(this.x + i);
					this.coordenadas.add(this.y - j);
					
					this.coordenadas.add(this.x - i);
					this.coordenadas.add(this.y - j);
				}
			}
		}
	}
	
	private boolean estaDentroDeCirculo(int x, int y)
	{
		/**************************************************
		 * 
		 * Comprueba si se cumple:
		 * (x)^2 + (y)^2 <= r^2 
		 *        
	     *************************************************/
		
		int r = (int) pow(this.radio, 2);
		x =  (int) pow (x - this.x, 2);
		y = (int) pow (y - this.y, 2);
		
		return (x + y) <= r ;
	}

}
