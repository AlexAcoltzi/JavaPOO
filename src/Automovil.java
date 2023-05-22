
public class Automovil extends Transporte{
	
	int numPuertas;
	int año;
	
	
	
	
	public Automovil() {
		super();
	}




	public Automovil(String marca, String modelo, int capacidad, int numPuertas, int año) {
		super(marca, modelo, capacidad);
		this.numPuertas = numPuertas;
		this.año = año;
	}




	public int getNumPuertas() {
		return numPuertas;
	}




	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}




	public int getAño() {
		return año;
	}




	public void setAño(int año) {
		this.año = año;
	}




	@Override
	public String toString() {
		return "Automovil [numPuertas=" + numPuertas + ", año=" + año + ", marca=" + marca + ", modelo=" + modelo
				+ ", capacidad=" + capacidad + "]\n";
	}
	
	
	
	

}
