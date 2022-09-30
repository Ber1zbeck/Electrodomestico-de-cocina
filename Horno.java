package cocina;

public class Horno {
private String Calentando;

	public Horno (String Calentando) {
		this.Calentando=Calentando;
		
	}

	public String getCalentando() {
		return Calentando;
	}

	public void setCalentando(String calentando) {
		Calentando = calentando;
	}

	@Override
	public String toString() {
		return "Horno [Calentando = " + Calentando + "]";
	}
	
	


}
