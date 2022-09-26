package Package1;

public class Pajaro extends Animal {
	int numAlas;

	public Pajaro(String familia, boolean alas,int numAlas) {
		super(familia, alas);
		this.numAlas = numAlas;
	}

	
public static void presentaion(Pajaro pajaro) {
		
		System.out.println("Soy un pajaro y tengo " + pajaro.numAlas + " alas");
	}
}
