package es.cic;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.cic.Figuras.Punto;

class LienzoTest {

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
		Punto pt1 = new Punto(500, 500, new Color(255, 0, 0)); 
		this.lienzo.dibujarEnLienzo(pt1);
		Punto pt2 = new Punto(505, 500, new Color(0, 255, 0));
		this.lienzo.dibujarEnLienzo(pt2);
		Punto pt3 = new Punto(510, 500, new Color(0, 0, 255));
		this.lienzo.dibujarEnLienzo(pt3);
		
		this.lienzo.mostrarLienzo();
	}
	

}
