package ir.mapsa.galleryManagement.artworkGenre;

import ir.mapsa.galleryManagement.artwork.IArtworkMapper;
import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import ir.mapsa.galleryManagement.genreImp.IGenreMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {IArtworkMapper.class, IGenreMapper.class})
public interface IArtworkGenreMapper  extends IMapperGeneric<ArtworkGenre, ArtworkGenreDTO>{
}