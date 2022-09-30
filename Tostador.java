package cocina;

public class Tostador {
	private String Tostando;

	public Tostador (String Tostando) {
		this.Tostando = Tostando;
		
	}
	
	public String getTostando() {
		return Tostando;
	}

	public void setTostando(String tostando) {
		Tostando = tostando;
	}

	@Override
	public String toString() {
		return "Tostador [Tostando = " + Tostando + "]";
	}

		
	
}

