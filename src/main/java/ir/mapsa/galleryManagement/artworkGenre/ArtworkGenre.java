package ir.mapsa.galleryManagement.artworkGenre;

import ir.mapsa.galleryManagement.artwork.Artwork;
import ir.mapsa.galleryManagement.genreImp.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtworkGenre {
    @EmbeddedId
    private ArtworkGenreKey id = new ArtworkGenreKey();

    @ManyToOne
    @MapsId("artworkId")
    @JoinColumn(name = "artwork_id",insertable = false,updatable = false)
    private Artwork artwork;

    @ManyToOne
    @MapsId("genreId")
    @JoinColumn(name = "genre_id",insertable = false,updatable = false)
    private Genre genre;
}
