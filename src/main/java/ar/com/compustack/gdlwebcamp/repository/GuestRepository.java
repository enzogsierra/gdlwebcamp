package ar.com.compustack.gdlwebcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.compustack.gdlwebcamp.model.Guest;


public interface GuestRepository extends JpaRepository<Guest, Integer> {
    
}
