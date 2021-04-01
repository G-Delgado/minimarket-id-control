package model;

public class Person {
	private Type idType;
	private String id;
	
	public Person(String idType, String id) {
		this.setIdType(Type.valueOf(idType));
		this.setId(id);
	}

	public Type getIdType() {
		return idType;
	}

	public void setIdType(Type idType) {
		this.idType = idType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
