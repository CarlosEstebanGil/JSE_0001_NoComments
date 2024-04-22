package pru_JSE_0001;



public class MiClaseGeneric<T> {

	private T elem; 			

	public MiClaseGeneric(T elemParam) { 
		this.elem = elemParam;
	}
	
	public void mostrarTipo() {
		System.out.println(" T es un: " + elem.getClass()); 
	}															
									
}
