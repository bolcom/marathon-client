package mesosphere.marathon.client.model.v2;

public class IPAddress {
        private String networkName;
        private String ipAddress;
	private String protocol;

	public String getNetworkName() {
		return networkName;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

        public String getIpAddress() {
            return ipAddress;
        }
    
        public void setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
        }
    
        public String getProtocol() {
            return protocol;
        }
    
        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        @Override
        public String toString() {
            return "IPAddress [networkName=" + networkName + ", ipAddress=" + ipAddress + ", protocol=" + protocol + "]";
        }
}
