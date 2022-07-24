package ir.mapsa.galleryManagement.artworkGenre;

import ir.mapsa.galleryManagement.artwork.Artwork;
import ir.mapsa.galleryManagement.genreImp.Genre;
import lombok.Data;

import java.util.Date;

@Data
public class ArtworkGenreDTO {
    private Artwork artwork;
    private Genre genre;
}
