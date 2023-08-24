package com.springjpa.course.repositories;

import com.springjpa.course.entities.Category;
import com.springjpa.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
