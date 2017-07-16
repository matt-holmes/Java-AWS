package aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import aws.lambda.Ip;

public class MyIp implements RequestHandler<Ip, Object> {

    @Override
    public String handleRequest(Ip input, Context context) {
        return input.getIp();
    }
}
