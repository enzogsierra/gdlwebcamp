package ar.com.compustack.gdlwebcamp.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "dates")
@Getter @Setter @ToString
public class Date 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime date;


    public Date() {

    }

    public Date(Integer id, LocalDateTime date) {
        this.id = id;
        this.date = date;
    }
}
