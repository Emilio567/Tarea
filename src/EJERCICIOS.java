/**
 * @author EMILIO
 */


import java.util.Scanner;

public class EJERCICIOS {
	public static void main(String[] args) {

		double pesofinal;
		int edad;
		double peso;

		Scanner in = new Scanner(System.in);
		
		System.out.println("Hola cuantos anos tienes?");
		edad = in.nextInt();
		
		System.out.println("Con " + edad + " anos cuanto pesas?");
		peso = in.nextDouble();
		
		System.out.println("El ano que viene tienes " + (edad + 1));
		pesofinal = peso % 10;
		
		System.out.println("Tienes que bajar a un 10% que seria: " + pesofinal);
		
		System.out.println("Por lo que seria: "+ (peso-pesofinal));

	}
}
