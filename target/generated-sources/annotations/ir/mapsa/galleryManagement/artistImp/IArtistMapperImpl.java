package ir.mapsa.galleryManagement.artistImp;

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
public class IArtistMapperImpl implements IArtistMapper {

    @Override
    public Artist toEntity(ArtistDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Artist artist = new Artist();

        artist.setId( dto.getId() );
        artist.setFullname( dto.getFullname() );
        artist.setNationalCode( dto.getNationalCode() );
        artist.setBirthDate( dto.getBirthDate() );

        return artist;
    }

    @Override
    public ArtistDTO toDTO(Artist entity) {
        if ( entity == null ) {
            return null;
        }

        ArtistDTO artistDTO = new ArtistDTO();

        artistDTO.setId( entity.getId() );
        artistDTO.setFullname( entity.getFullname() );
        artistDTO.setNationalCode( entity.getNationalCode() );
        artistDTO.setBirthDate( entity.getBirthDate() );

        return artistDTO;
    }

    @Override
    public List<ArtistDTO> toDTOs(List<Artist> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ArtistDTO> list = new ArrayList<ArtistDTO>( entities.size() );
        for ( Artist artist : entities ) {
            list.add( toDTO( artist ) );
        }

        return list;
    }
}
