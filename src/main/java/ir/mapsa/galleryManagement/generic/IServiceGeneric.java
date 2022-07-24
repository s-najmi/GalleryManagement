package ir.mapsa.galleryManagement.generic;

import java.util.Collection;
import java.util.Optional;

public interface IServiceGeneric<T, D, PK> {
    D save(D dto);
    D update(D dto);
    Optional<D> getByID(PK id);
    Collection<D> findAll();
    void delete(PK id);
}
