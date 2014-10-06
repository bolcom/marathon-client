package mesosphere.marathon.client.model.v2;

public class Docker {

    private String image;
    private String network;
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
    
}
