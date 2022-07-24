package ir.mapsa.galleryManagement.eventArtwork;

import ir.mapsa.galleryManagement.artwork.Artwork;
import ir.mapsa.galleryManagement.event.Event;
import lombok.Data;

@Data
public class EventArtworkDTO {
    private Event event;
    private Artwork artwork;
}
