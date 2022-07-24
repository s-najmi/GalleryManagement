package ir.mapsa.galleryManagement.user;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "tbl_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
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
    @Column(name = "password")
    private String password;

    @NotBlank
    @NotNull
    @Column(name = "token")
    private String token;

    @NotBlank
    @NotNull
    @Column(name = "expireDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expireDate;
}
