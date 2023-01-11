package com.seyithandilek.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.seyithandilek.library.model.Author;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
	
	@Query("SELECT a FROM Author a WHERE a.name LIKE %?1%" + "OR a.description LIKE %?1%")
	 List<Author> findAll(String keyword);

}
