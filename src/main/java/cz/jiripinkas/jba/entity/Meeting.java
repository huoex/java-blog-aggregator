package cz.jiripinkas.jba.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Meeting {

    @EmbeddedId
    private MeetingId id; 

    @MapsId("eventId")
    @JoinColumns({
        @JoinColumn(name="EventID", referencedColumnName="EventID"),
        @JoinColumn(name="SourceID", referencedColumnName="SourceID")
    })
    @ManyToOne
    private Event event;
}