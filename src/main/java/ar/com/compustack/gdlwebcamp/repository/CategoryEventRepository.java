package ar.com.compustack.gdlwebcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.compustack.gdlwebcamp.model.CategoryEvent;


@Repository
public interface CategoryEventRepository extends JpaRepository<CategoryEvent, Integer> {
    
}
