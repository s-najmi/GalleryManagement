package ir.mapsa.galleryManagement.eventArtwork;

import ir.mapsa.galleryManagement.artwork.Artwork;
import ir.mapsa.galleryManagement.event.Event;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventArtwork {
    @EmbeddedId
    private EventArtworkKey id = new EventArtworkKey();

    @ManyToOne
    @MapsId("eventId")
    @JoinColumn(name = "event_id",insertable = false,updatable = false)
    private Event event;

    @ManyToOne
    @MapsId("artworkId")
    @JoinColumn(name = "artwork_id",insertable = false,updatable = false)
    private Artwork artwork;
}
