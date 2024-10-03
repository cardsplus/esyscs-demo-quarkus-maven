package esy.demo.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonMapperTest {

    @Test
    void max() {
        final var entity = PersonFixture.max();
        final var dto = PersonMapper.INSTANCE.toDto(entity);
        assertEquals(entity.getId(), dto.getId());
        assertEquals(entity.getName(), dto.getName());
        assertEquals(entity.getMail(), dto.getMail());
    }
}