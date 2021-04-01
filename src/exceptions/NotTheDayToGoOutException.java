package exceptions;

@SuppressWarnings("serial")
public class NotTheDayToGoOutException extends Exception{
	public NotTheDayToGoOutException() {
		super("You can't go out today!\n");
	}
}
