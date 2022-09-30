package cocina;


public class Main {
	public static void main (String [] args) {
		ed_de_cocina e1 = new ed_de_cocina("LG" , "Plateado");
		System.out.println(e1);
		
		Horno e2 = new Horno("Agua");
		System.out.println(e2);
		
		Tostador e3 = new Tostador("Pan de fercho, mi fao zum zum zum");
		System.out.println(e3);
		
		ed_de_cocina e4 = new ed_de_cocina ();
		e4.setMarca("DAEVO");
		System.out.println(e4.getMarca());
		
	}
}