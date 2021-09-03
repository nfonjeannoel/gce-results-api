package com.jeannoel.ek.gceresultsapi.repository;

import com.jeannoel.ek.gceresultsapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
