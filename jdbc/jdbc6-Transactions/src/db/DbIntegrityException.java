package db;

public class DbIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	// personalized exception to handle referential integrity problem
	public DbIntegrityException(String msg) {
		super(msg);
	}
}