package ar.com.compustack.gdlwebcamp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "attendees")
@Getter @Setter @ToString
public class Attendee 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String surname;
    private String email;

    @ManyToOne
    private Ticket ticket;

    
    public Attendee() {
    }

    public Attendee(Integer id, String name, String surname, String email, Ticket ticket) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.ticket = ticket;
    }
}
