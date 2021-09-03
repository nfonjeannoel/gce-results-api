package com.jeannoel.ek.gceresultsapi.data;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JsonToResult {
    public static void main (String[] args) {

        getResults();
    }


    public static List<ResultData> getResults() {
        List<ResultData> results = null;
        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            // convert json array to list of Results
            results = Arrays.asList(
                    mapper.readValue(Paths.get(
                            "/home/kanye/IdeaProjects/SpringBoot/gce-results-api/src/main/java/com/jeannoel/ek/gceresultsapi/data/gce.json"
                    ).toFile(), ResultData[].class)
            );

            results.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return results;
    }
}
