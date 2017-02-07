package mesosphere.marathon.client;

import com.google.common.io.Files;
import mesosphere.marathon.client.model.v2.*;
import mesosphere.marathon.client.utils.ModelUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;

// Test that ensure encoding of ipAddress and Docker parameters works as expected
public class IpAddressParametersTest {
	private String json;

	@Before
	public void decodeJson() throws IOException {
		json = Files.toString(new File("src/test/resources/ipaddressparameterstest.json"), Charset.defaultCharset()).trim();
	}

	@Test
	public void IpAddressAndDockerParametersEncodingShouldWork() {
		App app = ModelUtils.GSON.fromJson(json, App.class);

		Assert.assertEquals("Network name is incorrect!", "yo-network", app.getIpAddress().getNetworkName());
		Assert.assertEquals("Wrong number of params decoded!", 1, app.getContainer().getDocker().getParameters().size());
		Parameter p = app.getContainer().getDocker().getParameters().get(0);
		Assert.assertEquals("Key/value incorrect!", "rm:true", p.getKey() + ":" + p.getValue());
	}

	@Test
	public void IpAddressAndDockerParametersDecodingShouldWork() {
		App app = new App();

		Parameter p = new Parameter();
		p.setKey("rm");
		p.setValue("true");

		app.setContainer(new Container());
		app.getContainer().setDocker(new Docker());
		app.getContainer().getDocker().setParameters(Collections.singletonList(p));
		app.setIpAddress(new IPAddress());
		app.getIpAddress().setNetworkName("yo-network");

		Assert.assertEquals("JSON output incorrect!", json, ModelUtils.GSON.toJson(app));
	}
}
