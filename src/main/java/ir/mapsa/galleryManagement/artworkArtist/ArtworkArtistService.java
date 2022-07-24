package ir.mapsa.galleryManagement.artworkArtist;

import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import ir.mapsa.galleryManagement.generic.ServiceGeneric;
import org.springframework.stereotype.Service;


@Service
public class ArtworkArtistService extends ServiceGeneric<ArtworkArtist, ArtworkArtistDTO, Long> implements IArtworkArtistService {
    private final IArtworkArtistRepository repository;
    private final IArtworkArtistMapper mapper;

    public ArtworkArtistService(IArtworkArtistRepository repository, IArtworkArtistMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public IRepositoryGeneric<ArtworkArtist, Long> getRepository() {
        return repository;
    }

    @Override
    public IMapperGeneric<ArtworkArtist, ArtworkArtistDTO> getMapper() {
        return mapper;
    }
}