package main;

public aspect SingletonDetalles {
	
	public static  DetallesApp details;
	
	pointcut getInstancia(): call(DetallesApp main.DetallesApp.obtenerInstancia());
	pointcut prohibidoAcceso(): call(void DetallesApp.cambiarDatos());
	
	Object around(): getInstancia(){
		System.out.println("Solo visualizacion");
		if(details==null) {
			System.out.println("instancia creada por primera y unica vez");
			Object result=proceed();
			details=(DetallesApp)result;
			return details;
		}else {
			System.out.println("Instancia unica.");
			return details;
			
		}
	}
	before(): getInstancia(){
		System.out.println("");
	}
	
	before(): prohibidoAcceso(){
		System.out.println("No tiene permitido acceder al versionamiento.");
	}
	
	
	
}
