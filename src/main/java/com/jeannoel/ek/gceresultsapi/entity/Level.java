package com.jeannoel.ek.gceresultsapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Level {
    @Id
    @Column(name = "level_id")
    private Long levelId;

    /**
     * levelName: examination level concerned
     */
    @Column(name = "level_name")
    private String levelName;

    @ManyToMany
    @JoinTable(
            name = "level_student",
            joinColumns = @JoinColumn(name = "level_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private Set<Student> studentsInLevel;
}
