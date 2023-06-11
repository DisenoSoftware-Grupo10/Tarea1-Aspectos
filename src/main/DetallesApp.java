package main;

public class DetallesApp{
	
	private String nombreDesarrollo;
	private String version;
	private static DetallesApp details;
	
	
	public DetallesApp(){
		this.nombreDesarrollo = "Discord_App.091.2Beta";
		this.version = "3.019.1 Global"; 
	}
	
	
	//Getter
	
	public String toString() {
		return "Development Name: " + this.nombreDesarrollo + "\nVersion: " + this.version + "\n"; 
	}
}
