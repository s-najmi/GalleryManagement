package ir.mapsa.galleryManagement.event;

import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IEventMapper extends IMapperGeneric<Event, EventDTO> {
}