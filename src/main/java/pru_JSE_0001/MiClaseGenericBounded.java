package pru_JSE_0001;


public class MiClaseGenericBounded<T extends IMamifero> {

	private T elem; 			

	public MiClaseGenericBounded(T elemParam) {   
		this.elem = elemParam;
	}
	
	public void mostrarTipo() {
		System.out.println(" T es un: " + elem.getClass());  
	}															
	
}
