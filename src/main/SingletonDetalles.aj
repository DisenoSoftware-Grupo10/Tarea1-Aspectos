package main;

public aspect SingletonDetalles {
	
	private static DetallesApp infoVersion;
	
	
	pointcut instanciarDetalles(): call(void DetallesApp.DetallesApp());
	
	Object around (): instanciarDetalles(){
		
		if(infoVersion != null) {
			System.out.println("Descripcion:.");
			return infoVersion;
		}
		else {
			System.out.println("Mostrando por primera vez.Datos inalterables.");
			infoVersion = new DetallesApp();
			return infoVersion;
		}
	}
}
