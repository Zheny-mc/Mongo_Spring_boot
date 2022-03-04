package com.codewithkris.Controller;

import com.codewithkris.Entity.Project;
import com.codewithkris.Entity.ProjectUpdatePayload;
import com.codewithkris.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/project")
public class BookController {
    @Autowired
    private ProjectService projectService;

    @GetMapping
    public Collection<Project> getProject() {
        return projectService.getProject();
    }

    @PostMapping
    public Project postProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }

    @GetMapping(value="/{id}")
    public Optional<Project> getProjectById(@PathVariable("id") int id) {
        return projectService.getProjectById(id);
    }

    @DeleteMapping(value="/{id}")
    public Optional<Project> deleteProjectById(@PathVariable("id") int id) {
        return projectService.deleteProjectById(id);
    }

    @PutMapping(value="/{id}")
    public Optional<Project> deleteProjectById(@PathVariable("id") int id, @RequestBody ProjectUpdatePayload
		    projectUpdatePayload) {
        return projectService.updateProjectById(id, projectUpdatePayload);
    }

}
