package ejercicio3;

public class Test {

	public static void main(String[] args) {
		
		Estudiante e1 = new Estudiante();
		e1.setNombre("e");
		e1.setApellido("1");
		e1.setEmail("e@1");
		e1.setComision("1");
		e1.setDireccion("direccion 1");
		
		Estudiante e2 = new Estudiante();
		e2.setNombre("e");
		e2.setApellido("2");
		e2.setEmail("e@2");
		e2.setComision("2");
		e2.setDireccion("direccion 2");
		
		Profesor p1 = new Profesor();
		p1.setNombre("p");
		p1.setApellido("1");
		p1.setEmail("p@1");
		p1.setCatedra("1");
		p1.setFacultad("1");
		
		Profesor p2 = new Profesor();
		p2.setNombre("p");
		p2.setApellido("2");
		p2.setEmail("p@2");
		p2.setCatedra("2");
		p2.setFacultad("2");
		
		Profesor p3 = new Profesor();
		p3.setNombre("p");
		p3.setApellido("3");
		p3.setEmail("p@3");
		p3.setCatedra("3");
		p3.setFacultad("3");
		
		Estudiante vE [] = new Estudiante [2];
		Profesor vP [] = new Profesor [3];
		
		vE[0] = e1;
		vE[1] = e2;
		
		vP[0] = p1;
		vP[1] = p2;
		vP[2] = p3;
		
		
		for (int i = 0; i < vE.length; i++) {			
			System.out.println("ESTUDIANTES");
			System.out.println(vE[i].tusDatos());
		}
		
		for (int i = 0; i < vP.length; i++) {
			System.out.println("PROFESORES");
			System.out.println(vP[i].tusDatos());
		}
		
	}

}
