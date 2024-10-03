package esy.demo.app;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class GiftsResourceTest {

    @Test
    void gifts() {
        given()
                .when().get("/api/gifts")
                .then()
                .statusCode(200);
    }
}