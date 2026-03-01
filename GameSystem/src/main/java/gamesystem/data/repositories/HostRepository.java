package gamesystem.data.repositories;

import gamesystem.data.models.Host;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HostRepository extends MongoRepository<Host, String> {
}
