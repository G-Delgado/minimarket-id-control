package model;

import java.util.ArrayList;

public class Minimarket {
	private ArrayList<Person> allowed;
	//private ArrayList<Person> attempt;
	private int attempt;
	
	public Minimarket () {
		setAllowed(new ArrayList<>());
		//setAttempt(new ArrayList<>());
		setAttempt(0);
	}
	
	public void addAllowed(String idType, String id) {
		idType = idType.replace(" ", "").toUpperCase();
		Person p = new Person(idType, id);
		
		allowed.add(p);
	}
	
	public void increaseAttempt() {
		setAttempt(getAttempt() + 1);
	}

	public ArrayList<Person> getAllowed() {
		return allowed;
	}

	public void setAllowed(ArrayList<Person> allowed) {
		this.allowed = allowed;
	}

	public int getAttempt() {
		return attempt;
	}

	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}

}
