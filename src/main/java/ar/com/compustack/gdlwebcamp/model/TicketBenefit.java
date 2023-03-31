package ar.com.compustack.gdlwebcamp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "ticket_benefits")
@Getter @Setter @ToString
public class TicketBenefit 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Debes ingresar una lista de beneficios separados por un '.' (punto)")
    private String title;
}
