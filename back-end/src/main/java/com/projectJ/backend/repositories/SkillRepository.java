package com.projectJ.backend.repositories;

import com.projectJ.backend.entities.Skill;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SkillRepository extends CrudRepository<Skill, Long> {

    List<Skill> findAll();

}
