package Package1;

public class Clase1 {

	public static void main(String[] args) {	
		//Variables
		//Letras String y char
		//int doubles long short float
		//boolean true false
		/*String nombre = "Mario";
		char letra = 'a';
		
		int numero = 3;
		String numer2 = "4";
		
		int suma = numero + 1;
		System.out.println(suma);		
		String suma2 = numer2 +"b";
		
		/*if(suma >= 5) {		
			//Esta acción solo se ejecutara si la condicion del parentesis es verdadera
			System.out.println("El numero es mayor o igual que 5");
		}else {
			System.out.println("El numero es menor que 5");
		}*/
		
		/*for(int i = 1; i <= 100; i+=5) {			
			
			if(i%2 == 0) {
				System.out.print(i + " ");
				System.out.println("Es par");
			}else {
				System.out.print(i);
				System.out.println(" es impar");
			}
			
		}*/
		
		
		/*String nombre = "Mario";
		char nombreCaracteres[] = new char[5];
		char nombre2[] = {'J', 'u', 'a', 'n'};
		char letra = 'a';
		int  numero = 1000000;
		
		
		nombreCaracteres[0] = 'M';
		nombreCaracteres[1] = 'a';
		nombreCaracteres[2] = 'r';
		nombreCaracteres[3] = 'i';
		nombreCaracteres[4] = 'o';
			*/	
		//System.out.println(nombre);
		//System.out.println(nombre2);
		
		//System.out.println(nombreCaracteres);
		
		//System.out.println(nombreCaracteres[0]);
		//System.out.println(nombreCaracteres.length);
		
		/*for(int i = nombreCaracteres.length - 1 ; i >= 0; i --) {
			//System.out.print(i + " = ");
			System.out.print(nombreCaracteres[i]);
		}*/
		
		
		int arreglo[] = {45,5,7,4,19,78,1,9,10,23,2};
		int auxiliar = 0;
		 for(int a = 0; a<arreglo.length; a++) {			 
			 System.out.print(arreglo[a] + ", ");
		 }
		 System.out.println("   ");
		for(int i = 0; i<arreglo.length; i++) {
			for(int j = 0; j<arreglo.length-1; j++) {
				if(arreglo[j]>arreglo[j+1]) {
					auxiliar = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = auxiliar;
				}
				 for(int a = 0; a<arreglo.length; a++) {			 
					 System.out.print(arreglo[a] + ", ");
				 }
				 System.out.println("   ");
				
			}

			 
		}
		
		
	}

}
