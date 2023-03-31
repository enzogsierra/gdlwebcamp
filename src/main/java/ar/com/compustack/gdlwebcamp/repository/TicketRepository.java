package ar.com.compustack.gdlwebcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.compustack.gdlwebcamp.model.Ticket;


public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    
}
