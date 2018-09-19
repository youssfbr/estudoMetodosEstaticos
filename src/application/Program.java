package application; 

/*
 * Fazer um programa para ler um valor num�rico qualquer, e da� mostrar quanto seria o valor de um circunferencia e do volume
 * de uma esfera para um raio daquele valor. Informar tamb�m  o valor de PI com duas casas decimais.
 * 
 * Vers�o 3: Classe Calculator com m�todo est�tico.
 * */

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
		
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
	}
}
