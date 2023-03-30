package ar.com.compustack.gdlwebcamp.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "tickets")
@Getter @Setter @ToString
public class Ticket 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Debes ingresar un precio")
    @NumberFormat(pattern = "#,###.##", style = Style.CURRENCY)
    @Min(value = 1, message = "El precio no puede ser menor a $1")
    private double price;

    @NotNull(message = "Debes ingresar una cantidad de días")
    @Min(value = 1, message = "La cantidad de días no puede ser menor a 1 día")
    private Integer nDates;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ticket_id", referencedColumnName = "id")
    private List<TicketBenefit> benefits = new ArrayList<>();


    public Ticket() {

    }

    public Ticket(Integer id, double price, Integer nDates, List<TicketBenefit> benefits) {
        this.id = id;
        this.price = price;
        this.nDates = nDates;
        this.benefits = benefits;
    }
}
