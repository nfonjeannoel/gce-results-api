package com.jeannoel.ek.gceresultsapi.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResultData {
    @JsonProperty("center_name")
    private String centreName;
    @JsonProperty("center_number")
    private String centreNumber;
    @JsonProperty("level")
    private String level;
    @JsonProperty("year")
    private String year;
    @JsonProperty("papers_passed")
    private String papersPassed;
    @JsonProperty("student_name")
    private String studentName;
    @JsonProperty("student_grades")
    private String studentGrades;


}
