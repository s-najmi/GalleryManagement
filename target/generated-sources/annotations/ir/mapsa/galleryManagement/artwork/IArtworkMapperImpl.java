package ir.mapsa.galleryManagement.artwork;

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
public class IArtworkMapperImpl implements IArtworkMapper {

    @Override
    public Artwork toEntity(ArtworkDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Artwork artwork = new Artwork();

        artwork.setId( dto.getId() );
        artwork.setTitle( dto.getTitle() );
        artwork.setProductDate( dto.getProductDate() );
        artwork.setPrice( dto.getPrice() );

        return artwork;
    }

    @Override
    public ArtworkDTO toDTO(Artwork entity) {
        if ( entity == null ) {
            return null;
        }

        ArtworkDTO artworkDTO = new ArtworkDTO();

        artworkDTO.setId( entity.getId() );
        artworkDTO.setTitle( entity.getTitle() );
        artworkDTO.setProductDate( entity.getProductDate() );
        artworkDTO.setPrice( entity.getPrice() );

        return artworkDTO;
    }

    @Override
    public List<ArtworkDTO> toDTOs(List<Artwork> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ArtworkDTO> list = new ArrayList<ArtworkDTO>( entities.size() );
        for ( Artwork artwork : entities ) {
            list.add( toDTO( artwork ) );
        }

        return list;
    }
}
