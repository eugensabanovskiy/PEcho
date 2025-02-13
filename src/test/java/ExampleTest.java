import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ExampleTest {

    @Test
    public void testPostRequest() {

        RestAssured.baseURI = "https://postman-echo.com";


        given()
                .body("some data")
                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("Wrong data"));
    }
}