package main;

public class DetallesApp{
	
	private String nombreDesarrollo;
	private String version;
	
	//private static DetallesApp instancia= new DetallesApp();
	
	private DetallesApp(){
		this.nombreDesarrollo = "Discord_App.091.2Beta";
		this.version = "3.019.1 Global"; 
		
	}
	public static DetallesApp obtenerInstancia() {
		return new DetallesApp();
	}

	
	public void cambiarDatos() {
		
	}
	//Getter
	
	public String toString() {
		return "Development Name: " + this.nombreDesarrollo + "\nVersion: " + this.version + "\n"; 
	}
}
