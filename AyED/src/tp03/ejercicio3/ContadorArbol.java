package tp03.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ContadorArbol {
	public static ListaEnlazadaGenerica<Integer> numerosParesInOrden(ArbolBinario<Integer> arbol,
			ListaEnlazadaGenerica<Integer> pares) {
		if (!arbol.esVacio()) {
			if (arbol.tieneHijoIzquierdo())
				pares = numerosParesInOrden(arbol.getHijoIzquierdo(), pares);

			if (arbol.getDato() % 2 == 0)
				pares.agregarFinal(arbol.getDato());

			if (arbol.tieneHijoDerecho())
				pares = numerosParesInOrden(arbol.getHijoDerecho(), pares);

		}
		return pares;

	}

	public static ListaEnlazadaGenerica<Integer> numerosParesPostOrden(ArbolBinario<Integer> arbol,
			ListaEnlazadaGenerica<Integer> pares) {
		if (!arbol.esVacio()) {
			if (arbol.tieneHijoIzquierdo())
				pares = numerosParesPostOrden(arbol.getHijoIzquierdo(), pares);

			if (arbol.tieneHijoDerecho())
				pares = numerosParesPostOrden(arbol.getHijoDerecho(), pares);

			if (arbol.getDato() % 2 == 0)
				pares.agregarFinal(arbol.getDato());

		}
		return pares;

	}

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

		ListaEnlazadaGenerica<Integer> listaInOrden = new ListaEnlazadaGenerica<Integer>();
		ListaEnlazadaGenerica<Integer> listaPostOrden = new ListaEnlazadaGenerica<Integer>();

		numerosParesInOrden(a1, listaInOrden);
		numerosParesPostOrden(a1, listaPostOrden);

		listaInOrden.comenzar();
		while (!listaInOrden.fin())
			System.out.print(listaInOrden.proximo() + " ");

		System.out.println();

		listaPostOrden.comenzar();
		while (!listaPostOrden.fin())
			System.out.print(listaPostOrden.proximo() + " ");

	}

}
