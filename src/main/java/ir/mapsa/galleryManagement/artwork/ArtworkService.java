package ir.mapsa.galleryManagement.artwork;

import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import ir.mapsa.galleryManagement.generic.ServiceGeneric;
import org.springframework.stereotype.Service;


@Service
public class ArtworkService extends ServiceGeneric<Artwork, ArtworkDTO, Long> implements IArtworkService {
    private final IArtworkRepository repository;
    private final IArtworkMapper mapper;

    public ArtworkService(IArtworkRepository repository, IArtworkMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public IRepositoryGeneric<Artwork, Long> getRepository() {
        return repository;
    }

    @Override
    public IMapperGeneric<Artwork, ArtworkDTO> getMapper() {
        return mapper;
    }
}