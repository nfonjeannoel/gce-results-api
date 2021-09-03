package com.jeannoel.ek.gceresultsapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

/**
 * @author kanye
 * Year: entity representing the year concerned with the examination
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Year {
    @Id
    @Column(name = "year_id")
    private Long yearId;

    /**
     * yearValue: actual year concerned
     */
    @Column(name = "year_value")
    private String yearValue;

    @ManyToMany()
    @JoinTable(
            name = "year_student",
            joinColumns = @JoinColumn(name = "year_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private Set<Student> studentsWhoWrote;
}
