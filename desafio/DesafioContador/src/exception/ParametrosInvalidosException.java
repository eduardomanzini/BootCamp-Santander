package exception;

public class ParametrosInvalidosException extends Exception {

	private static final long serialVersionUID = 4688770214915641669L;


	public ParametrosInvalidosException() {
		super("O segundo par�metro deve ser maior que o primeiro");
	}
	
}
