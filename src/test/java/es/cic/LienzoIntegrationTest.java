package es.cic;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.cic.Figuras.Cuadrado;
import es.cic.Figuras.Linea;
import es.cic.Figuras.Punto;

class LienzoIntegrationTest {

	private Lienzo lienzo;
	
	@BeforeEach
	void setUp() throws Exception 
	{
		this.lienzo = new Lienzo();
	}
	
	/*
	@Test
	void testDibujarPunto() {
		fail("Not yet implemented");
	}
	@Test
	void testDibujarLinea() {
		fail("Not yet implemented");
	}
	
	void testDibujarCuadrado() {
		fail("Not yet implemented");
	}
	
	void testDibujarCirculo() {
		fail("Not yet implemented");
	}
	*/
	
	@Test
	void testMostrarLienzo() throws IOException 
	{
		Punto pt3 = new Punto(500, 850, new Color(255, 0, 0));
		this.lienzo.dibujarEnLienzo(pt3);	
		Linea l = new Linea(500,800, new Color(0,255,0), 500);
		this.lienzo.dibujarEnLienzo(l);
		Cuadrado c = new Cuadrado(500,500, new Color(0,0,255), 250_000);
		this.lienzo.dibujarEnLienzo(c);
		
		this.lienzo.mostrarLienzo();
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
