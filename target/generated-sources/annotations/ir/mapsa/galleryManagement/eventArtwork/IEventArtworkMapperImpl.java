package ir.mapsa.galleryManagement.eventArtwork;

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
public class IEventArtworkMapperImpl implements IEventArtworkMapper {

    @Override
    public EventArtwork toEntity(EventArtworkDTO dto) {
        if ( dto == null ) {
            return null;
        }

        EventArtwork eventArtwork = new EventArtwork();

        eventArtwork.setEvent( dto.getEvent() );
        eventArtwork.setArtwork( dto.getArtwork() );

        return eventArtwork;
    }

    @Override
    public EventArtworkDTO toDTO(EventArtwork entity) {
        if ( entity == null ) {
            return null;
        }

        EventArtworkDTO eventArtworkDTO = new EventArtworkDTO();

        eventArtworkDTO.setEvent( entity.getEvent() );
        eventArtworkDTO.setArtwork( entity.getArtwork() );

        return eventArtworkDTO;
    }

    @Override
    public List<EventArtworkDTO> toDTOs(List<EventArtwork> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EventArtworkDTO> list = new ArrayList<EventArtworkDTO>( entities.size() );
        for ( EventArtwork eventArtwork : entities ) {
            list.add( toDTO( eventArtwork ) );
        }

        return list;
    }
}
