package ir.mapsa.galleryManagement.eventArtwork;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class EventArtworkKey implements Serializable {
    @Column(name = "event_id")
    private Long eventId;

    @Column(name = "artwork_id")
    private Long artworkId;

}
