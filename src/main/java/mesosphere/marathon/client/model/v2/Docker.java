package mesosphere.marathon.client.model.v2;

import java.util.List;

public class Docker {

    private String image;
    private String network = BRIDGE;
    private List<PortMapping> portMappings;
    
    public static final String BRIDGE = "BRIDGE";

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

    public void setPortMappings(List<PortMapping> portMappings) {
        this.portMappings = portMappings;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((image == null) ? 0 : image.hashCode());
        result = prime * result + ((network == null) ? 0 : network.hashCode());
        result = prime * result + ((portMappings == null) ? 0 : portMappings.hashCode());
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
        Docker other = (Docker) obj;
        if (image == null) {
            if (other.image != null)
                return false;
        } else if (!image.equals(other.image))
            return false;
        if (network == null) {
            if (other.network != null)
                return false;
        } else if (!network.equals(other.network))
            return false;
        if (portMappings == null) {
            if (other.portMappings != null)
                return false;
        } else if (!portMappings.equals(other.portMappings))
            return false;
        return true;
    }

 

}
