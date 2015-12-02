package Visibilidad;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Visibilidad v1=new Visibilidad();
		v1.metodoPublico();
		v1.metodoPrivado(); //Solo es visible dentro de la misma clase.
		v1.metodoPaquete();
		

	}

}
