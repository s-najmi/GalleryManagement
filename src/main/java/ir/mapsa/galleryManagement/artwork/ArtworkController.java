package ir.mapsa.galleryManagement.artwork;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artwork/v1")
@AllArgsConstructor
public class ArtworkController {
    private final IArtworkService service;

    @PostMapping("/")
    public ResponseEntity<ArtworkDTO> addNewArtwork(@RequestBody ArtworkDTO artworkDTO){
        return new ResponseEntity<>(service.save(artworkDTO), HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<ArtworkDTO> updateArtwork(@RequestBody ArtworkDTO artworkDTO){
        return new ResponseEntity<>(service.save(artworkDTO), HttpStatus.OK);
    }

    @GetMapping("/")
    public List<ArtworkDTO> getAll(){
        return (List<ArtworkDTO>) service.findAll();
    }

    @GetMapping("/{id}")
    public ArtworkDTO getByID(@PathVariable long id){
        return service.getByID(id).get();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArtwork(@PathVariable long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
