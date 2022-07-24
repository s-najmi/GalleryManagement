package ir.mapsa.galleryManagement.artwork;

import lombok.Data;

import java.util.Date;

@Data
public class ArtworkDTO {
    private long id;
    private String title;
    private Date productDate;
    private long price;
}
