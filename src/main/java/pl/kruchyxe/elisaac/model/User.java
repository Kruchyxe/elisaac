package pl.kruchyxe.elisaac.model;

import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank
    @Size(min = 1, max = 50)
    @Column(name="first_name")
    private String firstName;

    @NotBlank
    @Size(min = 1, max = 50)
    @Column(name="last_name")
    private String lastName;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

}
