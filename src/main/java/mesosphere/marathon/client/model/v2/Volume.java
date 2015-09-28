package mesosphere.marathon.client.model.v2;

/**
 * {
 * "containerPath": "/etc/a",
 * "hostPath": "/var/data/a",
 * "mode": "RO"
 * }
 */
public class Volume {

    private String containerPath;
    private String hostPath;
    private String mode;

    public Volume() {
    }

    public Volume(String containerPath, String hostPath, String mode) {
        this.containerPath = containerPath;
        this.hostPath = hostPath;
        this.mode = mode;
    }

    public String getContainerPath() {
        return containerPath;
    }

    public void setContainerPath(String containerPath) {
        this.containerPath = containerPath;
    }

    public String getHostPath() {
        return hostPath;
    }

    public void setHostPath(String hostPath) {
        this.hostPath = hostPath;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "Volume{" +
                "containerPath='" + containerPath + '\'' +
                ", hostPath='" + hostPath + '\'' +
                ", mode='" + mode + '\'' +
                '}';
    }
}
