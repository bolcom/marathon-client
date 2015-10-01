package mesosphere.marathon.client.model.v2;

import mesosphere.marathon.client.utils.ModelUtils;

import java.util.*;

public class App {
	private String id;
	private String cmd;
	private List args;
	private Integer instances;
	private Double cpus;
	private Double mem;
	private Collection<String> uris;
	private List<List<String>> constraints;
	private Container container;
	private Map<String, String> env;
	private Map<String, String> labels;
	private String executor;
	private List<Integer> ports;
	private Collection<Task> tasks;
	private Collection<HealthCheck> healthChecks;
	private Integer tasksStaged;
	private Integer tasksRunning;
	private Integer backoffSeconds;
	private Double backoffFactor;
	private Integer maxLaunchDelaySeconds;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public Integer getInstances() {
		return instances;
	}

	public void setInstances(Integer instances) {
		this.instances = instances;
	}

	public Double getCpus() {
		return cpus;
	}

	public void setCpus(Double cpus) {
		this.cpus = cpus;
	}

	public Double getMem() {
		return mem;
	}

	public void setMem(Double mem) {
		this.mem = mem;
	}

	public Collection<String> getUris() {
		return uris;
	}

	public void setUris(Collection<String> uris) {
		this.uris = uris;
	}

	public List<List<String>> getConstraints() {
		return constraints;
	}

	public void setConstraints(List<List<String>> constraints) {
		this.constraints = constraints;
	}

	public void addConstraint(String attribute, String operator, String value) {
		if (this.constraints == null) {
			this.constraints = new ArrayList<List<String>>();
		}
		List<String> constraint = new ArrayList<String>(3);
		constraint.add(attribute == null ? "" : attribute);
		constraint.add(operator == null ? "" : operator);
		constraint.add(value == null ? "" : value);
		this.constraints.add(constraint);
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public Map<String, String> getEnv() {
		return env;
	}

	public void setEnv(Map<String, String> env) {
		this.env = env;
	}

	public String getExecutor() {
		return executor;
	}

	public void setExecutor(String executor) {
		this.executor = executor;
	}

	public List<Integer> getPorts() {
		return ports;
	}

	public void setPorts(List<Integer> ports) {
		this.ports = ports;
	}

	public void addUri(String uri) {
		if (this.uris == null) {
			this.uris = new ArrayList<String>();
		}
		this.uris.add(uri);
	}

	public void addPort(int port) {
		if (this.ports == null) {
			this.ports = new ArrayList<Integer>();
		}
		this.ports.add(port);
	}

	public Collection<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Collection<Task> tasks) {
		this.tasks = tasks;
	}

	public Integer getTasksStaged() {
		return tasksStaged;
	}

	public void setTasksStaged(Integer tasksStaged) {
		this.tasksStaged = tasksStaged;
	}

	public Integer getTasksRunning() {
		return tasksRunning;
	}

	public void setTasksRunning(Integer tasksRunning) {
		this.tasksRunning = tasksRunning;
	}

	public Map<String, String> getLabels() {
		return labels;
	}

	public void setLabels(Map<String, String> labels) {
		this.labels = labels;
	}

	public void addLabel(String key, String value) {
		if (this.labels == null) {
			this.labels = new HashMap<String, String>();
		}
		this.labels.put(key, value);
	}

	public Integer getBackoffSeconds() {
		return backoffSeconds;
	}

	public void setBackoffSeconds(Integer backoffSeconds) {
		this.backoffSeconds = backoffSeconds;
	}

	public Double getBackoffFactor() {
		return backoffFactor;
	}

	public void setBackoffFactor(Double backoffFactor) {
		this.backoffFactor = backoffFactor;
	}

	public Integer getMaxLaunchDelaySeconds() {
		return maxLaunchDelaySeconds;
	}

	public void setMaxLaunchDelaySeconds(Integer maxLaunchDelaySeconds) {
		this.maxLaunchDelaySeconds = maxLaunchDelaySeconds;
	}

	public Collection<HealthCheck> getHealthChecks() {
		return healthChecks;
	}

	public void setHealthChecks(Collection<HealthCheck> healthChecks) {
		this.healthChecks = healthChecks;
	}

	public void addHealthCheck( HealthCheck healthCheck ) {
		if ( this.healthChecks == null ) {
			this.healthChecks = new ArrayList<HealthCheck>();
		}

		this.healthChecks.add( healthCheck );
	}

	public List getArgs() {
		return args;
	}

	public void setArgs(List args) {
		this.args = args;
	}

	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (cmd != null ? cmd.hashCode() : 0);
		result = 31 * result + (instances != null ? instances.hashCode() : 0);
		result = 31 * result + (cpus != null ? cpus.hashCode() : 0);
		result = 31 * result + (mem != null ? mem.hashCode() : 0);
		result = 31 * result + (uris != null ? uris.hashCode() : 0);
		result = 31 * result + (constraints != null ? constraints.hashCode() : 0);
		result = 31 * result + (container != null ? container.hashCode() : 0);
		result = 31 * result + (env != null ? env.hashCode() : 0);
		result = 31 * result + (labels != null ? labels.hashCode() : 0);
		result = 31 * result + (executor != null ? executor.hashCode() : 0);
		result = 31 * result + (ports != null ? ports.hashCode() : 0);
		result = 31 * result + (tasks != null ? tasks.hashCode() : 0);
		result = 31 * result + (tasksStaged != null ? tasksStaged.hashCode() : 0);
		result = 31 * result + (tasksRunning != null ? tasksRunning.hashCode() : 0);
		result = 31 * result + (backoffSeconds != null ? backoffSeconds.hashCode() : 0);
		result = 31 * result + (backoffFactor != null ? backoffFactor.hashCode() : 0);
		result = 31 * result + (maxLaunchDelaySeconds != null ? maxLaunchDelaySeconds.hashCode() : 0);
		return result;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		App app = (App) o;

		if (id != null ? !id.equals(app.id) : app.id != null) return false;
		if (cmd != null ? !cmd.equals(app.cmd) : app.cmd != null) return false;
		if (instances != null ? !instances.equals(app.instances) : app.instances != null) return false;
		if (cpus != null ? !cpus.equals(app.cpus) : app.cpus != null) return false;
		if (mem != null ? !mem.equals(app.mem) : app.mem != null) return false;
		if (uris != null ? !uris.equals(app.uris) : app.uris != null) return false;
		if (constraints != null ? !constraints.equals(app.constraints) : app.constraints != null) return false;
		if (container != null ? !container.equals(app.container) : app.container != null) return false;
		if (env != null ? !env.equals(app.env) : app.env != null) return false;
		if (labels != null ? !labels.equals(app.labels) : app.labels != null) return false;
		if (executor != null ? !executor.equals(app.executor) : app.executor != null) return false;
		if (ports != null ? !ports.equals(app.ports) : app.ports != null) return false;
		if (tasks != null ? !tasks.equals(app.tasks) : app.tasks != null) return false;
		if (tasksStaged != null ? !tasksStaged.equals(app.tasksStaged) : app.tasksStaged != null) return false;
		if (tasksRunning != null ? !tasksRunning.equals(app.tasksRunning) : app.tasksRunning != null) return false;
		if (backoffSeconds != null ? !backoffSeconds.equals(app.backoffSeconds) : app.backoffSeconds != null)
			return false;
		if (backoffFactor != null ? !backoffFactor.equals(app.backoffFactor) : app.backoffFactor != null) return false;
		return !(maxLaunchDelaySeconds != null ? !maxLaunchDelaySeconds.equals(app.maxLaunchDelaySeconds) : app.maxLaunchDelaySeconds != null);
	}
}
