package ir.mapsa.galleryManagement.artworkArtist;

import ir.mapsa.galleryManagement.artistImp.Artist;
import ir.mapsa.galleryManagement.artwork.Artwork;
import lombok.Data;

@Data
public class ArtworkArtistDTO {
    private Artwork artwork;
    private Artist artist;
}
