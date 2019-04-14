package com.projectJ.backend;

import com.projectJ.backend.dao.SkillDao;
import com.projectJ.backend.entities.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class Controller {

    @Autowired
    private SkillDao dao;

    @CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping("/fetchAll")
    private List<Skill> fetchAll() {
        return dao.findAll();
    }

    @CrossOrigin
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @CrossOrigin
    @PostMapping("/skills")
    public Skill save(@RequestBody Skill skill) {
        System.out.println(skill);
        dao.save(skill);
        return skill;
    }

    @CrossOrigin
    @DeleteMapping("/skills/{skillId}")
    public void deleteById(@PathVariable("skillId") Long id) {
        dao.deleteById(id);
        System.out.println(id);
    }

}
