package es.cic.Figuras;

import static java.lang.Math.sqrt;
import static java.lang.Math.floor;
import static java.lang.Math.ceil;
import java.awt.Color;
import es.cic.Figura;
import es.cic.Lienzo;


public class Cuadrado extends Figura {
	
	private int area;

	public Cuadrado(int x, int y, Color color, int area) 
	{
		super(x, y, color);
		this.area = area;
	}

	@Override
	public void dibujar() 
	{
		if( (this.x > Lienzo.ANCHURA ) || (this.y > Lienzo.ALTURA))
			return;
		
		int l = (int)floor(sqrt(area));
		int h = (int)floor(l/2);
	
		for (int i = 0; i < h; i++) 
		{	
			for (int j = 0; j < Math.floor(l / 2); j++) 
			{
				if(!(this.x + j > Lienzo.ANCHURA) && !(this.y + h > Lienzo.ALTURA))
				{
					//Pos
					this.coordenadas.add(this.x + j);
					this.coordenadas.add(this.y + i);
					
					this.coordenadas.add(this.x + j);
					this.coordenadas.add(this.y - i);
				}
				if(!(this.x - j < 0) && !(this.y + h > Lienzo.ALTURA))
				{
					//Neg
					this.coordenadas.add(this.x - j);
					this.coordenadas.add(this.y + i);
					
					this.coordenadas.add(this.x - j);
					this.coordenadas.add(this.y - i);
				}
			}
		} 
	}

}
