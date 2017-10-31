package uk.co.bigpicturetech.conferences.conferencemono.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Set;
import java.util.UUID;

@Entity
public class Schedule {

    public enum ScheduleStatus {
        NEW, PROVISIONAL, CONFIRMED, COMPLETED
    }

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID id;
    @Transient //TODO: Add as persistent
    private Set<Session> sessions;
    private ScheduleStatus status;

    public Schedule() {
    }

    public UUID getId() {
        return id;
    }

    public Set<Session> getSessions() {
        return sessions;
    }

    public void setSessions(Set<Session> sessions) {
        this.sessions = sessions;
    }

    public ScheduleStatus getStatus() {
        return status;
    }

    public void setStatus(ScheduleStatus status) {
        this.status = status;
    }
}
