package esy.demo.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

import java.util.UUID;

@Entity
public class Gift {

    @Id
    @Getter
    private UUID id;

    @Getter
    @JsonProperty
    private String name;
}