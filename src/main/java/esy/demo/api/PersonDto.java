package esy.demo.api;

import lombok.Data;

import java.util.UUID;

@Data
public class PersonDto {
    private UUID id;
    private String mail;
    private String name;
}
