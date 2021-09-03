package com.jeannoel.ek.gceresultsapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Result {
    @Id
    private Long id;
    private String centreName;
    private String centreNumber;
    private String level;
    private String year;
    private String papersPassed;
    private String studentName;
    private String studentGrades;
}
