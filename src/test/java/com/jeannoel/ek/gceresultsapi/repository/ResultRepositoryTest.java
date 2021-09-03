package com.jeannoel.ek.gceresultsapi.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jeannoel.ek.gceresultsapi.entity.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class ResultRepositoryTest {
    @Autowired
    private ResultRepository resultRepository;
    private static final String jsonFile = "/home/kanye/IdeaProjects/SpringBoot/gce-results-api/src/main/java/com/jeannoel/ek/gceresultsapi/data/gce.json";

    @Test
    public void loadResults() {
        List<Result> results = jsonToResults();
        for (Result result : results) {
            resultRepository.save(result);
        }
    }

    private static List<Result> jsonToResults() {
        List<Result> results = null;
        try {
            ObjectMapper mapper = new ObjectMapper(); // create object mapper instance
            results = Arrays.asList(mapper.readValue(Paths.get(ResultRepositoryTest.jsonFile).toFile(), Result[].class)); // convert json array to list of Results
            // results.forEach(System.out::println); // print out results
        } catch (IOException e) {
            e.printStackTrace();
        } return results;
    }

}