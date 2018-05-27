package junit.basic;

public class CustomerCustomException extends Exception {

	private static final long serialVersionUID = 5104060091411706448L;
	private int errCode;

	public CustomerCustomException(int errCode, String message) {
		super(message);
		this.errCode = errCode;
	}

	public int getErrCode() {
		return errCode;
	}

	public void setErrCode(int errCode) {
		this.errCode = errCode;
	}
}
