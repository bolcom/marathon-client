package mesosphere.marathon.client.model.v2;

import java.util.List;

import mesosphere.marathon.client.utils.ModelUtils;

public class GetGroupsResponse {

    private List<App> apps;
    private List<Group> groups;

    public List<App> getApps() {
        return apps;
    }

    public void setApps(List<App> apps) {
        this.apps = apps;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
            return ModelUtils.toString(this);
    }
    
}
