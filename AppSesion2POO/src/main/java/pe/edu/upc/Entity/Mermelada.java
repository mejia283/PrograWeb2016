package pe.edu.upc.Entity;

public class Mermelada extends Fruta {
	private int duracionDias;
	private String tipoEnvase;
	
	
	
	
	public Mermelada(String nombre, String color, String sabor, int duracionDias,
			String TipoEnvase) {
		super(nombre, color, sabor);
		this.duracionDias = this.duracionDias;
		this.tipoEnvase = tipoEnvase;
	}


	public String PrepararMermelada()
	{
		return ("Preparando mermelada con alegria: " +this.getNombre());
		
	}
}
