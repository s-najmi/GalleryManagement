package ir.mapsa.galleryManagement.artistImp;

import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IArtistMapper extends IMapperGeneric<Artist, ArtistDTO> {
}
