package es.cic;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.awt.Color;
import java.io.IOException;

import es.cic.Figuras.Circulo;
import es.cic.Figuras.Cuadrado;
import es.cic.Figuras.Linea;
import es.cic.Figuras.Punto;



class LienzoIntegrationTest {

	private Lienzo cut;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		this.cut = new Lienzo();
	}
	
	@Test 
	void dibujarPunto()
	{
		Punto pt = new Punto(500, 850, new Color(255, 0, 0));
		this.cut.dibujar(pt);	
		
		//Comprueba lista figuras
		assertThat(this.cut.getFiguras().contains(pt), is(true));
		
		//Comprueba lienzo
		assertThat(this.cut.getLienzo()[pt.x][pt.y], not(0));
	}
	
	@Test
	void testMostrarLienzo() throws IOException 
	{
		Punto pt = new Punto(500, 850, new Color(255, 0, 0));
		this.cut.dibujar(pt);	
		Linea l = new Linea(500,800, new Color(0,255,0), 500);
		this.cut.dibujar(l);
		Cuadrado c = new Cuadrado(500, 200, new Color(0,0,255), 10_000);
		this.cut.dibujar(c);
		Circulo circ = new Circulo(500,500, new Color(255,0,0), 100);
		this.cut.dibujar(circ);
		
		this.cut.mostrar();
	}
	
	/*
	@Test
	void testMostrarLienzoConFiguraFueraDeLimite() throws IOException 
	{
		Cuadrado c = new Cuadrado(100,500, new Color(255,0,0), 250_000);
		this.lienzo.dibujarEnLienzo(c);
		
		this.lienzo.mostrarLienzo();
	}
	*/
	

}
