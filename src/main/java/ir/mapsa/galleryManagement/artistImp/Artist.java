package ir.mapsa.galleryManagement.artistImp;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "tbl_artist")
@Data
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artist_id")
    private long id;

    @NotBlank
    @NotNull
    @Column(name = "fullname")
    private String fullname;

    @NotBlank
    @NotNull
    @Column(name = "nationalcode")
    private String nationalCode;

    @NotBlank
    @NotNull
    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
}
