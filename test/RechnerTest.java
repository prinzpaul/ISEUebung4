package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

import uk.co.placona.helloWorld.HelloWorld;

public class RechnerTest {
	public Rechner hi;
	@Test
	public void testrechnen(){
		hi = new Rechner();
		int sol = addiere(1,3);
		assertequals(4, sol);
	}
	@Test
	public void testrechnerr(){
		hi = new Rechner();
		int sol = faku(5);
		assertequals(120, sol);
	}
	@Test
	public void testrechne(){
		hi = new Rechner();
		int sol = sub(1,3);
		assertequals(-2, sol);
	}
}
