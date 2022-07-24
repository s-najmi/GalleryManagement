package ir.mapsa.galleryManagement.artwork;

import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtworkRepository extends IRepositoryGeneric<Artwork, Long> {
}