package ir.mapsa.galleryManagement.artworkGenre;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class ArtworkGenreKey implements Serializable {
    @Column(name = "artwork_id")
    private Long artworkId;

    @Column(name = "genre_id")
    private Long genreId;
}
