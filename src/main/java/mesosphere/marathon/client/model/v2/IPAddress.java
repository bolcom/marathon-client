package mesosphere.marathon.client.model.v2;

public class IPAddress {
	private String networkName;

	public String getNetworkName() {
		return networkName;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	@Override
	public String toString() {
		return "networkName: " + networkName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		IPAddress ipAddress = (IPAddress) o;

		return networkName != null ? networkName.equals(ipAddress.networkName) : ipAddress.networkName == null;
	}

	@Override
	public int hashCode() {
		return networkName != null ? networkName.hashCode() : 0;
	}
}
