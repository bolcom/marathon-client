package mesosphere.marathon.client;

public class MarathonClientException extends RuntimeException {

	private static final long serialVersionUID = 6904079204599246797L;

	private final int status;

	public MarathonClientException(int status, String message, Throwable cause) {
		super(message, cause);
		this.status = status;
	}

	public MarathonClientException(int status, String message) {
		super(message);
		this.status = status;
	}

	public int getStatus() {
		return status;
	}
}
