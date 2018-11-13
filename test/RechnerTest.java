package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import rechner.Rechner;

public class RechnerTest {
	public Rechner hi = new Rechner();
	@Test
	public void testrechnen(){
		int sol = addiere(1,3);
		assertequals(4, sol);
	}
	@Test
	public void testrechnerr(){
		int sol = faku(5);
		assertequals(120, sol);
	}
	@Test
	public void testrechne(){
		int sol = sub(1,3);
		assertequals(-2, sol);
	}
}
