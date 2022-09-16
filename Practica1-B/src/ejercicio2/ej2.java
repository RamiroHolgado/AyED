package ejercicio2;

import java.util.Scanner;

public class ej2 {

	public static void generarArreglo(int n) {
		int [] a = new int [n+1];
		for (int i = 1; i < a.length; i++) {
			a[i] = n * i;
			System.out.print(a[i] + " ");
		}		
	}
	
	public static void generadorDeArreglos() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n != 0) {
			generarArreglo(n);
			System.out.println();
			n = s.nextInt();
		}
		s.close();
	}


	public static void main(String[] args) {
		generadorDeArreglos();
	}

}
