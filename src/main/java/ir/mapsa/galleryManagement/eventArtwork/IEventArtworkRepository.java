package ir.mapsa.galleryManagement.eventArtwork;

import ir.mapsa.galleryManagement.generic.IRepositoryGeneric;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventArtworkRepository extends IRepositoryGeneric<EventArtwork, Long> {
}