package interfaz;
import main.Usuario;

public interface Discord{
	
	public boolean login(String email, String contraseña);
	
	public void enviarMensaje(String msg, Usuario user);
	
	public void llamar(Usuario user);
	
	public void crearUsuario(String name, String email, String contraseña, boolean prem);

}
