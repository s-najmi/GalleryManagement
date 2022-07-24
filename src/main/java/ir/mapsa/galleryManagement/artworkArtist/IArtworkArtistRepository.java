package ir.mapsa.galleryManagement.artworkArtist;

import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtworkArtistRepository extends IRepositoryGeneric<ArtworkArtist, Long> {
}