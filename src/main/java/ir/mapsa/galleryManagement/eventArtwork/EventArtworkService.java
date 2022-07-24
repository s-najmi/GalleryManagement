package ir.mapsa.galleryManagement.eventArtwork;

import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import ir.mapsa.galleryManagement.generic.ServiceGeneric;
import org.springframework.stereotype.Service;


@Service
public class EventArtworkService extends ServiceGeneric<EventArtwork, EventArtworkDTO, Long> implements IEventArtworkService {
    private final IEventArtworkRepository repository;
    private final IEventArtworkMapper mapper;

    public EventArtworkService(IEventArtworkRepository repository, IEventArtworkMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public IRepositoryGeneric<EventArtwork, Long> getRepository() {
        return repository;
    }

    @Override
    public IMapperGeneric<EventArtwork, EventArtworkDTO> getMapper() {
        return mapper;
    }
}