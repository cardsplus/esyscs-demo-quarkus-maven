package esy.demo.api;

import lombok.SneakyThrows;

public final class PersonFixture {

    private PersonFixture() {}

    @SneakyThrows
    public static Person max() {
        return Person.parseJson(
                """
                {
                    "name": "Max Mustermann",
                    "mail": "m.mustermann@we.com",
                    "birthday": "1969-04-22",
                    "gender": "m"
                }
                """);
    }
}
