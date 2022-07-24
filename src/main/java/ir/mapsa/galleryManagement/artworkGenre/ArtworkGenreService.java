package ir.mapsa.galleryManagement.artworkGenre;

import ir.mapsa.galleryManagement.artwork.IArtworkService;
import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import ir.mapsa.galleryManagement.generic.ServiceGeneric;
import ir.mapsa.galleryManagement.genreImp.IGenreMapper;
import ir.mapsa.galleryManagement.genreImp.IGenreService;
import org.springframework.stereotype.Service;


@Service
public class ArtworkGenreService extends ServiceGeneric<ArtworkGenre, ArtworkGenreDTO, Long> implements IArtworkGenreService {
    private final IArtworkGenreRepository repository;
    private final IArtworkGenreMapper mapper;
//    private final IArtworkService artworkService;
//    private final IGenreService genreService;


    public ArtworkGenreService(IArtworkGenreRepository repository, IArtworkGenreMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public IRepositoryGeneric<ArtworkGenre, Long> getRepository() {
        return repository;
    }

    @Override
    public IMapperGeneric<ArtworkGenre, ArtworkGenreDTO> getMapper() {
        return mapper;
    }

//    @Override
//    public ArtworkGenreDTO save(ArtworkGenreDTO dto) {
//        ArtworkGenre artworkGenre = getMapper().toEntity(dto);
//        artworkGenre.setArtwork(artworkGenre.get);
//        return getMapper().toDTO(getRepository().save(getMapper().toEntity(dto)));
//    }
}