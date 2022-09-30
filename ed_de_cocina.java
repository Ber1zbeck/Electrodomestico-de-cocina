package cocina;

public class ed_de_cocina {
	private String Marca;
	private String Color;

public ed_de_cocina(){
}
	public ed_de_cocina (String Marca, String Color) {
		this.Marca=Marca;
		this.Color=Color;		
	}

		public String getMarca() {
			return Marca;		
		}
		
		public void setMarca(String Marca) {
			
		}
		public String getColor() {
			return Color;
		}
		public void setColor(String color) {
			Color = color;
		}
		
		@Override
		public String toString() {
			return "ed_de_cocina [Marca = " + Marca + ", Color = " + Color + "]";
		}
	
}