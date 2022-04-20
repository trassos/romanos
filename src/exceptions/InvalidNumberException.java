package exceptions;

@SuppressWarnings("serial")
public class InvalidNumberException extends RuntimeException {

	public InvalidNumberException(String errorMessage) {
		super(errorMessage);

	}

}
