package esy.demo.app;

import esy.demo.jsonplaceholder.api.PostsApi;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.time.LocalDate;

@Path("/api/posts")
public class PostsResource {

    private final PostsApi postsApi;

    @Inject
    public PostsResource(@RestClient final PostsApi postsApi) {
        this.postsApi = postsApi;
    }

    @GET
    @Path("/title")
    @Produces(MediaType.TEXT_PLAIN)
    public String title() {
        final var day = LocalDate.now().getDayOfMonth();
        final var post = postsApi.getPost((long) day);
        return String.format("%d: %s", day, post.getTitle());
    }
}
