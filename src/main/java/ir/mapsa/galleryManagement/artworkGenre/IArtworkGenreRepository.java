package ir.mapsa.galleryManagement.artworkGenre;

import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtworkGenreRepository extends IRepositoryGeneric<ArtworkGenre, Long> {
}