package model;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import exceptions.NotOfLegalAgeException;
import exceptions.NotTheDayToGoOutException;

public class MinimarketTest {
	
	String id;
	Minimarket mm;
	
	public void scenaryOne() {
		id = "";
		if (LocalDate.now().getDayOfMonth() % 2 == 0) {
			id = "1006170256";
		} else {
			id = "1006170266";
		}
		
		mm = new Minimarket();
	}
	
	public void scenaryTwo() {
		id = "1006170256";
		mm = new Minimarket();
	}
	
	public void scenaryThree() {
		id = "";
		if (LocalDate.now().getDayOfMonth() % 2 == 0) {
			id = "1006170266";
		} else {
			id = "1006170256";
		}
		mm = new Minimarket();
	
	}

	@Test
	public void testAddAllowed() {
		scenaryOne();
		
		try {
			mm.addAllowed("CC", id);
			assertEquals(mm.getAttempt(), 1);
			assertEquals(mm.getAllowed().size(), 1);
		} catch (NotOfLegalAgeException | NotTheDayToGoOutException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
	
	@Test
	public void testNotOfLegalAge() {
		scenaryTwo();
		try {
			mm.addAllowed("TI", id);
			fail();
		} catch (NotOfLegalAgeException | NotTheDayToGoOutException e) {
			assertEquals(mm.getAttempt(), 1);
			assertEquals(mm.getAllowed().size(), 0);
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
	
	@Test
	public void testForbiddendDay() {
		scenaryThree();
		try {
			mm.addAllowed("CE", id);
			fail();
		} catch (NotOfLegalAgeException | NotTheDayToGoOutException e) {
			assertEquals(mm.getAttempt(), 1);
			assertEquals(mm.getAllowed().size(), 0);
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
}
