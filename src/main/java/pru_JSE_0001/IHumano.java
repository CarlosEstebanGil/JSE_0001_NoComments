package pru_JSE_0001;

public interface IHumano {
	public long getId();
	public void setId(long id);
	
	// public enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  }
	public enum sexo { MALE, FEMALE }
	
	public sexo getSexo();
	public void setSexo(sexo sex);
	
	String getName();

	void setName(String strName);

}