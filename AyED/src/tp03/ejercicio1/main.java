package tp03.ejercicio1;

public class main {

	public static void main(String[] args) {
		ArbolBinario<Integer> a1 = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> a2 = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> a3 = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> a4 = new ArbolBinario<Integer>(4);
		ArbolBinario<Integer> a5 = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> a6 = new ArbolBinario<Integer>(6);

		a1.agregarHijoIzquierdo(a2);
		a1.agregarHijoDerecho(a3);
		a2.agregarHijoIzquierdo(a4);
		a2.agregarHijoDerecho(a5);
		a3.agregarHijoIzquierdo(a6);

		System.out.println("hojas: " + a1.contarHojas());

		System.out.println();

		a1.entreNiveles(0, 2);

		System.out.println();
		System.out.println();

		System.out.println("espejo");
		a1.espejo().enOrden();

	}

}
