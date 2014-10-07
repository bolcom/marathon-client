package mesosphere.marathon.client;

import feign.Response;
import feign.codec.ErrorDecoder;
import static feign.FeignException.errorStatus;

    
public class MarathonErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() >= 400 && response.status() <= 499) {
            return new MarathonClientException(
                    response.status(),
                    response.reason()
            );
        }
        if (response.status() >= 500 && response.status() <= 599) {
            return new MarathonClientException(
                    response.status(),
                    response.reason()
            );
        }
        return errorStatus(methodKey, response);
    }
}
