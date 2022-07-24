package ir.mapsa.galleryManagement.user;

import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends IRepositoryGeneric<User, Long> {
    Optional<User> findByNationalCode(String nationalCode);
}
