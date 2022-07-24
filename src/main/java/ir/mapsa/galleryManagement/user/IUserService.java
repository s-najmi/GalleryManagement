package ir.mapsa.galleryManagement.user;

import ir.mapsa.galleryManagement.generic.IServiceGeneric;

import java.util.Date;
import java.util.Optional;

public interface IUserService extends IServiceGeneric<User, UserDTO, Long> {
    Optional<User> findUsername(String username);
    void setTokenInDB(String token, Date expDate, User user);
}
