package ar.com.compustack.gdlwebcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.compustack.gdlwebcamp.model.CategoryEvent;


public interface CategoryEventRepository extends JpaRepository<CategoryEvent, Integer> {
    
}
