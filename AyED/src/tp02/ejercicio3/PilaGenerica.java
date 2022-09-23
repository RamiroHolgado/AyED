package tp02.ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class PilaGenerica<T> {
	ListaEnlazadaGenerica<T> l = new ListaEnlazadaGenerica<>();
	
	public PilaGenerica () {
		
	}
	
	public void apilar(T elem) {
		l.agregarInicio(elem);
	}
	
	public T desapilar() {
		T elem = l.elemento(1);
		l.eliminarEn(1);
		return elem;
	}
	
	public T tope() {
		return l.elemento(1);
	}
	
	public boolean esVacia() {
		return l.esVacia();
	}
	
}
