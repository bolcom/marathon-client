package mesosphere.marathon.client.model.v2;

import java.util.List;

public class Docker {
	public static final String BRIDGE = "BRIDGE";

	private String image;
	private String network = BRIDGE;
	private List<PortMapping> portMappings;
	private List<Parameter> parameters;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public List<PortMapping> getPortMappings() {
		return portMappings;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}


	public void setPortMappings(List<PortMapping> portMappings) {
		this.portMappings = portMappings;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Docker docker = (Docker) o;

		if (image != null ? !image.equals(docker.image) : docker.image != null) return false;
		if (network != null ? !network.equals(docker.network) : docker.network != null) return false;
		if (portMappings != null ? !portMappings.equals(docker.portMappings) : docker.portMappings != null) return false;
		return parameters != null ? parameters.equals(docker.parameters) : docker.parameters == null;
	}

	@Override
	public int hashCode() {
		int result = image != null ? image.hashCode() : 0;
		result = 31 * result + (network != null ? network.hashCode() : 0);
		result = 31 * result + (portMappings != null ? portMappings.hashCode() : 0);
		result = 31 * result + (parameters != null ? parameters.hashCode() : 0);
		return result;
	}
}
