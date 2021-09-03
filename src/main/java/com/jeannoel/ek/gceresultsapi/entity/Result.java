package com.jeannoel.ek.gceresultsapi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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
