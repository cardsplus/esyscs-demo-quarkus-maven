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

    private final GiftRepository giftRepository;

    @Inject
    public GiftsResource(final GiftRepository giftRepository) {
        this.giftRepository = giftRepository;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Gift> getAll() {
        return giftRepository.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Optional<Gift> getOne(final UUID id) {
        return giftRepository.findByIdOptional(id);
    }
}
