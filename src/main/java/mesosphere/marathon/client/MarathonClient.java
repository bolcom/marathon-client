package mesosphere.marathon.client;

import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import mesosphere.marathon.client.utils.ModelUtils;

public class MarathonClient {
	static class MarathonHeadersInterceptor implements RequestInterceptor {
		@Override
		public void apply(RequestTemplate template) {
			template.header("Accept", "application/json");
			template.header("Content-Type", "application/json");
		}
	}

	public static Marathon getInstance(String endpoint) {
		GsonDecoder decoder = new GsonDecoder(ModelUtils.GSON);
		GsonEncoder encoder = new GsonEncoder(ModelUtils.GSON);
		return Feign.builder().encoder(encoder).decoder(decoder)
				.requestInterceptor(new MarathonHeadersInterceptor())
				.errorDecoder(new MarathonErrorDecoder())
				.target(Marathon.class, endpoint);
	}
}
