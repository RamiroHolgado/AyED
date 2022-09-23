package tp02.ejercicio2;

public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("e","1","1","e@1","dir 1");
		Estudiante e2 = new Estudiante("e","2","2","e@2","dir 2");
		Estudiante e3 = new Estudiante("e","3","3","e@3","dir 3");
		Estudiante e4 = new Estudiante("e","4","4","e@4","dir 4");
		
		ListaEnlazadaGenerica<Estudiante> l = new ListaEnlazadaGenerica<Estudiante>();
		
		l.agregarFinal(e1);
		l.agregarFinal(e2);
		l.agregarFinal(e3);
		l.agregarFinal(e4);
		
//		l.comenzar();
//		while(!l.fin()) {
//			System.out.println(l.proximo().tusDatos());
//		}
		
		
		Integer [] array = {1,2,3,4};
		ListaEnlazadaGenerica<Integer> l2 = new ListaEnlazadaGenerica<Integer>();
		System.out.println(l2.agregar(array));
		l2.comenzar();
		while (!l2.fin()) {
			System.out.println(l2.proximo());
		}
		
		System.out.println(l2);
	}

}
