package model;

import java.time.LocalDate;
import java.util.ArrayList;

import exceptions.NotOfLegalAgeException;
import exceptions.NotTheDayToGoOutException;

public class Minimarket {
	private ArrayList<Person> allowed;
	//private ArrayList<Person> attempt;
	private int attempt;
	private int date;
	
	public Minimarket () {
		setAllowed(new ArrayList<>());
		//setAttempt(new ArrayList<>());
		setAttempt(0);
		date = LocalDate.now().getDayOfMonth();
	}
	
	public void addAllowed(String idType, String id) throws NotOfLegalAgeException, NotTheDayToGoOutException {
		int digit = Integer.parseInt(id.substring(id.length() - 2, id.length() - 1));
		
		Person p = new Person(idType, id);
		
		increaseAttempt();
		if (p.getIdType().equals(Type.TI)) {
			
			throw new NotOfLegalAgeException();
		} else {
			if ((digit % 2 == 0 && date % 2 != 0) || (digit % 2 != 0 && date % 2 == 0)) {	
				
				allowed.add(p);
				System.out.println("Registrado!\n");
			} else {
				
				throw new NotTheDayToGoOutException();
			}
		}
		
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
