package uk.co.bigpicturetech.conferences.conferencemono.repo;

import org.springframework.data.repository.CrudRepository;
import uk.co.bigpicturetech.conferences.conferencemono.model.Conference;
import uk.co.bigpicturetech.conferences.conferencemono.model.Session;

import java.util.UUID;

public interface ConferenceRepository extends CrudRepository<Conference, UUID> {
}
