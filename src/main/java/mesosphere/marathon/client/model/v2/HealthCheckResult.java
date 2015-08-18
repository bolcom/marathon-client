package mesosphere.marathon.client.model.v2;

import java.util.Date;

public class HealthCheckResult {

	private boolean alive;
	private int consecutiveFailures;
	private String firstSuccess;
	private String lastFailure;
	private String lastSuccess;
	private String taskId;

	public boolean isAlive() {

		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public int getConsecutiveFailures() {
		return consecutiveFailures;
	}

	public void setConsecutiveFailures(int consecutiveFailures) {
		this.consecutiveFailures = consecutiveFailures;
	}

	public String getFirstSuccess() {
		return firstSuccess;
	}

	public void setFirstSuccess(String firstSuccess) {
		this.firstSuccess = firstSuccess;
	}

	public String getLastFailure() {
		return lastFailure;
	}

	public void setLastFailure(String lastFailure) {
		this.lastFailure = lastFailure;
	}

	public String getLastSuccess() {
		return lastSuccess;
	}

	public void setLastSuccess(String lastSuccess) {
		this.lastSuccess = lastSuccess;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		HealthCheckResult that = (HealthCheckResult) o;

		if (alive != that.alive) return false;
		if (consecutiveFailures != that.consecutiveFailures) return false;
		if (firstSuccess != null ? !firstSuccess.equals(that.firstSuccess) : that.firstSuccess != null) return false;
		if (lastFailure != null ? !lastFailure.equals(that.lastFailure) : that.lastFailure != null) return false;
		if (lastSuccess != null ? !lastSuccess.equals(that.lastSuccess) : that.lastSuccess != null) return false;
		return !(taskId != null ? !taskId.equals(that.taskId) : that.taskId != null);

	}

	@Override
	public int hashCode() {
		int result = (alive ? 1 : 0);
		result = 31 * result + consecutiveFailures;
		result = 31 * result + (firstSuccess != null ? firstSuccess.hashCode() : 0);
		result = 31 * result + (lastFailure != null ? lastFailure.hashCode() : 0);
		result = 31 * result + (lastSuccess != null ? lastSuccess.hashCode() : 0);
		result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
		return result;
	}

}
