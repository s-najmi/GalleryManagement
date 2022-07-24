package ir.mapsa.galleryManagement.generic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IRepositoryGeneric<T, PK> extends JpaRepository<T, PK> {
}
