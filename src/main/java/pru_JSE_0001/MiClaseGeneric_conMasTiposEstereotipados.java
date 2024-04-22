package pru_JSE_0001;
 
public class MiClaseGeneric_conMasTiposEstereotipados<K,T,V,E> { 

	private T elemGen1;  
	private K elemGen2;  
	private V elemGen3;  
	private E elemGen4;  
	
	public MiClaseGeneric_conMasTiposEstereotipados(T elem1GenParam,K elem2GenParam,V elem3GenParam,E elem4GenParam) {   
		this.elemGen1 = elem1GenParam;
		this.elemGen2 = elem2GenParam;
		this.elemGen3 = elem3GenParam;
		this.elemGen4 = elem4GenParam;
	}
	
	public void mostrarTipos() {
		System.out.println(" T es un: " + elemGen1.getClass());
		System.out.println(" K es un: " + elemGen2.getClass());  
		System.out.println(" V es un: " + elemGen3.getClass());  
		System.out.println(" E es un: " + elemGen4.getClass());  
	}
	
}
