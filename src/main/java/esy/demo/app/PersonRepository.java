package esy.demo.app;

import esy.demo.api.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class PersonRepository implements PanacheRepositoryBase<Person, UUID> {
}
