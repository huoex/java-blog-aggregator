package cz.jiripinkas.jba.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EventId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "EventID")
    private Long eventId;

    @Column(name = "SourceID")
    private Long sourceId;

	@Override
	public int hashCode() {
        return ( eventId ).hashCode();
    }
	
	@Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof EventId)) return false;
        EventId pk = (EventId) obj;
        return pk.eventId == eventId && pk.sourceId == sourceId;
    }
}