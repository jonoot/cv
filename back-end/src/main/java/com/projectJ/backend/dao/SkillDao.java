package com.projectJ.backend.dao;

import com.projectJ.backend.entities.Skill;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class SkillDao {


    @PersistenceContext
    private EntityManager em;

    public List<Skill> findAll() {
        return em.createQuery("select o from Skill o", Skill.class).getResultList();
    }

    @Transactional
    public void save(Skill skill) {
        if (skill.getId() != null) {
            em.merge(skill);
        } else {
            em.persist(skill);
        }
    }

    @Transactional
    public void deleteById(Long skillId) {
        em.createQuery("DELETE FROM Skill WHERE ID = " + skillId).executeUpdate();
    }

}
