package ir.mapsa.galleryManagement.generic;

import ir.mapsa.galleryManagement.exception.NotFoundException;

import java.util.Collection;
import java.util.Optional;


public abstract class ServiceGeneric<T, D, PK> implements IServiceGeneric<T, D, PK> {
    public abstract IRepositoryGeneric<T, PK> getRepository();
    public abstract IMapperGeneric<T, D> getMapper();

    @Override
    public D save(D dto) {
        return getMapper().toDTO(getRepository().save(getMapper().toEntity(dto)));
    }

    @Override
    public Optional<D> getByID(PK id) {
        Optional opt = getRepository().findById(id);
        if(opt.isEmpty())
            throw new NotFoundException("not matched!");
        return Optional.of(getMapper().toDTO((T) opt.get()));
    }

    @Override
    public Collection<D> findAll() {
        return getMapper().toDTOs(getRepository().findAll());
    }

    @Override
    public D update(D dto) {
        return getMapper().toDTO(getRepository().save(getMapper().toEntity(dto)));
    }

    @Override
    public void delete(PK id) {
        getByID(id);
        getRepository().deleteById(id);
    }
}
