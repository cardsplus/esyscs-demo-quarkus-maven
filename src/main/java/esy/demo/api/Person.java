package esy.demo.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Person {

    @Id
    @Getter
    private UUID id;

    @Email
    @Getter
    @JsonProperty
    private String mail;

    @Getter
    @JsonProperty
    private String name;

    @Getter
    @JsonProperty
    private String gender;

    @Getter
    @JsonProperty
    private LocalDate birthday;
}
