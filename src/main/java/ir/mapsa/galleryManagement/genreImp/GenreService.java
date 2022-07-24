package ir.mapsa.galleryManagement.genreImp;

import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import ir.mapsa.galleryManagement.generic.ServiceGeneric;
import org.springframework.stereotype.Service;

@Service
public class GenreService extends ServiceGeneric<Genre, GenreDTO, Long> implements IGenreService {
    private final IGenreRepository repository;
    private final IGenreMapper mapper;

    public GenreService(IGenreRepository repository, IGenreMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public IRepositoryGeneric<Genre, Long> getRepository() {
        return repository;
    }

    @Override
    public IMapperGeneric<Genre, GenreDTO> getMapper() {
        return mapper;
    }
}
