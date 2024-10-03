package esy.demo.app;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
class PersonsResourceTest {

    @Test
    void persons() {
        given()
                .when()
                .get("/api/persons")
                .then()
                .statusCode(200);
    }
}