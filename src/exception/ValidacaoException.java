package exception;

public class ValidacaoException extends Exception {

	public ValidacaoException() {

	}

	public ValidacaoException(String message) {
		super(message);
	
	}

	public ValidacaoException(Throwable cause) {
		super(cause);

	}

	public ValidacaoException(String message, Throwable cause) {
		super(message, cause);

	}

	public ValidacaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
