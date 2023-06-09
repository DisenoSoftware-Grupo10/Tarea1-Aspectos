package main;
import java.util.ArrayList;
import java.util.Scanner;
import interfaz.*;

public class Main {
	public static ArrayList<Usuario> usuarios = new ArrayList<>();
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Discord android = new Android();
		Discord navegador = new Navegador();
		Discord ios = new AdapterToIOS();
		
		ios.crearUsuario("Carlos", "hola@gmail.com","si", false);
		android.crearUsuario("Daniel", "chao@gmail.com","no", true);
		navegador.crearUsuario("Angel", "gato@gmail.com","contraseña", false);
		
		android.login(sc);
		
		System.out.println(DetallesApp.getInstance());
		
		ios.login(sc);
		ios.llamar(usuarios.get(0), usuarios.get(1));
		sc.close();
		
	}

}
