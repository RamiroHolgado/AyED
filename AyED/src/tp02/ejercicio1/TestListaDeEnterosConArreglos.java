package tp02.ejercicio1;

public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		
		ListaDeEnterosConArreglos l = new ListaDeEnterosConArreglos();
		
		for (int i = 0; i < 10; i++) {			
			l.agregarFinal(i);
		}
		
		l.comenzar();
		while(!l.fin()) {
			System.out.println(l.proximo());			
		}

	}

}
