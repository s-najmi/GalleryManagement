package ir.mapsa.galleryManagement.artworkArtist;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artworkartist/v1")
@AllArgsConstructor
public class ArtworkArtistController {
    private final IArtworkArtistService service;

    @PostMapping("/")
    public ResponseEntity<ArtworkArtistDTO> addNewArtworkArtist(@RequestBody ArtworkArtistDTO artworkArtistDTO){
        return new ResponseEntity<>(service.save(artworkArtistDTO), HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<ArtworkArtistDTO> updateArtworkArtist(@RequestBody ArtworkArtistDTO artworkArtistDTO){
        return new ResponseEntity<>(service.save(artworkArtistDTO), HttpStatus.OK);
    }

    @GetMapping("/")
    public List<ArtworkArtistDTO> getAll(){
        return (List<ArtworkArtistDTO>) service.findAll();
    }

    @GetMapping("/{id}")
    public ArtworkArtistDTO getByID(@PathVariable long id){
        return service.getByID(id).get();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArtworkArtist(@PathVariable long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
