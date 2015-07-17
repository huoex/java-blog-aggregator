package cz.jiripinkas.jba.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class MeetingId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "MeetingID")
    private Long meetingId;

    private EventId eventId;

	@Override
	public int hashCode() {
        return ( meetingId ).hashCode();
    }
	
	@Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof MeetingId)) return false;
        MeetingId pk = (MeetingId) obj;
        return pk.meetingId == meetingId && pk.eventId == eventId;
    }
}