package ar.com.compustack.gdlwebcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.compustack.gdlwebcamp.model.Date;


public interface DateRepository extends JpaRepository<Date, Integer> {
    
}
