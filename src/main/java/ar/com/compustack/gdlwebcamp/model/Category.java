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
@Table(name = "categories")
@Getter @Setter @ToString
public class Category 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 64)
    @Size(min = 4, max = 64, message = "El título debe tener entre 4 y 64 caracteres")
    private String title;

    private String icon;


    public Category() {
    }

    public Category(Integer id, String title, String icon){
        this.id = id;
        this.title = title;
        this.icon = icon;
    }
}
