package modelo;

public class Circulo {
	
	private double diametro;

	public Circulo() {
		super();
	}

	public Circulo(double diametro) {
		super();
		this.diametro = diametro;
	}
	
	public double calcularRadio() {
		return this.diametro /2;
	}
	
	public double calcularPerimetroCirculo() {
		return Math.PI * this.diametro;
	}
	

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	

}
