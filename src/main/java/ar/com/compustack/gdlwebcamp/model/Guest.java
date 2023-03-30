package ar.com.compustack.gdlwebcamp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "guests")
@Getter @Setter @ToString
public class Guest 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 64)
    @Size(min = 3, max = 64, message = "El nombre debe tener entre 3 y 64 caracteres")
    private String name;

    @Column(length = 64)
    @Size(min = 3, max = 64, message = "El apellido debe tener entre 3 y 64 caracteres")
    private String surname;

    @Column(length = 256)
    private String description;

    private String imgUrl;
}
