package esy.demo.app;

import esy.demo.jsonplaceholder.api.PostsApi;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.time.LocalDate;

@Path("/hello")
public class GreetingResource {

    private final PostsApi postsApi;

    @Inject
    public GreetingResource(@RestClient final PostsApi postsApi) {
        this.postsApi = postsApi;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        final var day = LocalDate.now().getDayOfMonth();
        final var post = postsApi.getPost((long) day);
        return String.format("%d: %s", day, post.getTitle());
    }
}
