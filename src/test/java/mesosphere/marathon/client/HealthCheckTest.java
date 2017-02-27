package mesosphere.marathon.client;

import org.junit.Assert;
import org.junit.Test;

import mesosphere.marathon.client.model.v2.HealthCheck;
import mesosphere.marathon.client.utils.ModelUtils;

public class HealthCheckTest {

    @Test
    public void testThatHealthCheckWithOnlyPortDoesNotContainPortIndex() {
        HealthCheck healthCheck = new HealthCheck();
        healthCheck.setPort(8080);
        String json = ModelUtils.GSON.toJson(healthCheck).replace("\n", "").replace("\r", "");
        Assert.assertEquals("{  \"gracePeriodSeconds\": 0,  \"intervalSeconds\": 0,  \"port\": 8080,  \"timeoutSeconds\": 0,  \"maxConsecutiveFailures\": 0}", json);
    }
    
    @Test
    public void testThatHealthCheckWithOnlyPortIndexDoesNotContainPort() {
        HealthCheck healthCheck = new HealthCheck();
        healthCheck.setPortIndex(0);
        String json = ModelUtils.GSON.toJson(healthCheck).replace("\n", "").replace("\r", "");
        Assert.assertEquals("{  \"gracePeriodSeconds\": 0,  \"intervalSeconds\": 0,  \"portIndex\": 0,  \"timeoutSeconds\": 0,  \"maxConsecutiveFailures\": 0}", json);
    }
}
