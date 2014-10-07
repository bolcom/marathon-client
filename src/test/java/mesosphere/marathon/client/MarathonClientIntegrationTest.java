package mesosphere.marathon.client;

import java.util.ArrayList;
import java.util.List;

import mesosphere.marathon.client.model.v2.App;
import mesosphere.marathon.client.model.v2.Container;
import mesosphere.marathon.client.model.v2.Docker;
import mesosphere.marathon.client.model.v2.GetGroupsResponse;
import mesosphere.marathon.client.model.v2.Group;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// @Ignore
public class MarathonClientIntegrationTest {

    private static final String GROUP_ID = "abc-123";
    private static final String APP_ID_1 = "tpt-1";
    private static final String APP_ID_2 = "tpt-2";
    private Marathon marathon;

    @Before
    public void before() {
        marathon = MarathonClient.getInstance("http://localhost:8080");
        try {
            marathon.deleteGroup(GROUP_ID, true);
            
        } catch (MarathonClientException e) {
            e.printStackTrace();
            Assert.assertEquals(404, e.getStatus());

        }
    }

    @Test
    public void integration() throws InterruptedException {
        marathon.createGroup(createGroupWithApps(GROUP_ID, new String[] {APP_ID_1}));
        Assert.assertNotNull(getAppFromGroup(GROUP_ID, APP_ID_1));
        assertGroupExists(GROUP_ID);
        marathon.updateGroup(GROUP_ID, createGroupWithApps(GROUP_ID, new String[] {APP_ID_1, APP_ID_2}));
        Assert.assertNotNull(getAppFromGroup(GROUP_ID, APP_ID_2));

    }
    
    private void assertGroupExists(String groupId)
    {
        GetGroupsResponse getGroupsResponse = marathon.getGroups();
        Assert.assertNotNull(getGroupsResponse);
        List<Group> groups = getGroupsResponse.getGroups();
        Assert.assertNotNull(groups);
        Group group = null;
        for (Group g : groups) {
            if (g.getId().equals("/" + groupId)) {
                group = g;
                break;
            }
        }
        Assert.assertNotNull(group);
        
    }

    
    private App getAppFromGroup(String groupId, String appId)
    {
        Group group = marathon.getGroup(groupId);
        Assert.assertNotNull(group);
        Assert.assertEquals("/" + groupId, group.getId());
        List<App> apps = group.getApps();
        Assert.assertNotNull(apps);
        
        
        App app = null;
        for (App a : apps){
            if (a.getId().equals("/" + GROUP_ID + "/" + appId)){
                app = a;
                break;
            }
        }
        return app;

    }
    private Group createGroupWithApps(String groupId, String[] appNames) {
        Group group = new Group();
        group.setId(groupId);
        List<App> apps = new ArrayList<App>();
        for (String appName : appNames) {

            App app = new App();
            Container container = new Container();
            container.setType("DOCKER");
            Docker docker = new Docker();
            docker.setImage("mongo");
            container.setDocker(docker);
            app.setContainer(container);
            app.setId(appName);
            app.setInstances(1);
            apps.add(app);

        }
        group.setApps(apps);
        return group;
    }
}
