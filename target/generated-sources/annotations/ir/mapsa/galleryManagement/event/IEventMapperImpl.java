package ir.mapsa.galleryManagement.event;

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
public class IEventMapperImpl implements IEventMapper {

    @Override
    public Event toEntity(EventDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Event event = new Event();

        event.setId( dto.getId() );
        event.setTitle( dto.getTitle() );
        event.setStatus( dto.getStatus() );

        return event;
    }

    @Override
    public EventDTO toDTO(Event entity) {
        if ( entity == null ) {
            return null;
        }

        EventDTO eventDTO = new EventDTO();

        eventDTO.setId( entity.getId() );
        eventDTO.setTitle( entity.getTitle() );
        eventDTO.setStatus( entity.getStatus() );

        return eventDTO;
    }

    @Override
    public List<EventDTO> toDTOs(List<Event> entities) {
        if ( entities == null ) {
            return null;
        }

        List<EventDTO> list = new ArrayList<EventDTO>( entities.size() );
        for ( Event event : entities ) {
            list.add( toDTO( event ) );
        }

        return list;
    }
}
