package isi.died.tp.estructuras;

import isi.died.tp.estructuras.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArbolBinarioBusquedaTest {
	
	private  ArbolBinarioBusqueda<Integer> abb1, abb2;
	
	
	@Before
	
	public void preTest() {
	
	abb1 = new ArbolBinarioBusqueda<>(35);
	abb1.agregar(30);
	abb1.agregar(20);
	abb1.agregar(40);
	abb1.agregar(15);
	
	//abb2.agregar...
	
	}
	@Test
	public void testContiene() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsArbolOfE() {
		fail("Not yet implemented");
	}

	@Test
	public void testAgregar() {
		fail("Not yet implemented");
	}

	@Test
	public void testProfundidad() {
		fail("Not yet implemented");
	}

	@Test
	public void testCuentaNodosDeNivel() {
		fail("Not yet implemented");
	}

	@Test
	public void testEsCompleto() {
		fail("Not yet implemented");
	}

	@Test
	public void testEsLleno() {
		fail("Not yet implemented");
	}
	
	

}
