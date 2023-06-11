package interfaz;

import java.util.Scanner;
import main.*;


public class AdapterToIOS implements Discord{
	
	IOS ios = new IOS("default", 999, "defaultemail");

	@Override
	public boolean login(Scanner sc){
		
		if(ios.conectarToID(sc)) {
			System.out.println("Loggueado correctamente en dispositivo IOS\n");
			return true;
		}
		
		System.out.println("No se pudo logguear en IOs\n");
		return false;
	}

	@Override
	public void enviarMensaje(String msg, Usuario user) {
		System.out.println(msg + " \nMensaje enviado correctamente a " + user + " por IOS");
		
	}

	@Override
	public void llamar(Usuario user1, Usuario user2) {
		
		if(ios.llamarIOS()) {
			System.out.println(user1 + " realizó una llamada correctamente a " + user2 + " por IOS");
		}
		else {
			System.out.println("Llama cancelada\n");
		}
		
	}

	@Override
	public void crearUsuario(String name, String email, String contraseña, boolean prem) {

		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del usuario:");
        name = scanner.nextLine();

        System.out.println("Ingrese el correo electrónico del usuario:");
        email = scanner.nextLine();

        System.out.println("Ingrese la contraseña del usuario:");
        contraseña = scanner.nextLine();

        System.out.println("¿Es un usuario premium? (true/false):");
        prem = scanner.nextBoolean();
		Usuario u1 = new Usuario(name, email, contraseña, prem);
		Main.usuarios.add(u1);
		System.out.println("Usuario de discord por IOS creado correctamente");
	}

}
