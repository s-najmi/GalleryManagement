package ir.mapsa.galleryManagement.artworkGenre;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-24T16:34:32+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class IArtworkGenreMapperImpl implements IArtworkGenreMapper {

    @Override
    public ArtworkGenre toEntity(ArtworkGenreDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ArtworkGenre artworkGenre = new ArtworkGenre();

        artworkGenre.setArtwork( dto.getArtwork() );
        artworkGenre.setGenre( dto.getGenre() );

        return artworkGenre;
    }

    @Override
    public ArtworkGenreDTO toDTO(ArtworkGenre entity) {
        if ( entity == null ) {
            return null;
        }

        ArtworkGenreDTO artworkGenreDTO = new ArtworkGenreDTO();

        artworkGenreDTO.setArtwork( entity.getArtwork() );
        artworkGenreDTO.setGenre( entity.getGenre() );

        return artworkGenreDTO;
    }

    @Override
    public List<ArtworkGenreDTO> toDTOs(List<ArtworkGenre> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ArtworkGenreDTO> list = new ArrayList<ArtworkGenreDTO>( entities.size() );
        for ( ArtworkGenre artworkGenre : entities ) {
            list.add( toDTO( artworkGenre ) );
        }

        return list;
    }
}
