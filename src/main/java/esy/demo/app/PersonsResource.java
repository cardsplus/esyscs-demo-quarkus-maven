package esy.demo.app;

import esy.demo.api.Person;
import esy.demo.api.PersonDto;
import esy.demo.api.PersonMapper;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Path("/api/persons")
public class PersonsResource {

    private final PersonRepository personRepository;

    @Inject
    public PersonsResource(final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<PersonDto> getAll() {
        return personRepository
                .listAll()
                .stream()
                .map(PersonMapper.INSTANCE::toDto)
                .toList();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Optional<PersonDto> getOne(final UUID id) {
        return personRepository
                .findByIdOptional(id)
                .map(PersonMapper.INSTANCE::toDto);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}/birthday")
    public LocalDate getBirthday(final UUID id) {
        return personRepository
                .findByIdOptional(id)
                .map(Person::getBirthday)
                .orElseThrow(() -> new NotFoundException(
                        String.format("person with id '%s' does not exist", id)));
    }
}
