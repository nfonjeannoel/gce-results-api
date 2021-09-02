package com.jeannoel.ek.gceresultsapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

/**
 * @author kanye
 * Student : entity representing the candidate in the examination.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Student {
    /**
     * studentId: the db key of each student.
     */
    @Id
    @Column(name = "student_id")
    private Long studentId;

    /**
     * studentName: name of student as is on the results document.
     */
    @Column(name = "student_name")
    private String studentName;

    /**
     * papers: number of papers passed by the student.
     */
    @Column(name = "papers")
    private Long papers;


    /**
     * Relationship to mapped from Centre entity
     */
    @ManyToMany(mappedBy = "students")
    private Set<Centre> centres;

    /**
     *
     */
    @ManyToMany
    @JoinTable(
            name = "student_wrote_in",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "year_id")
    )
    private Set<Year> yearsWrote;

    @ManyToMany
    @JoinTable(
            name = "student_is_in",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "level_id")
    )
    private Set<Level> studentLevels;
}
