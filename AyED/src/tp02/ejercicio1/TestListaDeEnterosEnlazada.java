package tp02.ejercicio1;

public class TestListaDeEnterosEnlazada {

	public static void main(String[] args) {
		ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
		
		for (int i = 0; i < 10; i++) {
			l.agregarFinal(i);
		}
		
		l.comenzar();
		while(!l.fin()) {
			System.out.println(l.proximo());
		}

	}

}
