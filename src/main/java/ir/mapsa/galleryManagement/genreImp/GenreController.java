package ir.mapsa.galleryManagement.genreImp;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre/v1")
@AllArgsConstructor
public class GenreController {
    private final IGenreService service;

    @PostMapping("/")
    public ResponseEntity<GenreDTO> addNewGenre(@RequestBody GenreDTO genre){
        return new ResponseEntity<>(service.save(genre), HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<GenreDTO> updateGenre(@RequestBody GenreDTO genre){
        return new ResponseEntity<>(service.save(genre), HttpStatus.OK);
    }

    @GetMapping("/")
    public List<GenreDTO> getAll(){
        return (List<GenreDTO>) service.findAll();
    }

    @GetMapping("/{id}")
    public GenreDTO getByID(@PathVariable long id){
        return service.getByID(id).get();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGenre(@PathVariable long id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
