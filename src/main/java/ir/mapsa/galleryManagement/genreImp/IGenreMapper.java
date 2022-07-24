package ir.mapsa.galleryManagement.genreImp;

import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IGenreMapper extends IMapperGeneric<Genre, GenreDTO> {
}
