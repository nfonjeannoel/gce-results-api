package com.jeannoel.ek.gceresultsapi.controller;

import com.jeannoel.ek.gceresultsapi.entity.Result;
import com.jeannoel.ek.gceresultsapi.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "result")
public class ResultController {

    private final ResultService resultService;

    @Autowired
    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    /**
     * Handles the request for getting all results collected in the database
     * @return list of Result objects found
     */
    @GetMapping(value = "all")
    public List<Result> getAll() {
        return resultService.getAllResults();
    }


    @GetMapping(value = "/{centre_number}")
    public List<Result> getAllByCentreNumber(@PathVariable(name = "centre_number") String centreNumber) {
        return resultService.getAllResultsByCentreNumber(centreNumber);
    }

    @GetMapping(value = "/{centre_number}/{papers_passed}")
    public List<Result> getAllByCentreNumberAndPapersPassed(
            @PathVariable(name = "centre_number") String centreNumber,
            @PathVariable(name = "papers_passed") String papersPassed
    ) {
        return resultService.getAllResultsByCentreNumberAndPapersPassed(centreNumber, papersPassed);
    }
}
