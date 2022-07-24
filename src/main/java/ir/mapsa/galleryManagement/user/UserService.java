package ir.mapsa.galleryManagement.user;

import ir.mapsa.galleryManagement.generic.IMapperGeneric;
import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import ir.mapsa.galleryManagement.generic.ServiceGeneric;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class UserService extends ServiceGeneric<User, UserDTO, Long> implements IUserService {
    private final IUserRepository repository;
    private final IUserMapper mapper;

    public UserService(IUserRepository repository, IUserMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public IRepositoryGeneric<User, Long> getRepository() {
        return repository;
    }

    @Override
    public IMapperGeneric<User, UserDTO> getMapper() {
        return mapper;
    }

    public Optional<User> findUsername(String username){
        Optional<User> opt = repository.findByNationalCode(username);
        if (opt.isPresent())
            return opt;
        return Optional.empty();
    }

    public void setTokenInDB(String token, Date expDate, User user){
        user.setToken(token);
        user.setExpireDate(expDate);
        repository.save(user);
    }
}
