package ir.mapsa.galleryManagement.eventArtwork;

import ir.mapsa.galleryManagement.artwork.IArtworkMapper;
import ir.mapsa.galleryManagement.event.IEventMapper;
import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {IArtworkMapper.class, IEventMapper.class})
public interface IEventArtworkMapper extends IMapperGeneric<EventArtwork, EventArtworkDTO>{
}