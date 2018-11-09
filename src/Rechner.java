package uk.co.placona.helloWorld;

public class Rechner {

	public int addiere(int a, int b) {
		int c = a+b;
		return c;
	}
	public int faku(int i) {
		if(i == 1) {
			return i;
		}
		else{
			return i*faku(i-1);
		}
	}
	public int sub(int i, int v) {
		int c = i-v;
		return c;
	}

}
