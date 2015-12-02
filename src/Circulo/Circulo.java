package Circulo;

public class Circulo {
	
	private double Radio;
	
	public static int control=12;
	public static void Mostrar(){
		System.out.println("Llamando Mostrar");
	}
	
	public Circulo(){
		this.Radio=1;
	}
	
	public Circulo(double RadioParam){
		this.Radio=RadioParam;
	}
	
	public void setRadio(double RadioParam){
		this.Radio=RadioParam;
	}
	
	public double getRadio(){
		return this.Radio;
	}
	/*
	public Circulo(double RadioParam){
		this.Radio=RadioParam;
	}
	*/
	public double getArea(){
		return Math.PI*Radio*Radio;
	}

}
