package com.jeannoel.ek.gceresultsapi.repository;

import com.jeannoel.ek.gceresultsapi.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ResultRepository extends JpaRepository<Result, Long> {
    List<Result> findAllByCentreNumber(String centreNumber);

    List<Result> findAllByCentreNumberAndPapersPassed(String centreNumber, String papersPassed);
}
