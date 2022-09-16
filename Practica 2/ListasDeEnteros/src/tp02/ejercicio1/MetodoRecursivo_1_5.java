package tp02.ejercicio1;

public class MetodoRecursivo_1_5 {
	
	//imprimir en sentido inverso
	public static void imprimir(ListaDeEnteros l, int num) {
		if(num > 0) {
			System.out.println(l.elemento(num));
			num--;
			imprimir(l,num);
		}
	}

	public static void main(String[] args) {
		ListaDeEnterosConArreglos l = new ListaDeEnterosConArreglos();
		
		for (int i = 0; i < 10; i++) {
			l.agregarFinal(i);
		}
		imprimir(l,l.tamanio());

	}

}
