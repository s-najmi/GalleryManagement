package ir.mapsa.galleryManagement.event;

import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventRepository extends IRepositoryGeneric<Event, Long> {
}