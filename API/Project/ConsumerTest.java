package liveProject;

import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

@ExtendWith(PactConsumerTestExt.class)
public class ConsumerTest {
    //Add headers
    Map<String, String> headers = new HashMap<>();

    //Make the contract
    @Pact(consumer = "userConsumer", provider = "UserProvider")
    public RequestResponsePact createpact(PactDslWithProvider builder){

        //Set the header
        headers.put("Content-Type","application/json");

        // Set the body
        DslPart requestResponseBody = new PactDslJsonBody()
                .numberType("id", 880808)
                .stringType("firstName", "naveen")
                .stringType("lastName","kumar")
                .stringType("email","abc@gmail.com");

        //Write the interaction
        return builder.given("request to create a user")
                .uponReceiving("request to create a user")
                    .method("POST")
                    .path("/api/users")
                    .headers(headers)
                    .body(requestResponseBody)
                .willRespondWith()
                    .status(201)
                    .body(requestResponseBody)
                .toPact();


    }

    //Test with Provider mock

    @Test
    @PactTestFor(providerName = "UserProvider", port = "8282")
    public void postRequestTest() {
        // Request Body
        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("id", 880808);
        reqBody.put("firstName", "naveen");
        reqBody.put("lastName", "kumar");
        reqBody.put("email", "abc@gmail.com");

        // Send the POST request
        given().baseUri("http://localhost:8282/api/users").headers(headers).body(reqBody).
                when().post().then().statusCode(201).log().all();
    }

}
