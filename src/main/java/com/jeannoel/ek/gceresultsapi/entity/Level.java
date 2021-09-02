package com.jeannoel.ek.gceresultsapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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

    @ManyToMany(mappedBy = "studentLevels")
    private Set<Student> studentsInLevel;
}
