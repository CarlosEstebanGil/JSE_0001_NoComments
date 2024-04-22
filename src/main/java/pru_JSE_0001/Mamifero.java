package pru_JSE_0001;

public abstract class Mamifero implements IMamifero {
	
	private int edad;

	@Override
	public void caminar() {
		System.out.println("caminando uso mis patas");
	}
	
	@Override
	public void respirar() {
		System.out.println("respirando uso pulmones");
	}
	
	
	@Override
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	} 
	
	
	
	

}
