package ir.mapsa.galleryManagement.artistImp;

import lombok.Data;

import java.util.Date;

@Data
public class ArtistDTO {
    private long id;
    private String fullname;
    private String nationalCode;
    private Date birthDate;
}
