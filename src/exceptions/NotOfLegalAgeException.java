package exceptions;

/*
 * I suppressed the warning as I didn't see it as necessary to run the exception
 * */
@SuppressWarnings("serial")
public class NotOfLegalAgeException extends Exception{

	public NotOfLegalAgeException(String msg) {
		super(msg != null ? msg : "The person needs to be of legal age\n");
	}
}
