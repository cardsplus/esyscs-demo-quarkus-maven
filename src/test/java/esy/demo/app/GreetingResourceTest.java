package esy.demo.app;

import esy.demo.jsonplaceholder.api.PostsApi;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectSpy;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;

@QuarkusTest
class GreetingResourceTest {

    @Test
    void hello() {
        final var day = LocalDate.now().getDayOfMonth();
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(startsWith(day + ": "));
    }
}