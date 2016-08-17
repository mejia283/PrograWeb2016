package pe.edu.upc.Entity;

public class Fruta {
	//Objetos de instancia; sus datos van a variar para cada objeto
	private String nombre;
	private String color;
	private String sabor;
	private boolean PuedoHacerJugo;
	
	//Atributos de clase; se mantienen igual
	public static String LugarOrigen = "UPC"; //Depende de la clase. No necesita ser modificado

	//INICIALIZADOR - constructor - sobrecarga
	public Fruta()
	{
		this.nombre = "Indefinido";
		this.color = "S/C";
		this.sabor = "S/C";
		this.PuedoHacerJugo = false;
	}
	
	//CONSTRUCTOR
	public Fruta(String nombre, String color, String sabor) {
		super(); //Heredar el constructor de la clase padre. Sirve para hacer referencia a la misma clase, asimismo a atributos y metodos
		this.nombre = nombre;
		this.color = color;
		this.sabor = sabor;
		this.PuedoHacerJugo = false;
	}
	//Metodos de acceso a datos (set y Get)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isPuedoHacerJugo() {
		return PuedoHacerJugo;
	}

	public void setPuedoHacerJugo(boolean puedoHacerJugo) {
		PuedoHacerJugo = puedoHacerJugo;
	}

	
	
	//Sobrescritura de metodos heredados
	
	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", color=" + color + ", sabor=" + sabor + ", PuedoHacerJugo="
				+ PuedoHacerJugo + "]";
	}
	
	
	
}
