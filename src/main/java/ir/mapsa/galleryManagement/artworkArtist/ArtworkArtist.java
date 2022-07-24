package ir.mapsa.galleryManagement.artworkArtist;

import ir.mapsa.galleryManagement.artistImp.Artist;
import ir.mapsa.galleryManagement.artwork.Artwork;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtworkArtist {
    @EmbeddedId
    private ArtworkArtistKey id = new ArtworkArtistKey();

    @ManyToOne
    @MapsId("artworkId")
    @JoinColumn(name = "artwork_id",insertable = false,updatable = false)
    private Artwork artwork;

    @ManyToOne
    @MapsId("artistId")
    @JoinColumn(name = "artist_id",insertable = false,updatable = false)
    private Artist artist;
}
