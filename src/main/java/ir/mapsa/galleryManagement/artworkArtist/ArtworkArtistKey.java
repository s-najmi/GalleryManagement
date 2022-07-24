package ir.mapsa.galleryManagement.artworkArtist;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class ArtworkArtistKey implements Serializable {
    @Column(name = "artwork_id")
    private Long artworkId;

    @Column(name = "artist_id")
    private Long artistId;
}
