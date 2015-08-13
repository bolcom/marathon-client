package mesosphere.marathon.client.model.v2;

public class HealthCheck {

	private String protocol;
	private String path;
	private int gracePeriodSeconds;
	private int intervalSeconds;
	private int portIndex;
	private int timeoutSeconds;
	private int maxConsecutiveFailures;

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getGracePeriodSeconds() {
		return gracePeriodSeconds;
	}

	public void setGracePeriodSeconds(int gracePeriodSeconds) {
		this.gracePeriodSeconds = gracePeriodSeconds;
	}

	public int getIntervalSeconds() {
		return intervalSeconds;
	}

	public void setIntervalSeconds(int intervalSeconds) {
		this.intervalSeconds = intervalSeconds;
	}

	public int getPortIndex() {
		return portIndex;
	}

	public void setPortIndex(int portIndex) {
		this.portIndex = portIndex;
	}

	public int getTimeoutSeconds() {
		return timeoutSeconds;
	}

	public void setTimeoutSeconds(int timeoutSeconds) {
		this.timeoutSeconds = timeoutSeconds;
	}

	public int getMaxConsecutiveFailures() {
		return maxConsecutiveFailures;
	}

	public void setMaxConsecutiveFailures(int maxConsecutiveFailures) {
		this.maxConsecutiveFailures = maxConsecutiveFailures;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		HealthCheck that = (HealthCheck) o;

		if (gracePeriodSeconds != that.gracePeriodSeconds) return false;
		if (intervalSeconds != that.intervalSeconds) return false;
		if (portIndex != that.portIndex) return false;
		if (timeoutSeconds != that.timeoutSeconds) return false;
		if (maxConsecutiveFailures != that.maxConsecutiveFailures) return false;
		if (protocol != null ? !protocol.equals(that.protocol) : that.protocol != null) return false;
		return !(path != null ? !path.equals(that.path) : that.path != null);

	}

	@Override
	public int hashCode() {
		int result = protocol != null ? protocol.hashCode() : 0;
		result = 31 * result + (path != null ? path.hashCode() : 0);
		result = 31 * result + gracePeriodSeconds;
		result = 31 * result + intervalSeconds;
		result = 31 * result + portIndex;
		result = 31 * result + timeoutSeconds;
		result = 31 * result + maxConsecutiveFailures;
		return result;
	}
}
