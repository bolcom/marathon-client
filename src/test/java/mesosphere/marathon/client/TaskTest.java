package mesosphere.marathon.client;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.io.Files;

import mesosphere.marathon.client.model.v2.Task;
import mesosphere.marathon.client.utils.ModelUtils;

public class TaskTest {

    @Test
    public void tasksCanBeParsed() throws IOException {
        String json = Files.toString(new File("src/test/resources/task.json"), Charset.defaultCharset()).trim();

        Task task = ModelUtils.GSON.fromJson(json, Task.class);
        Assert.assertNotNull(task);
        Assert.assertEquals(1, task.getIpAddresses().size());
        Assert.assertEquals("10.10.0.1", task.getIpAddresses().get(0).getIpAddress());
        Assert.assertEquals("IPv4", task.getIpAddresses().get(0).getProtocol());
        Assert.assertNull(task.getIpAddresses().get(0).getNetworkName());
    }
}
