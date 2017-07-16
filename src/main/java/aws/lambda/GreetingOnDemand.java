package aws.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import aws.lambda.Person;

public class GreetingOnDemand implements RequestHandler<Person, Object> {

    @Override
    public String handleRequest(Person input, Context context) {
        String who = "World";
        if (input.getName() != null) {
            who = input.getName();
        }
        String greeting = "Hello, " + who + "!";
        System.out.println(greeting);
        return greeting;
    }
}
