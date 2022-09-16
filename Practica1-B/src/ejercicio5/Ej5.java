package ejercicio5;

public class Ej5 {
	
	public static String conReturn(int[] arr) {
		int max = -1;
		int min = 9999;
		double prom = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
			prom += arr[i];
		}
		prom /= arr.length;
		
		return "Maximo: " + max + ", Minimo: " + min + ", Promedio: " + prom;
	}
	
	public static void conParametros(int[] arr, Bar obj) {
		obj.setMax(-1);
		obj.setMin(9999);
		double prom = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > obj.getMax()) {
				obj.setMax(arr[i]);
			}
			if (arr[i] < obj.getMin()) {
				obj.setMin(arr[i]);
			}
			prom += arr[i];
		}		
		obj.setProm(prom /= arr.length);
	}
	public static void incisoC(int[] arr) {
		int max = -1;
		int min = 9999;
		double prom = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
			prom += arr[i];
		}
		prom /= arr.length;
		
		System.out.println("c: Maximo: " + max + ", Minimo: " + min + ", Promedio: " + prom);
	}
	
	public static void main(String[] args) {
		int arr [] = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		// inciso a con return
		System.out.println("a: " + conReturn(arr));
		
		// inciso b interactuando con parametros
		Bar obj = new Bar();
		conParametros(arr, obj);
		System.out.println("b: Maximo: " + obj.getMax() + ", Minimo: " + obj.getMin() + ", Promedio: " + obj.getProm());
		
		// inciso c sin parametro y sin return
		incisoC(arr);
	}

}
