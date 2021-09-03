package com.jeannoel.ek.gceresultsapi.service;

import com.jeannoel.ek.gceresultsapi.entity.Result;

import java.util.List;

public interface ResultService {
    /**
     * definition for getting all results in the database
     * @return the list of results found
     */
    List<Result> getAllResults();

    List<Result> getAllResultsByCentreNumber(String centreNumber);

    List<Result> getAllResultsByCentreNumberAndPapersPassed(String centreNumber, String papersPassed);
}
