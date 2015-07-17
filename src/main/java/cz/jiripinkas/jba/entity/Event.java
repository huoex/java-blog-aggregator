package cz.jiripinkas.jba.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Event {

    @EmbeddedId
    private EventId id;

    @OneToMany(mappedBy = "event")
    private List<Meeting> meetings = new ArrayList<Meeting>();
}