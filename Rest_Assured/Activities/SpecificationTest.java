package activity;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;


public class SpecificationTest {

    RequestSpecification requestSpec;
    ResponseSpecification responseSpec;



    @BeforeClass
    public void setUp(){
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2/pet")
                .addHeader("Content-Type", "application/json")
                .build();

        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectResponseTime(lessThanOrEqualTo(3000L))
                .expectBody("status", equalTo("alive"))
                .build();
    }

    @Test
    public void postRequestTest(){
        Map<String, Object> reqBody = new HashMap<>();
              reqBody.put("id", 110011);
              reqBody.put("name", "cheekoo");
              reqBody.put("status", "alive");

        Response response = given().spec(requestSpec).body(reqBody).when().post();
    }
}
