package esy.demo.api;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class PersonTest {

    @Test
    void max() {
        final var entity = PersonFixture.max();
        assertNull(entity.getId());
        assertEquals("Max Mustermann", entity.getName());
        assertEquals("m.mustermann@we.com", entity.getMail());
        assertEquals(LocalDate.of(1969, 4, 22), entity.getBirthday());
        assertEquals("m", entity.getGender());
    }
}