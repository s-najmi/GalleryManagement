package ir.mapsa.galleryManagement.user;

import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IUserMapper extends IMapperGeneric<User, UserDTO> {
}
