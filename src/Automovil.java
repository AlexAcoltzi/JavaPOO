
public class Automovil extends Transporte{
	
	int numPuertas;
	int a�o;
	
	
	
	
	public Automovil() {
		super();
	}




	public Automovil(String marca, String modelo, int capacidad, int numPuertas, int a�o) {
		super(marca, modelo, capacidad);
		this.numPuertas = numPuertas;
		this.a�o = a�o;
	}




	public int getNumPuertas() {
		return numPuertas;
	}




	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}




	public int getA�o() {
		return a�o;
	}




	public void setA�o(int a�o) {
		this.a�o = a�o;
	}




	@Override
	public String toString() {
		return "Automovil [numPuertas=" + numPuertas + ", a�o=" + a�o + ", marca=" + marca + ", modelo=" + modelo
				+ ", capacidad=" + capacidad + "]\n";
	}
	
	
	
	

}
