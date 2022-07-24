package ir.mapsa.galleryManagement.artwork;

import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IArtworkMapper extends IMapperGeneric<Artwork, ArtworkDTO> {
}