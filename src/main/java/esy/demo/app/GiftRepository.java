package esy.demo.app;

import esy.demo.api.Gift;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class GiftRepository implements PanacheRepositoryBase<Gift, UUID> {
}
