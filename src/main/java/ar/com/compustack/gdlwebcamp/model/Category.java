package ar.com.compustack.gdlwebcamp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private List<CategoryEvent> events = new ArrayList<>();


    public Category() {
    }

    public Category(Integer id, String title, String icon){
        this.id = id;
        this.title = title;
        this.icon = icon;
    }
}
