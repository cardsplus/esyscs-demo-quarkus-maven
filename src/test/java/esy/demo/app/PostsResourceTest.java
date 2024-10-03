package esy.demo.app;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.startsWith;

@QuarkusTest
class PostsResourceTest {

    @Test
    void title() {
        final var day = LocalDate.now().getDayOfMonth();
        given()
                .when()
                .get("/api/posts/title")
                .then()
                .statusCode(200)
                .body(startsWith(day + ": "));
    }
}