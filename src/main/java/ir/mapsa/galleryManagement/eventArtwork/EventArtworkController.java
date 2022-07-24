package ir.mapsa.galleryManagement.eventArtwork;

import ir.mapsa.galleryManagement.artworkGenre.ArtworkGenreDTO;
import ir.mapsa.galleryManagement.artworkGenre.IArtworkGenreService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventartwork/v1")
@AllArgsConstructor
public class EventArtworkController {
    private final IEventArtworkService service;

    @PostMapping("/")
    public ResponseEntity<EventArtworkDTO> addNewEventArtwork(@RequestBody EventArtworkDTO eventArtworkDTO){

        return new ResponseEntity<>(service.save(eventArtworkDTO), HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<EventArtworkDTO> updateEventArtwork(@RequestBody EventArtworkDTO eventArtworkDTO){
        return new ResponseEntity<>(service.save(eventArtworkDTO), HttpStatus.OK);
    }

    @GetMapping("/")
    public List<EventArtworkDTO> getAll(){
        return (List<EventArtworkDTO>) service.findAll();
    }

    @GetMapping("/{id}")
    public EventArtworkDTO getByID(@PathVariable long id){
        return service.getByID(id).get();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEventArtwork(@PathVariable long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
