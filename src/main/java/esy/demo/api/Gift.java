package esy.demo.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

import java.util.UUID;

@Entity
@Getter
public class Gift {

    @Id
    private UUID id;

    @JsonProperty
    private String name;
}