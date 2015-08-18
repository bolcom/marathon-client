package mesosphere.marathon.client.model.v2;

import mesosphere.marathon.client.utils.ModelUtils;

import java.util.Collection;
import java.util.List;

public class Task {
	private String host;
	private String id;
	private String appId;
	private Collection<Integer> ports;
	private String stagedAt;
	private String startedAt;

	private List<HealthCheckResult> healthCheckResults;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public Collection<Integer> getPorts() {
		return ports;
	}

	public void setPorts(Collection<Integer> ports) {
		this.ports = ports;
	}

	public String getStagedAt() {
		return stagedAt;
	}

	public void setStagedAt(String stagedAt) {
		this.stagedAt = stagedAt;
	}

	public String getStartedAt() {
		return startedAt;
	}

	public void setStartedAt(String startedAt) {
		this.startedAt = startedAt;
	}

	public List<HealthCheckResult> getHealthCheckResults() {
		return healthCheckResults;
	}

	public void setHealthCheckResults(List<HealthCheckResult> healthCheckResults) {
		this.healthCheckResults = healthCheckResults;
	}

	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}
