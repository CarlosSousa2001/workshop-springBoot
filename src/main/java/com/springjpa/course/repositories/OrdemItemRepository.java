package com.springjpa.course.repositories;


import com.springjpa.course.entities.OrdemItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepository extends JpaRepository<OrdemItem, Long> {
}
