package Core.Exceptions;

public class ValueNotValidException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValueNotValidException() {
		super("Informe um valor positivo");
	}
}
