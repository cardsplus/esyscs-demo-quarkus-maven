package esy.demo.app;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.startsWith;

@QuarkusTest
class GiftsResourceTest {

    @Test
    void gifts() {
        final var day = LocalDate.now().getDayOfMonth();
        given()
                .when().get("/api/gifts")
                .then()
                .statusCode(200);
    }
}