package mesosphere.marathon.client.model.v2;

public class PortMapping {
    private int containerPort;
    private int hostPort;
    private String protocol;

    public int getContainerPort() {
        return containerPort;
    }

    public void setContainerPort(int containerPort) {
        this.containerPort = containerPort;
    }

    public int getHostPort() {
        return hostPort;
    }

    public void setHostPort(int hostPort) {
        this.hostPort = hostPort;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + containerPort;
        result = prime * result + hostPort;
        result = prime * result + ((protocol == null) ? 0 : protocol.hashCode());
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
        PortMapping other = (PortMapping) obj;
        if (containerPort != other.containerPort)
            return false;
        if (hostPort != other.hostPort)
            return false;
        if (protocol == null) {
            if (other.protocol != null)
                return false;
        } else if (!protocol.equals(other.protocol))
            return false;
        return true;
    }

}
