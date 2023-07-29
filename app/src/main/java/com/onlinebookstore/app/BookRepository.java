package com.onlinebookstore.app;

import org.springframework.data.jpa.repository.*;

public interface BookRepository extends JpaRepository<Book, Long> {
	// Customs queries
}