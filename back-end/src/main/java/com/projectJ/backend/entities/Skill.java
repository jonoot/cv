package com.projectJ.backend.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
    @SequenceGenerator(name = "my_seq", sequenceName = "seq1", allocationSize = 1)
    private Long id;

    private String skill;

    private int rating;

    private String skillComment;

}
