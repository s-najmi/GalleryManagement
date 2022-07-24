package ir.mapsa.galleryManagement.genreImp;

import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenreRepository extends IRepositoryGeneric<Genre, Long> {
}
