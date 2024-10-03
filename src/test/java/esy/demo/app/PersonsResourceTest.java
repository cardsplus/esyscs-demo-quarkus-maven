package esy.demo.app;

import esy.demo.api.PersonDto;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.common.mapper.TypeRef;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class PersonsResourceTest {

    @Test
    void persons() {
        final var allPerson = given()
                .when()
                .get("/api/persons")
                .then()
                .statusCode(200)
                .extract()
                .as(new TypeRef<List<PersonDto>>() {});
        assertEquals(0, allPerson.size());
    }
}