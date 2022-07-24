package ir.mapsa.galleryManagement.event;

import ir.mapsa.galleryManagement.artwork.ArtworkDTO;
import ir.mapsa.galleryManagement.artwork.IArtworkService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event/v1")
@AllArgsConstructor
public class EventController {
    private final IEventService service;

    @PostMapping("/")
    public ResponseEntity<EventDTO> addNewEvent(@RequestBody EventDTO eventDTO){
        return new ResponseEntity<>(service.save(eventDTO), HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<EventDTO> updateEvent(@RequestBody EventDTO eventDTO){
        return new ResponseEntity<>(service.save(eventDTO), HttpStatus.OK);
    }

    @GetMapping("/")
    public List<EventDTO> getAll(){
        return (List<EventDTO>) service.findAll();
    }

    @GetMapping("/{id}")
    public EventDTO getByID(@PathVariable long id){
        return service.getByID(id).get();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
