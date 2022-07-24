package ir.mapsa.galleryManagement.event;

import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import ir.mapsa.galleryManagement.generic.ServiceGeneric;
import org.springframework.stereotype.Service;


@Service
public class EventService extends ServiceGeneric<Event, EventDTO, Long> implements IEventService {
    private final IEventRepository repository;
    private final IEventMapper mapper;

    public EventService(IEventRepository repository, IEventMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public IRepositoryGeneric<Event, Long> getRepository() {
        return repository;
    }

    @Override
    public IMapperGeneric<Event, EventDTO> getMapper() {
        return mapper;
    }
}