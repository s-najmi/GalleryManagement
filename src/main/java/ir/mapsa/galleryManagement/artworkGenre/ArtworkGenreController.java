package ir.mapsa.galleryManagement.artworkGenre;

import ir.mapsa.galleryManagement.artwork.ArtworkDTO;
import ir.mapsa.galleryManagement.artwork.IArtworkService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artworkgenre/v1")
@AllArgsConstructor
public class ArtworkGenreController {
    private final IArtworkGenreService service;

    @PostMapping("/")
    public ResponseEntity<ArtworkGenreDTO> addNewArtworkGenre(@RequestBody ArtworkGenreDTO artworkGenreDTO){

        return new ResponseEntity<>(service.save(artworkGenreDTO), HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<ArtworkGenreDTO> updateArtworkGenre(@RequestBody ArtworkGenreDTO artworkGenreDTO){
        return new ResponseEntity<>(service.save(artworkGenreDTO), HttpStatus.OK);
    }

    @GetMapping("/")
    public List<ArtworkGenreDTO> getAll(){
        return (List<ArtworkGenreDTO>) service.findAll();
    }

    @GetMapping("/{id}")
    public ArtworkGenreDTO getByID(@PathVariable long id){
        return service.getByID(id).get();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArtworkGenre(@PathVariable long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
