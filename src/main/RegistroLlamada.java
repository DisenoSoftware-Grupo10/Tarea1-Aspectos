package main;

public class RegistroLlamada{
	
	private Usuario usuario1;
	private Usuario usuario2;
	private static RegistroLlamada ultimaLlamada;
	
	private RegistroLlamada(){
		this.ultimaLlamada = null;
	}
	
	//Setters
	public void setUsuario1(Usuario u1){
		this.usuario1 = u1;
	}
	
	public void setUsuario2(Usuario u2){
		this.usuario2 = u2;
	}
	
	//Getter
	public RegistroLlamada getInstance(){
		return this.ultimaLlamada;
	}
	
}
