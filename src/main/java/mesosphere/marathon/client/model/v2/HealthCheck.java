package mesosphere.marathon.client.model.v2;

public class HealthCheck {

	private String protocol;
	private String path;
	private int gracePeriodSeconds;
	private int intervalSeconds;
	private Integer portIndex;
	private Integer port;
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
	
        public Integer getPortIndex() {
            return portIndex;
        }
    
        public void setPortIndex(Integer portIndex) {
            this.portIndex = portIndex;
        }
    
        public Integer getPort() {
            return port;
        }
    
        public void setPort(Integer port) {
            this.port = port;
        }


}
