package ir.mapsa.galleryManagement.artistImp;

import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import org.springframework.stereotype.Repository;

@Repository
public interface IArtistRepository extends IRepositoryGeneric<Artist, Long> {
}
