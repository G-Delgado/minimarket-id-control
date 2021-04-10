package exceptions;

/*
 * I suppressed the warning as I didn't see it as necessary to run the exception
 * */
@SuppressWarnings("serial")
public class NotTheDayToGoOutException extends Exception{
	public NotTheDayToGoOutException(String msg) {
		super(msg != null ? msg : "You can't go out today!\n");
	}
}
