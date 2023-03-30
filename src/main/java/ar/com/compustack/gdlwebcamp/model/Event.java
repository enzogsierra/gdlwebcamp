package ar.com.compustack.gdlwebcamp.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "events")
@Getter @Setter @ToString
public class Event 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 128)
    @Size(min = 3, max = 128, message = "El nombre del evento debe tener entre 3 y 128 caracteres")
    private String title;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Date date;

    private Time time;

    @ManyToOne
    private Guest guest;


    public Event() {

    }

    public Event(Integer id, String title, Category category, Date date, Guest guest) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.date = date;
        this.guest = guest;
    }
}
