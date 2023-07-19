package es.cic;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Lienzo 
{
	private final int ALTURA = 1000;
	private final int ANCHURA = 1000;
	private final int COLOR_LIENZO_DEFAULT = new Color(255, 255, 255).getRGB();
	
	//Equivalente a los pixeles de la imagen que cuando se dibujen se volcara sobre la img
	private int[][] lienzo;
	private ArrayList<Figura> figuras;
	
	public Lienzo()
	{
		this.figuras = new ArrayList<Figura>();
		this.lienzo = new int[ALTURA][ANCHURA];
	}
	

	public void dibujarEnLienzo(Figura figura)
	{
	  //Hace el calculo de las coordenadas según la figura.
	  figura.dibujar();
	  
	  //Añade la figura al array de figuras
	  this.figuras.add(figura);
	  
	  //Actualiza el array del lienzo 
	  //TODO: Hacer la excepción que controle que la longitud del array sea par
	  for (int i = 0; i < figura.coordenadas.size(); i += 2) 
	  {
		this.lienzo[figura.coordenadas.get(i)][figura.coordenadas.get(i + 1)] = figura.color;
	  }
	}
	
	public void mostrarLienzo() throws IOException
	{				
		BufferedImage image = new BufferedImage(ALTURA, ANCHURA, BufferedImage.TYPE_INT_RGB);
		
		//Se escriben los pixeles en la imagen y se guarda
	 
		for (int i = 0; i < image.getHeight(); i++) 
	    {
	      for (int j = 0; j < image.getWidth(); j++) 
	      { 
	       if(this.lienzo[i][j] == 0)
	    	   image.setRGB(i, j, COLOR_LIENZO_DEFAULT);  
	       else 
	    	   image.setRGB(i, j, this.lienzo[i][j] /*Debe contener un valor rgb*/);  
	      }
	    }
		
		File outputfile = File.createTempFile("lienzo", ".png");
		ImageIO.write(image, "png", outputfile);
	}
	
	
}
