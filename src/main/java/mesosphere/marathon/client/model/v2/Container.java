package mesosphere.marathon.client.model.v2;

import java.util.List;

public class Container {

	private Docker docker;
	private String type;
	private List<Volume> volumes;

	public Docker getDocker() {
		return docker;
	}

	public void setDocker(Docker docker) {
		this.docker = docker;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Volume> getVolumes() {
		return volumes;
	}

	public void setVolumes(List<Volume> volumes) {
		this.volumes = volumes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((docker == null) ? 0 : docker.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((volumes == null) ? 0 : volumes.hashCode());
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
		Container other = (Container) obj;
		if (docker == null) {
			if (other.docker != null)
				return false;
		} else if (!docker.equals(other.docker))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (volumes == null) {
			if (other.volumes != null)
				return false;
		} else if (!volumes.equals(other.volumes))
			return false;
		return true;
	}
}
