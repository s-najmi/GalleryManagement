package ir.mapsa.galleryManagement.artworkArtist;

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
public class IArtworkArtistMapperImpl implements IArtworkArtistMapper {

    @Override
    public ArtworkArtist toEntity(ArtworkArtistDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ArtworkArtist artworkArtist = new ArtworkArtist();

        artworkArtist.setArtwork( dto.getArtwork() );
        artworkArtist.setArtist( dto.getArtist() );

        return artworkArtist;
    }

    @Override
    public ArtworkArtistDTO toDTO(ArtworkArtist entity) {
        if ( entity == null ) {
            return null;
        }

        ArtworkArtistDTO artworkArtistDTO = new ArtworkArtistDTO();

        artworkArtistDTO.setArtwork( entity.getArtwork() );
        artworkArtistDTO.setArtist( entity.getArtist() );

        return artworkArtistDTO;
    }

    @Override
    public List<ArtworkArtistDTO> toDTOs(List<ArtworkArtist> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ArtworkArtistDTO> list = new ArrayList<ArtworkArtistDTO>( entities.size() );
        for ( ArtworkArtist artworkArtist : entities ) {
            list.add( toDTO( artworkArtist ) );
        }

        return list;
    }
}
