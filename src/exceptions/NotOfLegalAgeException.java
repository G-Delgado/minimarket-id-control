package exceptions;

@SuppressWarnings("serial")
public class NotOfLegalAgeException extends Exception{

	public NotOfLegalAgeException() {
		super("The person needs to be of legal age\n");
	}
}
