package Package1;

public class Zoologico {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro("Mamifero", false ,"Rex", 4, "Pastor Aleman");
		//perro1.hablar();
		Perro perro2 = new Perro("Mamifero", false ,"firulais", 6, "French Puddle");
		//perro2.hablar();
		Perro perro3 = new Perro("Mamifero", false);
		perro3.nombre = "Rex3";
		//perro3.hablar();
		Animal perro4 = new Perro("Mamifero", false);
		Animal pajaro = new Pajaro("Ave", true, 2);
		Pajaro pajaro1 = new Pajaro("Ave", true, 4);
		
		Pajaro.presentaion(pajaro);
		Pajaro.presentaion(pajaro1);
		
		
		
		/*System.out.println("Mi edad es " + perro1.getEdad());
		perro1.setEdad(2);
		//System.out.println("Mi edad es " + perro1.getEdad());
		
		Perro.presentaion(perro1);
		Perro.presentaion(perro3);
		Perro.presentaion(perro2);
		*/
		
	}

}
