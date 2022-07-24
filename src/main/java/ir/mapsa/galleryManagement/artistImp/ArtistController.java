package ir.mapsa.galleryManagement.artistImp;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artist/v1")
@AllArgsConstructor
public class ArtistController {
    private final IArtistService service;

    @PostMapping("/")
    public ResponseEntity<ArtistDTO> addNewArtist(@RequestBody ArtistDTO artist){
        return new ResponseEntity<>(service.save(artist), HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<ArtistDTO> updateArtist(@RequestBody ArtistDTO artist){
        return new ResponseEntity<>(service.save(artist), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public List<ArtistDTO> getAll(){
        return (List<ArtistDTO>) service.findAll();
    }

    @GetMapping("/{id}")
    public ArtistDTO getByID(@PathVariable long id){
        return service.getByID(id).get();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArtist(@PathVariable long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
