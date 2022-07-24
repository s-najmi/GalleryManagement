package ir.mapsa.galleryManagement.artworkArtist;

import ir.mapsa.galleryManagement.artistImp.IArtistMapper;
import ir.mapsa.galleryManagement.artwork.IArtworkMapper;
import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {IArtworkMapper.class, IArtistMapper.class})
public interface IArtworkArtistMapper extends IMapperGeneric<ArtworkArtist, ArtworkArtistDTO>{
}