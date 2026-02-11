package com.assignment.alumni_searcher.repository;

import com.assignment.alumni_searcher.entity.Alumni;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumniRepository extends JpaRepository<Alumni, Long> {
}
