package uk.co.bigpicturetech.conferences.conferencemono.repo;

import org.springframework.data.repository.CrudRepository;
import uk.co.bigpicturetech.conferences.conferencemono.model.Conference;
import uk.co.bigpicturetech.conferences.conferencemono.model.User;

import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {
}
