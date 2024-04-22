package pru_JSE_0001;

import java.util.Objects;

public class Humano extends Mamifero implements IHumano,Comparable<Humano>{ //**
	private  String name;
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public void setName(String strName) {
		this.name = strName;
	}
	
	@Override
	public void caminar() {
		System.out.println("caminando uso mis pies");
	}

	@Override
	public int compareTo(Humano objhumParam) {
		 return this.getEdad()-objhumParam.getEdad();
	}
	@Override
	public String toString() {
		return "Humano [name=" + name + ", getEdad()=" + getEdad() + "]";
	}
	public Humano(String name) {
		super();
		this.name = name;
	}
	
	public Humano() {
		super();
	}
	
	private long id; 
	
	@Override
	public long getId() {
		return this.id;
	}
	@Override
		public void setId(long id) {
			this.id = id;			
		}
	
	IHumano.sexo sex;
	
	@Override
		public sexo getSexo() {
			return this.sex ;
		}
	@Override
		public void setSexo(sexo sex) {
			this.sex = sex;
		}
	@Override
	public int hashCode() {
		return Objects.hash(id, sex);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Humano other = (Humano) obj;
		return id == other.id && sex == other.sex;
	}
	
	
	
}
