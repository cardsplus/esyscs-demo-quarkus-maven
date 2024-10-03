package esy.demo.app;

import esy.demo.api.Person;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

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
    public List<Person> getAll() {
        return personRepository.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Optional<Person> getOne(final UUID id) {
        return personRepository.findByIdOptional(id);
    }
}
