package ir.mapsa.galleryManagement.genreImp;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-24T16:34:32+0430",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class IGenreMapperImpl implements IGenreMapper {

    @Override
    public Genre toEntity(GenreDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Genre genre = new Genre();

        genre.setId( dto.getId() );
        genre.setTitle( dto.getTitle() );

        return genre;
    }

    @Override
    public GenreDTO toDTO(Genre entity) {
        if ( entity == null ) {
            return null;
        }

        GenreDTO genreDTO = new GenreDTO();

        genreDTO.setId( entity.getId() );
        genreDTO.setTitle( entity.getTitle() );

        return genreDTO;
    }

    @Override
    public List<GenreDTO> toDTOs(List<Genre> entities) {
        if ( entities == null ) {
            return null;
        }

        List<GenreDTO> list = new ArrayList<GenreDTO>( entities.size() );
        for ( Genre genre : entities ) {
            list.add( toDTO( genre ) );
        }

        return list;
    }
}
