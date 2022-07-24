package ir.mapsa.galleryManagement.artistImp;

import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import ir.mapsa.galleryManagement.generic.ServiceGeneric;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends ServiceGeneric<Artist, ArtistDTO, Long> implements IArtistService {
    private final IArtistRepository repository;
    private final IArtistMapper mapper;

    public ArtistService(IArtistRepository repository, IArtistMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public IRepositoryGeneric<Artist, Long> getRepository() {
        return repository;
    }

    @Override
    public IMapperGeneric<Artist, ArtistDTO> getMapper() {
        return mapper;
    }
}
