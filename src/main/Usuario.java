package main;

public class Usuario {
	
	private String nombre;
	private String email;
	private String contraseña;
	private boolean premium = false;
	
	public Usuario(String n, String e, String c, boolean p) {
		this.nombre = n;
		this.email = e;
		this.contraseña = c;
		this.premium = p;
	}
	
	//Getters
	public String getNombre(){
		return this.nombre;
	}
	
	public String getEmail(){
		return this.email;
	}
	

}
