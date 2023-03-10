package com.seyithandilek.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.seyithandilek.library.model.Publisher;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

	@Query("SELECT p FROM Publisher p WHERE p.name LIKE %?1%"+" OR p.description LIKE %?1%" )
	 List<Publisher> findAll(String keyword);
}
