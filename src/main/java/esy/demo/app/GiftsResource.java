package esy.demo.app;

import esy.demo.api.Gift;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Path("/api/gifts")
public class GiftsResource {

    private final GiftsRepository giftsRepository;

    @Inject
    public GiftsResource(final GiftsRepository giftsRepository) {
        this.giftsRepository = giftsRepository;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Gift> getAll() {
        return giftsRepository.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Optional<Gift> getOne(final UUID id) {
        return giftsRepository.findByIdOptional(id);
    }
}
