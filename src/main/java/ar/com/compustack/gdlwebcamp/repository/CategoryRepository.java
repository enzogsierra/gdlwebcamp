package ar.com.compustack.gdlwebcamp.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.compustack.gdlwebcamp.model.Category;


public interface CategoryRepository extends JpaRepository<Category, Integer> {
    
}
