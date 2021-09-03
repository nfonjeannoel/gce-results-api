package com.jeannoel.ek.gceresultsapi.service.impl;

import com.jeannoel.ek.gceresultsapi.entity.Result;
import com.jeannoel.ek.gceresultsapi.repository.ResultRepository;
import com.jeannoel.ek.gceresultsapi.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {
    private final ResultRepository resultRepository;

    @Autowired
    public ResultServiceImpl(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public List<Result> getAllResults() {
        // call the CrudRep method for finding all records for the Entity
        return resultRepository.findAll();
    }

    @Override
    public List<Result> getAllResultsByCentreNumber(String centreNumber) {
        return resultRepository.findAllByCentreNumber(centreNumber);
    }

    @Override
    public List<Result> getAllResultsByCentreNumberAndPapersPassed(String centreNumber, String papersPassed) {
        return resultRepository.findAllByCentreNumberAndPapersPassed(centreNumber, papersPassed);
    }

}
