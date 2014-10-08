package mesosphere.marathon.client.model.v2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import mesosphere.marathon.client.utils.ModelUtils;

public class App {
	private String id;
	private String cmd;
	private Integer instances;
	private Double cpus;
	private Double mem;
	private Collection<String> uris;
	private List<List<String>> constraints;
	private Container container;
	private Map<String, String> env;
	private String executor;
	private List<Integer> ports;
	private Collection<Task> tasks;
	private Integer tasksStaged;
	private Integer tasksRunning;

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

	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cmd == null) ? 0 : cmd.hashCode());
        result = prime * result + ((constraints == null) ? 0 : constraints.hashCode());
        result = prime * result + ((container == null) ? 0 : container.hashCode());
        result = prime * result + ((cpus == null) ? 0 : cpus.hashCode());
        result = prime * result + ((env == null) ? 0 : env.hashCode());
        result = prime * result + ((executor == null) ? 0 : executor.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((instances == null) ? 0 : instances.hashCode());
        result = prime * result + ((mem == null) ? 0 : mem.hashCode());
        result = prime * result + ((ports == null) ? 0 : ports.hashCode());
        result = prime * result + ((tasks == null) ? 0 : tasks.hashCode());
        result = prime * result + ((tasksRunning == null) ? 0 : tasksRunning.hashCode());
        result = prime * result + ((tasksStaged == null) ? 0 : tasksStaged.hashCode());
        result = prime * result + ((uris == null) ? 0 : uris.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        App other = (App) obj;
        if (cmd == null) {
            if (other.cmd != null)
                return false;
        } else if (!cmd.equals(other.cmd))
            return false;
        if (constraints == null) {
            if (other.constraints != null)
                return false;
        } else if (!constraints.equals(other.constraints))
            return false;
        if (container == null) {
            if (other.container != null)
                return false;
        } else if (!container.equals(other.container))
            return false;
        if (cpus == null) {
            if (other.cpus != null)
                return false;
        } else if (!cpus.equals(other.cpus))
            return false;
        if (env == null) {
            if (other.env != null)
                return false;
        } else if (!env.equals(other.env))
            return false;
        if (executor == null) {
            if (other.executor != null)
                return false;
        } else if (!executor.equals(other.executor))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (instances == null) {
            if (other.instances != null)
                return false;
        } else if (!instances.equals(other.instances))
            return false;
        if (mem == null) {
            if (other.mem != null)
                return false;
        } else if (!mem.equals(other.mem))
            return false;
        if (ports == null) {
            if (other.ports != null)
                return false;
        } else if (!ports.equals(other.ports))
            return false;
        if (tasks == null) {
            if (other.tasks != null)
                return false;
        } else if (!tasks.equals(other.tasks))
            return false;
        if (tasksRunning == null) {
            if (other.tasksRunning != null)
                return false;
        } else if (!tasksRunning.equals(other.tasksRunning))
            return false;
        if (tasksStaged == null) {
            if (other.tasksStaged != null)
                return false;
        } else if (!tasksStaged.equals(other.tasksStaged))
            return false;
        if (uris == null) {
            if (other.uris != null)
                return false;
        } else if (!uris.equals(other.uris))
            return false;
        return true;
    }
	
	

}
