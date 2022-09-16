package ejercicio1;

public class ej1 {

	public static void metodoFor(int a, int b) {
		int ini,fin;
		if (a <= b) {
			ini = a;
			fin = b;
		}else {
			ini = b;
			fin = a;
		}
		for (int i = ini; i <= fin; i++) {
			System.out.println("Metodo for: " + i);
		}
		
	}

	public static void metodoWhile(int a, int b) {
		int ini,fin;
		if (a <= b) {
			ini = a;
			fin = b;
		}else {
			ini = b;
			fin = a;
		}
		while (ini <= fin) {
			System.out.println("Metodo while: " + ini);
			ini++;
		}
	}

	public static void metodoSinEstructura(int a, int b) {
		int ini = 0;
		int fin = -1;
		if (a < b) {
			ini = a;
			fin = b;
		}else if (a > b){
			ini = b;
			fin = a;
		}else {			
			System.out.println("Metodo sin estructura de datos: " + a);
		}
		
		if(ini <= fin) {
			System.out.println("Metodo sin estructura de datos: " + ini);
			ini++;
			metodoSinEstructura(ini,fin);
		}
	}
	
	public static void main(String[] args) {
		int a = 1;
		int b = 5;
		
		metodoFor(a, b);
		
		metodoWhile(a, b);
		
		metodoSinEstructura(a, b);
	}

}
